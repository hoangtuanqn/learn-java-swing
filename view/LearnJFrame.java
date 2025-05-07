package view;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class LearnJFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		// Set tiêu đề
		frame.setTitle("TUANORI.VN - SHOP ACC GAME V1");
		
		// Set hình ảnh đại diện cho Frame
		Image icon = Toolkit.getDefaultToolkit().getImage("src/images/favicon.png");
		frame.setIconImage(icon);
		
		// Set vị trí hiển thị so với góc trên cùng màn hình bên trái
		// frame.setLocation(1000, 400); // Tạm thời ẩn đi do đã dùng frame.setLocationRelativeTo(null); rồi
		
		// Set kích thước
		frame.setSize(600, 400);
		
		// frame.setBounds(1000, 200, 600, 400);  Tương đương 2 câu lệnh trên => setLocation(x, y) + setSize(w, h)
		
		// Cho phép thay đổi kích thước hay k
		frame.setResizable(true);
		
		// Set hành vi mặc địnhh
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		frame.setLocationRelativeTo(null);
		
		// Hiển thị sau khi đã cấu hình xong
		frame.setVisible(true);
		
	}
}
