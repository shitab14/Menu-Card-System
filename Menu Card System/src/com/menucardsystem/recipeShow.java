package com.menucardsystem;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class recipeShow {
	
	JTable recipe_table;
	JScrollPane jScrollPane;
	JButton Add,Delete,Modify;
	int row,column;
	
	public recipeShow(){
		Container c1=new Container();
		//row= from database
		//column= from database
		recipe_table =new JTable(row, column);
		jScrollPane=new JScrollPane(recipe_table);
		
		Add=new JButton("Add");
		Delete=new JButton("Delete");
		Modify=new JButton("Modify");
		
		c1.add(jScrollPane,"North");
		c1.add(Add);c1.add(Delete);c1.add(Modify);
		
		
	}

}
