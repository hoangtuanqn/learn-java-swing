package view;

public class ViDu {
	public static void main(String[] args) {
//		JFrame jf = new JFrame();
//		jf.setTitle("Ví dụ về JFrameff");
//		jf.setSize(600, 400);
//		jf.setLocation(500, 500);
//		
//		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		jf.setVisible(true);
		MyWindow m1 = new MyWindow();
		m1.showIt("Ứng dụng của Tuấn 1", 500, 500);
		
		MyWindow m2 = new MyWindow();
		m2.showIt("Ứng dụng của Tuấn 2", 500, 500);
		
		MyWindow m3 = new MyWindow();
		m3.showIt("Ứng dụng của Tuấn 3", 500, 500);
		
		MyWindow m4 = new MyWindow();
		m4.showIt("Ứng dụng của Tuấn 4", 500, 500);
	}
}
