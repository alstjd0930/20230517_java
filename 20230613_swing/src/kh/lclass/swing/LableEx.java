package kh.lclass.swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LableEx extends JFrame{
	public LableEx() {
		setTitle("예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("사랑하비낟");
		ImageIcon beauty = new ImageIcon("");
	}
}
