package kh.lclass.cl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TcpClient {
	
	public void testTcpclient(String ip,int port) {
		
		
		Socket socket = null;
		InputStream in= null;
		OutputStream out = null;
		BufferedReader br = null;
		PrintWriter wr = null;
		
		//Scanner sc = new Scanner(System.in);
		// Scanner와 유사한 기능
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			socket =new Socket(ip, port);	//2. 서버와의 입출력 스트림 오픈
			System.out.println("접속성공");
			
			 in= socket.getInputStream();
			 out=socket.getOutputStream();
			
			 br = new BufferedReader(new InputStreamReader(in));	//보조스트림 통한 성능 개선
			 wr = new PrintWriter(new OutputStreamWriter(out));
			 
			 
			 String sendMsg =null;
			 
			 while(true){
				 	//스트림을 통해 읽고 쓰기
			 System.out.print("메세지");		
			 sendMsg = stdIn.readLine();
			 System.out.println("333"+sendMsg);
			 
			 wr.println(sendMsg);
			 wr.flush();
			 
			 String receivedMsg=br.readLine();
		     System.out.println("서버로부터 받은메세지"+receivedMsg);
			 }
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {			//통신 종료
				if (stdIn != null) stdIn.close();
				if (wr != null) wr.close();
				if (br != null) br.close();
				if (out != null) out.close();
				if (in != null) in.close();
				if(socket!=null)socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
