package com.menucardsystem;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;

public class menucard extends JFrame implements ActionListener {
	
	
		
	JLabel l1,l2, l3, l4;
	static JTextField t1;
	JPasswordField t2;
	JTextField t3;
	JButton b1, b2;
	static JMenuBar bar;
	static JMenu menu1;
	static JMenu menu2;
	static JMenu menu3;
	static JMenuItem item1[];
	static JMenuItem item2[];
	static JMenuItem item3[];
	JPanel panel_menubar,panel_header, panel_login;
	ImageIcon logo;
	

		String m1[]={"Sign In as ADMIN", "Sign In as GUEST", "Quit"};
		String m2[]={"Add Reciepie","Delete Reciepie","Modify Reciepie"};
		String m3[]={"Contact Info ","Developer Info "};
		{
		bar=new JMenuBar();
		menu1 = new JMenu("Sign In");
		menu2 = new JMenu("Edit");
		menu3 = new JMenu("Source");
		
		item1= new JMenuItem[3];
		
		for(int i1=0; i1<=2; i1++){
			item1[i1]= new JMenuItem(m1[i1]);
			menu1.add(item1[i1]);
		}
		
		item2= new JMenuItem[3];
		
		for(int i2=0; i2<=2; i2++){
			item2[i2]= new JMenuItem(m2[i2]);
			menu2.add(item2[i2]);
		}
		
		item3= new JMenuItem[2];
		
		for(int i=0; i<=1; i++){
			item3[i]= new JMenuItem(m3[i]);
			menu3.add(item3[i]);
		}
		}

	
	public menucard(){
		
		
		
		setTitle("Fake Resturant");
		setLocation(30,30);
		
		setContentPane(new JLabel(new ImageIcon(getClass().getResource("background.jpg"))));  // set background
		
		
		setLayout(new FlowLayout());
	    logo=new ImageIcon("logo.png");
		
	    panel_menubar=new JPanel();
	    panel_menubar.setOpaque(true);
	    
	    panel_header=new JPanel();
	    panel_header.setOpaque(false); // transparent Background
		
		panel_login=new JPanel();
		panel_login.setBorder(UIManager.getBorder("RadioButton.border"));
		panel_login.setBackground(Color.WHITE);
		panel_login.setOpaque(false);   // transparent Background
	    
		bar.setSize(5000, 25);
		add(bar);
		bar.add(menu1); // Sign In
		bar.add(menu2); // Add
		bar.add(menu3); // Source
	    
		l1=new JLabel("LOGIN \n ");
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		l1.setForeground(Color.WHITE);
		l2=new JLabel("\n Username:  ");
		l2.setForeground(Color.WHITE);
		l3=new JLabel("\n Password: " );
		l3.setForeground(Color.WHITE);
		l4=new JLabel("Don't have an account??? \n Sign up here ");
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		
		t1=new JTextField(30);
		t2=new JPasswordField(30);
		
		b1=new JButton(" Login ");
		b2=new JButton(" Sign up ");
		
		
		
		add(new JLabel());  // line space
		
		
		
		getContentPane().add(panel_header);
		getContentPane().add(panel_login);
		
		panel_header.add(new JLabel(logo));
		panel_header.add(new JLabel());  // line space
		panel_header.add(l1); // LOGIN
		panel_header.add(new JLabel());  // line space
		
		panel_login.add(l2); // User name:
		panel_login.add(t1); // user name text field
		panel_login.add(l3); // Password
		panel_login.add(t2); // password text field
		panel_login.add(b1); // Login button
		
		getContentPane().add(l4);
		add(new JLabel());  // line space
		getContentPane().add(b2);  // register button
		

		setVisible(true);
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		
		b1.addActionListener(this);   // perform on button press
		b2.addActionListener(this);   // perform on button press
		
		//bar.menu1[1].addActionListener(this);
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/menudatabase","root","");
			Statement st= con.createStatement();
			ResultSet rs=st.executeQuery("SELECT user_column_name FROM table_name");
			
			
		
		
		if(e.getActionCommand().equals(" Login ")){ // checks whether Login button is clicked
			
			if(rs.getString("username_column").equals(t1.getText())){
				
				if(rs.getString("password_column").equals(t2.getPassword())){
					
					
					
				}
				
			}
			
			
		}
		if(e.getActionCommand().equals(" Sign up ")){ // checks whether Register button is clicked
			
			new register();
		}
		
		}
		catch(Exception a){
			
		}
		
	}
	
	
	public static void main(String[]args){
		
		 
		
		new menucard();
	}
	
	

}
