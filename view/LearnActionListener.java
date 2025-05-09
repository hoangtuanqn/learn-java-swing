package view;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class LearnActionListener extends JFrame {
	public LearnActionListener() {
		this.setTitle("My Calculator");
		Image icon = Toolkit.getDefaultToolkit().getImage("src/images/favicon.png");
		this.setIconImage(icon);
		this.setSize(350, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		
		
		
		
		
		
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
