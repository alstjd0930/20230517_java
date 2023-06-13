package kh.lclass.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestSwing extends JFrame{
	public TestSwing() {
		setTitle("hello window 프레임");
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//x버튼으로 resouce 정리 및 창닫기
		
		Container contentPane = getContentPane();
		//contentPane.setLayout(new FlowLayout(FlowLayout.LEADING, 5,5));	//자연스럽게 버튼 정렬
		
		
//		contentPane.setLayout(new BorderLayout(20,30));
//		
//		contentPane.add(new JButton("ok"),BorderLayout.NORTH);
//		contentPane.add(new JButton("cancel"),BorderLayout.WEST);
//		contentPane.add(new JButton("ignore"),BorderLayout.EAST);
//		contentPane.add(new JButton("ignore1"),BorderLayout.CENTER);
//		
		contentPane.setLayout(new GridLayout(5,2,10,10));
		JTextField txtName = new JTextField();
		JTextField txtName1 = new JTextField();
		JTextField txtName2 = new JTextField();
		JTextField txtName3 = new JTextField();
		
		contentPane.add(new JLabel("이름"));
		contentPane.add(txtName);
		contentPane.add(new JLabel("학번"));
		contentPane.add(txtName1);
		contentPane.add(new JLabel("학과"));
		contentPane.add(txtName2);
		contentPane.add(new JLabel("과목"));
		contentPane.add(txtName3);
		
		JButton btnSave = new JButton("저장");
		contentPane.add(btnSave);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		TestSwing frame = new TestSwing();
	}
}
