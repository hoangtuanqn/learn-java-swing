package view;

import java.awt.*;
import javax.swing.*;

public class MyCalculator extends JFrame {
	public MyCalculator() {
		this.setTitle("My Calculator");
		Image icon = Toolkit.getDefaultToolkit().getImage("src/images/favicon.png");
		this.setIconImage(icon);
		this.setSize(350, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		
//		Text Feild
		JTextField text = new JTextField();
		text.set
		this.add(text, BorderLayout.NORTH);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(5, 3));
		
		char[] lists = {'+', '-', '*', '/', '='};
		for(int i = 0; i <= 9; ++i) {
			panel1.add(new JButton(i + ""));
		}
		for(char list : lists) {
			panel1.add(new JButton(list + ""));
		}
		this.add(panel1, BorderLayout.CENTER);
		
		
		
		
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
