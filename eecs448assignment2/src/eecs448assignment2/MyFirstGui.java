/*
 * Dustin Horvath
 * MyFirstGui.java
 * EECS 448 Javax swing program. Adds two user input numbers, accepts ints and
 * doubles, catches input errors on non-numeric input.
 * 
 * If you want a date, check the commit history. I'm not hard-coding it here.
 */

package eecs448assignment2;

import java.lang.Exception;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyFirstGui extends JFrame{
	private static final long serialVersionUID = 1L;	
	
	JButton button1 = new JButton("Add");
	private JLabel leftLabel;
	private JPanel mainPanel, bottomRightPanel, bottomLeftPanel, topLeftPanel, topRightPanel;
	private JTextField input1 = new JTextField("");
	private JTextField input2 = new JTextField("");
	private String display = "Your result will appear here";
	private JTextField displayField = new JTextField(display);
	
	private double input1value;
	private double input2value;
	
	private Listener listen = new Listener();
	
	
	public MyFirstGui(String title){
		super(title);
		setSize(500,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		leftLabel = new JLabel("Input two numbers.");
		mainPanel = new JPanel();
		bottomLeftPanel = new JPanel();
		bottomRightPanel = new JPanel();
		topLeftPanel = new JPanel();
		topRightPanel = new JPanel();
		
		//ASSEMBLE THE 4 PANELS
		topLeftPanel.add(leftLabel);
		
		topRightPanel.setLayout(new GridLayout(2,1));
		topRightPanel.add(input1);
		topRightPanel.add(input2);
		
		bottomLeftPanel.add(displayField);
		bottomRightPanel.add(button1);
		
		
		
		//ASSEMBLE MAIN PANEL
		mainPanel.setLayout(new GridLayout(2,2));
		
		mainPanel.add(topLeftPanel);
		mainPanel.add(topRightPanel);
		mainPanel.add(bottomLeftPanel);
		mainPanel.add(bottomRightPanel);
		
		
		//ADD MAIN PANEL TO MAIN FRAME
		this.add(mainPanel);
		
		//ADD ACTION LISTENER TO BUTTON
		button1.addActionListener(listen);
	}

	public class Listener extends JFrame implements ActionListener, ItemListener {
		private static final long serialVersionUID = 1L;
		
		public void actionPerformed(ActionEvent e) {
			// Checks if the action originated from a JButton object. If I had more buttons this would be problematic,
			//  but it works because there aren't any other buttons it could be.
			if(e.getSource().getClass().getName().equals("javax.swing.JButton")) {
				
				// TRY TO PARSE USER INPUT INTO DOUBLES. /CROSSFINGERS
				try{
					input1value = Double.parseDouble(input1.getText());
					input2value = Double.parseDouble(input2.getText());
					display = Double.toString(input1value + input2value);
					System.out.println(display);
				}
				// CATCH EXCEPTIONS HERE WHEN THE USER TAKES A POOP IN YOUR INPUT FIELD
				catch(Exception exception){
					display = "Invalid input. Please provide numbers as inputs.";
					System.out.println("Invalid input. Please provide numbers as inputs.");
				}
				
				// REDRAW THE MAIN PANEL WITH NEW VALUES.
				displayField.setText(display);
				mainPanel.revalidate();
				mainPanel.repaint();
				
			}
		}
		
		public void itemStateChanged(ItemEvent e){
			System.out.println("itemStateChanged");
		}

		

		
	}
}


