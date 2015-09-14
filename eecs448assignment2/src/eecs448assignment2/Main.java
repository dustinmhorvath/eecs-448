package eecs448assignment2;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;



public class Main {
	
	

	public static void main(String[] args) {
		
		MyFirstGui frame = new MyFirstGui("TestFrame");

		
		JLabel label = new JLabel("Label Text");
		JPanel panel = new JPanel();
		JTextField text = new JTextField("Some test text");
		
		panel.add(label);
		//panel.add(text);
		panel.add(frame.button1);
		
		

		//frame.pack();
		
	}
	
	

}
