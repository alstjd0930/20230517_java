package kh.lclass.chat.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//import kh.lclass.chat.client.ClientGUI;

public class ServerBackground {
	private ServerSocket ss;

	// client 여러명을 관리 : socket + nickname
	private Map<String, BufferedWriter> mapclient = new HashMap<String, BufferedWriter>(); // key: nickname value: socket
	// map.put("socket",socket객체)
	// map.put("nickname" , "ej");
	// mapList.add(map);

	// map.put("ej",socket);

	private Socket socket;
//	private BufferedReader br;
//	private BufferedWriter bw;
	private ServerGUI gui;
	private int count;

//	public void  disconnection() {
//		try {
//			if(socket !=null) {
//				socket.close();
//			}
//		}catch(Exception e) {
//		}
//	}
	public void setting() {
		try {
			ss = new ServerSocket(7777);
			// 방문자 접속을 계속 받아들임 무한반복
			while (true) {
//				socket =ss.accept(); //클라이언트 받음
//				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				// 클라이언트 nickname 바로 이어서 들어옴
				socket = ss.accept();
				new Client(socket).start();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 클라이언트 접속시 그 정보를 나타내주는 메소드
	public void addClient(String nickname) {
		gui.appenMsg(nickname + "님이 접속");
	}

	public void setGui(ServerGUI gui) {
		this.gui = gui;
	}

	public void sendMessage(String msg) {
		Set<String> keys = mapclient.keySet();
		for (String key : keys) {
			BufferedWriter wr = mapclient.get(key);
			try {
				wr.write(msg+"\n");
				wr.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	class Client extends Thread {
		// private Socket socket;
		private BufferedReader br;
		private BufferedWriter bw;
		private String nickname;

		public Client(Socket socket) {
			// 초기값설정
			// socket =ss.accept(); //클라이언트 받음
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				String nickname = br.readLine();
				addClient(nickname);
				//client outputstream 관리 map에 추가
				mapclient.put(nickname, bw);
				sendMessage(nickname+"님 접속");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		@Override
		public void run() {
			// 클라이언트마다 각각에서 전달되어오는 메세지 확인
			// client 입력 통로가 끊어지지 않았다면 계속 반복
			// client 수신받은 msg
			while (br != null) {
				// String msg =null;
				try {
					String msg = br.readLine();
					gui.appenMsg(msg);
					sendMessage(msg);
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}

	}
}
