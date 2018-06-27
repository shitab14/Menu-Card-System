package com.menucardsystem;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class register {
	
	JLabel lab1,lab2,lab3,lab4;
	static JTextField field1,field2,field3,field4;
	JPasswordField pass1;
	JButton b;
	
	public register(){
		
		lab1=new JLabel("Name :");
		lab2=new JLabel("Mail Id :");
		lab3=new JLabel("Password :");
		
		field1=new JTextField();
		field2=new JTextField(".com");
		pass1=new JPasswordField();
		
		b=new JButton(" Register ");
		
		Container c=new Container();
		c.setBackground(Color.darkGray);
		c.setForeground(Color.lightGray);
		
		
		c.setLayout(new FlowLayout());
		c.add(lab1); c.add(field1);
		c.add(lab2); c.add(field2);
		c.add(lab3); c.add(pass1);
		c.add(b);
		
		
		
		//b.addActionListener(this);   // perform on button press
		
	}
	
	public void actionPerformed(ActionEvent e1) {
		
	}

}
