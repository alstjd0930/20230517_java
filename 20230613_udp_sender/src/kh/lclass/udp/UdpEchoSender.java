package kh.lclass.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpEchoSender {
	public static void main(String[] args) {
		new UdpEchoSender().senderUdp();
	}
	public void senderUdp() {
		//포트번호 정하기
		int myport = 5001;
		int destport = 6001;	//받을 상대 포트번호
		String destName = "localhost";
		
		DatagramSocket dsock =null;
		
		try {
			//datagramSocket 객체 생성
			dsock = new DatagramSocket(myport);			//매개인자 없으면 자동포트번호 할당
			
			//전달할 메세지
			String sendmsg = "안녕a하";
			
			
			InetAddress destip=null;
			try {
				//3.연결할 클라이언트 ip주소를 가진 inetaddress 객체생성
				destip = InetAddress.getByName(destName);
				//4.전달할 메세지를 byte[]로 바꿔야댐
				byte[] bytemsg =sendmsg.getBytes();	//getbyte : sendmsg에 값을 바이트값으로 리턴해줌 리턴값은 bytemsg에 대입
				//5.전달할 메세지를 DatagramPacket에 담음
				DatagramPacket sendData= new DatagramPacket(bytemsg, bytemsg.length, destip, destport);
				//6.소켓 레퍼런스를 사용하여 메세지 전송
				dsock.send(sendData);
			
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		} finally {
			if(dsock!=null) dsock.close();
		}
		
	}
}
