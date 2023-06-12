package kh.lclass.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class TestInetAddress {
	public void testInetAddressEx() {
		// The constructor InetAddress() is not visible 생성자가 없음
		// 원인 : 생성자 없이 static method 즉 클래스메소드지원이 됨.
		// 해결방안 : singleton 확인(주로 getInstance(),create()메소드)
		// static method 지원 확인
		
		//inetAdress는 new 로 생성 불가능
		String host1 = "www.naver.com";
		String host2 = "www.google.com";
		String host3 = "www.oracle.com";
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		try {
			InetAddress loopbackAddr =InetAddress.getLoopbackAddress();
			System.out.println(loopbackAddr);
			
			InetAddress lb = InetAddress.getByName("localhost");
			System.out.println(Arrays.toString(lb.getAddress()));
			boolean lbIsLoopback = lb.isLoopbackAddress();
			System.out.println(lbIsLoopback);	//DESKTOP-JPP667Q/192.168.10.23
			
			
			byte[] byteArr = new byte[] {(byte)223,(byte)130,(byte)200,(byte)104};
			System.out.println(Arrays.toString(byteArr));
			InetAddress byte2Arr = InetAddress.getByAddress(byteArr);
			System.out.println(byte2Arr);
			String byte2ArrHostName=byte2Arr.getHostName();
			System.out.println(byte2ArrHostName);
			System.out.println(byte2Arr.getHostAddress());
			
			InetAddress[] ipAll = InetAddress.getAllByName(host1); // 도메인 명으로 ip주소를 얻는다
			System.out.println(Arrays.toString(ipAll));
			for (InetAddress ip : ipAll) {
				System.out.println(ip);
				System.out.println("===");
				System.out.println(ip.getHostName());
				byte[] ipAddr = ip.getAddress();
				System.out.print("ip:");
				for (int i = 0; i < ipAddr.length; i++) {
					if (ipAddr[i] < 0) {
						System.out.print(ipAddr[i] + 256);
					} else {
						System.out.print(ipAddr[i]);
					}
					if (i != ipAddr.length - 1) {
						System.out.print(".");
					}
				}
				System.out.println();
				
				System.out.print("ip:");
				int cnt =0;
				for(int item : ipAddr) {
					if(item<0) {
						System.out.println(item+256);
					}
				}
			}
			System.out.print(".");

			System.out.println(".");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
