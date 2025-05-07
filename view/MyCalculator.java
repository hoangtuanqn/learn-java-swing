package view;

import java.awt.*;
import javax.swing.*;

public class MyCalculator extends JFrame {
	public MyCalculator() {
		this.setTitle("My Calculator");
		Image icon = Toolkit.getDefaultToolkit().getImage("src/images/favicon.png");
		this.setIconImage(icon);
		this.setSize(400, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		
		JTextField jTextField = new JTextField();
		
		JPanel panel_head = new JPanel();
		panel_head.setLayout(new BorderLayout());
		panel_head.add(jTextField, BorderLayout.CENTER);
		
		
		JButton jButton_0 = new JButton("0");
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		JButton jButton_4 = new JButton("4");
		JButton jButton_5 = new JButton("5");
		JButton jButton_6 = new JButton("6");
		JButton jButton_7 = new JButton("7");
		JButton jButton_8 = new JButton("8");
		JButton jButton_9 = new JButton("9");
		JButton jButton_addition = new JButton("+");
		JButton jButton_subtraction = new JButton("-");
		JButton jButton_multiplication = new JButton("*");
		JButton jButton_division = new JButton("/");
		JButton jButton_equal = new JButton("=");
		
		
		JPanel panel_buttons = new JPanel();
		panel_buttons.setLayout(new GridLayout(5, 3));
		
		panel_buttons.add(jButton_0);
		panel_buttons.add(jButton_1);
		panel_buttons.add(jButton_2);
		panel_buttons.add(jButton_3);
		panel_buttons.add(jButton_4);
		panel_buttons.add(jButton_5);
		panel_buttons.add(jButton_6);
		panel_buttons.add(jButton_7);
		panel_buttons.add(jButton_8);
		panel_buttons.add(jButton_9);
		panel_buttons.add(jButton_addition);
		panel_buttons.add(jButton_subtraction);
		panel_buttons.add(jButton_multiplication);
		panel_buttons.add(jButton_division);
		panel_buttons.add(jButton_equal);
		
		
		this.setLayout(new BorderLayout());
		this.add(panel_head, BorderLayout.NORTH);
		this.add(panel_buttons, BorderLayout.CENTER);
		
		
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		try {
			 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MyCalculator();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
