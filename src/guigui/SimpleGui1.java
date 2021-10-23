package guigui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//** we implement the ActionListener interface to work with the events
public class SimpleGui1 implements ActionListener {
	JButton button;
	JButton button2;

	public static void main(String[] args) {
		SimpleGui1 gui = new SimpleGui1();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("click me");
		button2 = new JButton("don't click me");
		button.addActionListener(this);
		// button2.addActionListener(this);

		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.getContentPane().add(BorderLayout.SOUTH, button2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(100, 100);

		frame.setVisible(true);

	}

//** event handling method 
	public void actionPerformed(ActionEvent event) {
		button.setText("i've been clicked");
		// button2.setText("i am worth nothing");
	}
}
