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
		ServerSocket ss = null;		//서버 생성을 위한  서버소켓
		Socket sc = null;			//client와 통신하기위한 소켓
		InputStream in= null;		
		OutputStream out = null;
		BufferedReader br = null;	//client의 데이터를 읽어들이기위한 입력스트림
		BufferedWriter wr = null;	//데이터를 내보내기 위한 출력 스트림
		
		try {
			// 2. 서버용 소켓 객체 생성
			ss = new ServerSocket(port); 	//ss라는 서버소켓 객체생성
			
		while(true) {		//반복문 
			System.out.println("접속대기중");
			//3. 클라이언트 쪽에서 접속 요청이 오길 기다림 + 4번 포함
			 sc =ss.accept();	//sc 소켓을 ss로 선언한 객체에 대기 상태
			System.out.println("접속됨"+sc.getLocalPort());
			System.out.println("접속됨"+sc.getPort());
			//5번
			 in= sc.getInputStream();		//클라이언트와 연결된 입출력스트림 생성
			 out=sc.getOutputStream();
			//6번
			 br = new BufferedReader(new InputStreamReader(in));	//보조스트림도 생성
			 wr = new BufferedWriter(new OutputStreamWriter(out));
			
			 String receivedMsg;	//
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
