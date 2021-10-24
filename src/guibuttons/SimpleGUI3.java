package guibuttons;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleGUI3 {

	public static void main(String[] args) {
		SimpleGUI3 gui = new SimpleGUI3();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);

		JButton button = new JButton("shock me");
		JButton buttonTwo = new JButton("bliss");
		JButton buttonThree = new JButton("huh?");
		panel.add(button);
		panel.add(buttonTwo);
		panel.add(buttonThree);
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setSize(250, 200);
		frame.setVisible(true);
	}
}
