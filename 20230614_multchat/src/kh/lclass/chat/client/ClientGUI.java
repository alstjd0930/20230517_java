package kh.lclass.chat.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGUI extends JFrame implements ActionListener{

	private static final long serialVersionUID = -5930472044191273699L;
	
	private JTextArea jta1 = new JTextArea(40,25);
	private JTextField jtf1 = new JTextField(25);
	private String nickname;
	private ClientBackground cb =new ClientBackground(); //채팅socket기능을 담당할 객체
	
	public ClientGUI(String nickname) {
		this.nickname = nickname;
		cb.setNickname(nickname);
		
	
		
		setBounds(200, 100, 400, 600);
		setTitle(nickname+"님 창");
		jta1.setEditable(false);
		jta1.setFont(new Font("맑은고딕",Font.PLAIN,18));
		jta1.setBackground(new Color(230,255,230));
		
		add(jta1, BorderLayout.CENTER);
		add(jtf1, BorderLayout.SOUTH);
		jtf1.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		cb.setGui(this);
		cb.connection();
	}
	public void appenMsg(String msg) {
		//jta(채팅창)에 msg를 추가 
		jta1.append(msg);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = jtf1.getText();
		System.out.println(msg+"\n");
		jtf1.setText(""); 
		//server에 전달하기위해 background에 전달
		cb.sendMessage(msg);
	}
}
