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
				
				System.out.println(byteMsg.length);
				System.out.println(receiveData.getData().length);
				System.out.println(receiveData.getLength());
				
				String receivedStr= new String(receiveData.getData()); //byte > string으로 
				System.out.println("수신메세지:"+receivedStr);
			}
			
			
		}catch(SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
