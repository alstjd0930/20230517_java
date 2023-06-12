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
			//2.서버용 소켓 객체 생성
		ServerSocket ss = null;		//서버를 생성하기위한 소켓 ss
		Socket sc = null;			//client와 통신하기 위한 소켓
		InputStream in= null;		// 스트림 선언
		OutputStream out = null;
		BufferedReader br = null;	//client의 데이터를 읽어들이기위한 입력스트림
		BufferedWriter wr = null;	//데이터를 내보내기 위한 출력 스트림
		
		try {
	
			ss = new ServerSocket(port); 	//서버소켓 객체생성
			System.out.println("나의 ip"+ss.getInetAddress().toString());
			System.out.println("나의 포트"+ss.getLocalPort());
			
		while(true) {		//반복문시작
			System.out.println("접속대기중"); 		//3. 클라이언트 쪽에서 접속 요청이 오길 기다림
			 sc =ss.accept();	//accept메소드 /sc 소켓을 ss로 선언한 객체에 대기 상태
			System.out.println("나의 포트 접속됨"+sc.getLocalPort());	//접속됨을 알리는 문구작성
			System.out.println("접속됨"+sc.getPort());
			System.out.println("클라이언트 포트"+sc.getInetAddress().toString());
												//4. 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
			 in= sc.getInputStream();		
			 out=sc.getOutputStream();			//5. 연결된 클라이언트와 입출력스트림 생성
	
			 br = new BufferedReader(new InputStreamReader(in));	//6. 보조스트림 생성을 통한 성능 개선
			 wr = new BufferedWriter(new OutputStreamWriter(out));
			
			 String receivedMsg;	//String 자료형으로 받음
			 while((receivedMsg = br.readLine()) !=null){
				 System.out.println("받은메세지"+receivedMsg);	//클라이언트로 부터 받은 메세지 출력
				 wr.write("메세지 잘받음\n");
				 wr.flush();
			 	}
			} 
			 
			 
			
			} catch (IOException e) {
			e.printStackTrace();
		} finally {  
			try {
				if (wr != null) wr.close();		//선언된 순서의 역순으로 스트림 종료
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
