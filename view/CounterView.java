package view;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.accessibility.AccessibleRelationSet;
import javax.swing.*;

import controller.CounterListnerController;
import model.CounterModel;

public class CounterView extends JFrame {
	private CounterModel counterModel;
	private JButton upButton, downButton, resetButton;
	private JLabel textCounter, noticate;

	public CounterView() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			this.init();

			counterModel = new CounterModel();
			ActionListener ac = new CounterListnerController(this);

			upButton = new JButton("Up");
			upButton.addActionListener(ac);
			this.add(upButton, BorderLayout.WEST);

			textCounter = new JLabel(counterModel.getValue() + "", JLabel.CENTER);
			this.add(textCounter, BorderLayout.CENTER);

			downButton = new JButton("Down");
			downButton.addActionListener(ac);
			this.add(downButton, BorderLayout.EAST);
			
			resetButton = new JButton("Reset");
			resetButton.addActionListener(ac);
			this.add(resetButton, BorderLayout.SOUTH);
			
			noticate = new JLabel("", JLabel.CENTER);
			noticate.setFont(new Font("Arial", Font.BOLD, 20));
			this.add(noticate, BorderLayout.NORTH);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		this.setVisible(true);
	}

	public void increment() {
		counterModel.increment();
		textCounter.setText(counterModel.getValue() + "");
		noticate.setText("Đã tăng lên 1 đơn vị");
	}

	public void decrement() {
		counterModel.decrement();
		textCounter.setText(counterModel.getValue() + "");
		noticate.setText("Đã giảm đi 1 đơn vị");
	}
	
	public void reset() {
		counterModel.reset();
		textCounter.setText(counterModel.getValue() + "");
		noticate.setText("Đã reset về 0");
	}

	private void init() {
		this.setTitle("My Counter");
		Image icon = Toolkit.getDefaultToolkit().getImage("src/images/favicon.png");
		this.setIconImage(icon);
		this.setSize(500, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

		this.setLayout(new BorderLayout());

	}
}
