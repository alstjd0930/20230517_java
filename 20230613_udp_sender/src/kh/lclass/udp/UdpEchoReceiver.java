package kh.lclass.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpEchoReceiver {
	public static void main(String[] args) {
		new UdpEchoReceiver().receiverUdp();
	}
	public void receiverUdp() {
		int myport = 6001;
		//int destport = 5001;
		DatagramSocket dsock =null;
		try{
			dsock = new DatagramSocket(myport);
			while(true){
				byte[] byteMsg =new byte[1000];
				DatagramPacket receiveData= new DatagramPacket
				(byteMsg, byteMsg.length);
				dsock.receive(receiveData);
				
//				System.out.println("===전달받은 정보===");	//발신자의 정보 receiveData안에 잇음
//				System.out.println(byteMsg.length);
//				System.out.println(receiveData.getData().length);
//				System.out.println(receiveData.getLength());
//				System.out.println(receiveData.getPort());		//메세지를 준쪽의 포트번호
//				System.out.println(receiveData.getAddress());
//				
				String receivedStr= new String(receiveData.getData()); //byte > string으로 
				System.out.println("수신메세지:"+receivedStr);
				
				//echo 메세지 송신
				DatagramPacket sendData	
				= new DatagramPacket(receiveData.getData(), receiveData.getLength(), receiveData.getAddress(), receiveData.getPort());
			
				dsock.send(sendData);
			
			
			}
			
			
		}catch(SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
