package kh.lclass.chat.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientBackground {
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	private String nickname;
	private ClientGUI gui; // null

	public void disconnection() {
		try {
			if (socket != null) {
				socket.close();
			}
		} catch (Exception e) {
		}
	}

	// client에 접속하기위한 메소드
	public void connection() {
		try {
			socket = new Socket("127.0.0.1", 7777);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			bw.write(nickname + "\n");
			bw.flush();

			// server와 입력 통로가 끊어지지 않았다면 계속 반복확인
			// server에서 수신받은 메세지

			while (br != null) {
				String msg = br.readLine();
				gui.appenMsg(msg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sendMessage(String msg) {
		try {
			bw.write(msg + "\n");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setGui(ClientGUI gui) {
		this.gui = gui;
	}
}
