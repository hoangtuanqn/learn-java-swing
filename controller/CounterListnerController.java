package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CounterModel;
import view.CounterView;

public class CounterListnerController implements ActionListener {
	private CounterView cv;

	public CounterListnerController(CounterView cv) {
		this.cv = cv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		switch (action) {
		case "Up" -> cv.increment();
		case "Down" -> cv.decrement();
		case "Reset" -> cv.reset();
		}

		// TODO Auto-generated method stub

	}
}
