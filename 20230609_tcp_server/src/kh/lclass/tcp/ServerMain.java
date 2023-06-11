package kh.lclass.tcp;

public class ServerMain {

	public static void main(String[] args) {
		new TcpServer().testTcpServer(9001);	//메인서버는 포트번호,클라이언트서버는 포트번호+ip
		
	}
}
