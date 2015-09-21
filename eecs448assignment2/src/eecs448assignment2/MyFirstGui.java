package eecs448assignment2;

//import javafx.scene.layout.Pane;
import java.lang.Exception;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyFirstGui extends JFrame{
	
	JButton button1 = new JButton("Add");
	private JLabel leftLabel;
	private JPanel mainPanel, topPanel, bottomRightPanel, bottomLeftPanel, topLeftPanel, topRightPanel;
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
		topPanel = new JPanel();
		bottomLeftPanel = new JPanel();
		bottomRightPanel = new JPanel();
		topLeftPanel = new JPanel();
		topRightPanel = new JPanel();
		
		topLeftPanel.add(leftLabel);
		
		topRightPanel.setLayout(new GridLayout(2,1));
		topRightPanel.add(input1);
		topRightPanel.add(input2);
		
		bottomLeftPanel.add(displayField);
		bottomRightPanel.add(button1);
		
		mainPanel.setLayout(new GridLayout(2,2));
		
		mainPanel.add(topLeftPanel);
		mainPanel.add(topRightPanel);
		mainPanel.add(bottomLeftPanel);
		mainPanel.add(bottomRightPanel);
		
		
		
		this.add(mainPanel);
		
		mainPanel.setSize(30, 100);
		
		
		
		button1.addActionListener(listen);
	}

	public class Listener extends JFrame implements ActionListener, ItemListener {
		
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().getClass().getName().equals("javax.swing.JButton")) {
				try{
					input1value = Double.parseDouble(input1.getText());
					input2value = Double.parseDouble(input2.getText());
					display = Double.toString(input1value + input2value);
					System.out.println(display);
					
				}
				catch(Exception exception){
					display = "Invalid input. Please provide numbers as inputs.";
					System.out.println("Invalid input. Please provide numbers as inputs.");
				}
				displayField.setText(display);
				mainPanel.revalidate();
				mainPanel.repaint();
			}
		}
		
		public void itemStateChanged(ItemEvent e){
			
		}

		

		
	}
}


