package kh.lclass.cl;

public class ClientMain {

	public static void main(String[] args) {
		new TcpClient().testTcpclient("127.0.0.1",9001);
		//서버의 ip주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체생성
	}
}
