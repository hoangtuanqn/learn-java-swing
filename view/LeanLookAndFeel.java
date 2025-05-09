package view;

import java.awt.*;
import javax.swing.*;

public class LeanLookAndFeel {
	public LeanLookAndFeel() {
		JFrame frame = new JFrame();
		frame.setTitle("L&F");
		frame.setSize(350, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(new BorderLayout());

//		Text Feild
		JTextField text = new JTextField();

		frame.add(text, BorderLayout.NORTH);

		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(5, 3));

		char[] lists = { '+', '-', '*', '/', '=' };
		for (int i = 0; i <= 9; ++i) {
			panel1.add(new JButton(i + ""));
		}
		for (char list : lists) {
			panel1.add(new JButton(list + ""));
		}
		frame.add(panel1, BorderLayout.CENTER);

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	// Look and Feel

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//				if ("Nimbus".equals(info.getName())) {
//					System.out.println(info.getClassName());
//					break;
//				}
//			}

			new LeanLookAndFeel();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
