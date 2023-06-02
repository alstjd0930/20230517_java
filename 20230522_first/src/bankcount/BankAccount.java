package bankcount;

//import kh.lcalss.bank.Information;

public class BankAccount { // kakao26
	// static 클래스 변수
	private  static int count; //현재 통장을 개설한 사람 수
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		BankAccount.count=count;
	}
	// overloading 조건 매개변수 개수, 자료형이 다리고 메소드 명이 같을때
	
	private int accountNo; // 계좌번호				//위 3개 변수는 바뀌어선 안됨 > 생성자로 보냄
	private String name; // 예금주
	private int sno; // 주민번호
	
	
	private Information info; // 유의사항
	private int balance; // 잔액
	private String accountName="내일배움"; // 통장이름
	private int password;

	{
		accountName = "내일배움 = 블럭초기화";
		balance = 5000000;
	}
	
	
	//생성자 클래스명과 동일, 리턴타입없음
	public BankAccount(int sno, String name) { // BankAccount라는 생성자 생성
		this.sno = sno;
		this.name = name;
	}
	public BankAccount(int sno, String name , int phonenumber) { // BankAccount라는 생성자 생성
		this.sno = sno;
		this.name = name;
		this.accountNo = phonenumber;
	}
	
	public double sum(double a, double b) {
		return a+b;
	}
	public void setInfo(Information info) {
		this.info = info;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public String getName() {
		return name;
	}
	public int getSno() {
		return sno;
	}
	public Information getInfo() {
		return info;
	}
	public int getBalance() {
		return balance;
	}
	public String getAccountName() {
		return accountName;
	}
	public int sum(String a, int b) {
		return Integer.parseInt(a)+b;
	}
	public int sumArgs() {
		int result = 0 ;
		//ex
		System.out.printf("printf는 가변인자 사용 ",1);
		return result;
	}

	// 메소드정의 = 기능정의
	// 입금 --- 입금출처(source), 입금금액(input money) - balance에 금액만큼 더하고 - 최종 balance를 표시
	// 출금 --- 목적지(destination), 출금금액(output money) - balance에 금액만큼 빼고 - 최종 balance를
	// 표시
	// 비번확인 --- 입력한패스워드(input password)와 - password를 비교하여 같다면 true, 다르면 false 표시
	// 잔액조회
	// 입출금내역조회

	// 입금 --- 출처(source), 금액(inputmoney) 준다면 - balance에 금액만큼 더하고 - 최종 balance 를 화면
	// 표시함
	public String deposit(String source, int inputMoney) {
		System.out.println(source + "으로 부터 " + inputMoney + "만큼 입금되었습니다");
		double interate = 0.05;
		balance = balance + inputMoney;
		interate = 5;
		return "입금 후 잔액은" + balance + "입니다";
		
		//String
//		String str1 = "문자";			//문자
//		String str2 = "문자";			//문자
//		String str3 = new String();		//""
//		String str4 = new String("문자");//문자
		
		
	}
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", name=" + name + ", info=" + info + ", balance=" + balance
				+ ", accountName=" + accountName + "]";
	}
}