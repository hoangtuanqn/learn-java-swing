package view;

import java.awt.*;
import javax.swing.*;

public class LearnGirdBagLayout {
	public static void main(String[] args) {
		JFrame frame = new JFrame("GridBagLayout Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);

		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		// Nút 1: tọa độ (0, 0)
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(5, 5, 5, 5); // padding
		panel.add(new JButton("Nút 1"), gbc);
		
		// Nút 2: tọa độ (1, 0)
		gbc.gridx = 1;
		gbc.gridy = 0;
		panel.add(new JButton("Nút 2"), gbc);

		// Nút 3: tọa độ (0, 1), chiếm 2 cột
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		panel.add(new JButton("Nút dài"), gbc);

		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
