package view;

import java.awt.*;
import javax.swing.*;


public class LearnJLabel {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setTitle("TUANORI.VN - SHOP ACC GAME V1");
		Image icon = Toolkit.getDefaultToolkit().getImage("src/images/favicon.png");
		frame.setIconImage(icon);
//		frame.setSize(800, 400);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		
//		JLabel label = new JLabel("Xin chao anh em nhe", new ImageIcon("src/images/favicon.png"), JLabel.CENTER);
		
		JLabel label = new JLabel("PHẦN MỀM ĐƯỢC PHÁT TRIỂN BỞI TUANORI.VN", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 16));
		label.setForeground(Color.RED);
		frame.add(label, BorderLayout.CENTER);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
