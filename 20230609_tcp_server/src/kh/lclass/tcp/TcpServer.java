package kh.lclass.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
	//ppt  네트워크
public class TcpServer {
	public void testTcpServer(int port) {
			//1번
		ServerSocket ss = null;
		Socket sc = null;
		InputStream in= null;
		OutputStream out = null;
		BufferedReader br = null;
		BufferedWriter wr = null;
		
		try {
			// 2. 서버용 소켓 객체 생성
			ss = new ServerSocket(port);
			
		while(true) {
			System.out.println("접속대기중");
			//3. 클라이언트 쪽에서 접속 요청이 오길 기다림 + 4번 포함
			 sc =ss.accept();
			System.out.println("접속됨"+sc.getLocalPort());
			System.out.println("접속됨"+sc.getPort());
			//5번
			 in= sc.getInputStream();
			 out=sc.getOutputStream();
			//6번
			 br = new BufferedReader(new InputStreamReader(in));
			 wr = new BufferedWriter(new OutputStreamWriter(out));
			
			 String receivedMsg;
			 while((receivedMsg = br.readLine()) !=null){
				 System.out.println("받은메세지"+receivedMsg);
				 wr.write("메세지 잘받음\n");
				 wr.flush();
			 	}
			} 
			 
			 
			
			} catch (IOException e) {
			e.printStackTrace();
		} finally {  //dd
			try {
				if (wr != null) wr.close();
				if (br != null) br.close();
				if (out != null) out.close();
				if (in != null) in.close();
				if (sc != null) sc.close();
				if (ss != null) ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
