package gui;
import javax.swing.*;

public class window {

	public static void main (String[] args ) {
		
		JFrame frame = new JFrame() ;
		frame.setSize(100, 100);
		JButton btn = new JButton("click me !");
		btn.setBounds(50, 50,100, 50);
		frame.setLayout(null);
		frame.add(btn);
		frame.setVisible(true);
		
	}
}
