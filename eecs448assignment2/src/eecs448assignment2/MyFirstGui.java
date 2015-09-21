package eecs448assignment2;

import javafx.scene.layout.Pane;
import java.lang.Exception;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyFirstGui extends JFrame{
	
	JButton button1 = new JButton("Add");
	public JLabel topLabel;
	public JPanel textPanel;
	public JTextField input1 = new JTextField("");
	public JTextField input2 = new JTextField("");
	private String display = "Your result will appear here";
	private JTextField displayField = new JTextField(display);
	
	double input1value;
	double input2value;
	
	private Listener listen = new Listener();
	
	public String text1 = input1.getText();
	public String text2 = input2.getText();
	
	public MyFirstGui(String title){
		super(title);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		topLabel = new JLabel("Input two numbers and press the button to display their sum.");
		textPanel = new JPanel();
		textPanel.add(topLabel);
		this.add(textPanel);
		
		
		textPanel.setLayout(new GridLayout(5,1));
		textPanel.setSize(30, 100);
		
		textPanel.add(input1);
		textPanel.add(input2);
		textPanel.add(button1);
		textPanel.add(displayField);
		
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
				textPanel.revalidate();
				textPanel.repaint();
			}
		}
		
		public void itemStateChanged(ItemEvent e){
			
		}

		

		
	}
}


