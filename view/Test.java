package view;

import java.awt.*;
import javax.swing.*;

public class Test {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("Test chương trình");
		jf.setSize(600, 600);
		jf.setLayout(new FlowLayout());
		JButton bt = new JButton("Register");
		bt.setPreferredSize(new Dimension(100, 30));
		jf.add(bt);
		
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
}
