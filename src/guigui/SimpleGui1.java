package guigui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGui1 implements ActionListener {
	JButton button;

	public static void main(String[] args) {
		SimpleGui1 gui = new SimpleGui1();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("click me");

		button.addActionListener(this);

		frame.getContentPane().add(button);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(100, 100);

		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent event) {
		button.setText("i've been clicked");
	}
}
