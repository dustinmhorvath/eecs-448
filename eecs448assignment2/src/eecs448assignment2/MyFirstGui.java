package eecs448assignment2;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MyFirstGui extends JFrame{
	
	JButton button1 = new JButton("Add");
	
	public MyFirstGui(String title){
		super(title);
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		button1.addActionListener(this);
	
	}


	

	
	
}
