package view;

import java.awt.*;
import javax.swing.*;

public class LearnLayout {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setTitle("TUANORI.VN - SHOP ACC GAME V1");
		Image icon = Toolkit.getDefaultToolkit().getImage("src/images/favicon.png");
		frame.setIconImage(icon);
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		// FlowLayout
//		FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 10, 10);
//		frame.setLayout(flowLayout);
//		
//		JButton register_1 = new JButton("Register 1");
//		JButton register_2 = new JButton("Register 2");
//		JButton register_3 = new JButton("Register 3");
//		JButton register_4 = new JButton("Register 4");
//		frame.add(register_1);
//		frame.add(register_2);
//		frame.add(register_3);
//		frame.add(register_4);

		// GridLayout
//		GridLayout gridLayout = new GridLayout(4, 4);
//		frame.setLayout(gridLayout);
//		
//		for(int i = 1; i <= 20; ++i) {
//			frame.add(new JButton(i + ""));
//		}

//		// Border Layout
//		BorderLayout borderLayout = new BorderLayout(4, 4);
//		frame.setLayout(borderLayout);
//		JButton register_1 = new JButton("Register 1");
//		JButton register_2 = new JButton("Register 2");
//		JButton register_3 = new JButton("Register 3");
//		JButton register_4 = new JButton("Register 4");
//		JButton register_5 = new JButton("Register 5");
//		frame.add(register_1, BorderLayout.NORTH);
//		frame.add(register_2, BorderLayout.EAST);
//		frame.add(register_3, BorderLayout.SOUTH);
//		frame.add(register_4, BorderLayout.WEST);
//		frame.add(register_5, BorderLayout.CENTER);
		
		// BoxLayout
//		JPanel panel = new JPanel();
//		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
//		
//		panel.add(Box.createHorizontalGlue());
//		panel.add(new JButton("Nút 1"));
//		panel.add(Box.createHorizontalStrut(10)); // khoảng cách 10px
//		panel.add(new JButton("Nút 2"));
//		panel.add(Box.createHorizontalStrut(10)); // khoảng cách 10px
//		panel.add(new JButton("Nút 3"));
//		panel.add(Box.createHorizontalGlue());

//		frame.add(panel);

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
