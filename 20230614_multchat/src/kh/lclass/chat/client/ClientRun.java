package kh.lclass.chat.client;

import javax.swing.JOptionPane;

public class ClientRun {

	public static void main(String[] args) {
		//nickname을 GUI를 통해 전달받음
		String nickName =JOptionPane.showInputDialog("닉네임 입력");
		new ClientGUI(nickName);
	}

}
