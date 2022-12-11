package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts2 extends JFrame {
	
	public Layouts2() {
		super("Layout");
		
		
		Container c = getContentPane();
		
		
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4,1));
		c.setLayout(new BorderLayout());
		
		
		c2.add(new JButton("Ok"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup"));
		c2.add(new JButton("Help"));
		
		c.add(BorderLayout.CENTER, new JButton("Center"));
		c.add(BorderLayout.EAST, c2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
		
		/*
		c.setLayout(new BorderLayout(5,5 ));
		c.add(BorderLayout.NORTH, new JButton("N"));
		c.add(BorderLayout.SOUTH, new JButton ("S"));
		c.add(BorderLayout.CENTER, new JButton ("C"));
		c.add(BorderLayout.EAST, new JButton ("L"));
		c.add(BorderLayout.WEST, new JButton ("O"));
		
		
		c.setLayout(new GridLayout(2,3));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		*/
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		new Layouts2();
		
	}

}
