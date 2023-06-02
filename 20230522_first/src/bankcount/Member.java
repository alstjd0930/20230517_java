package bankcount;

import java.util.Scanner;

public class Member {
	public static void main(String[] args) {

		java.util.Scanner sc = new Scanner(System.in);

		System.out.println("통장계설을 원하십니까");
		String anwer = sc.nextLine();
		if (anwer.equals("네")) { // 문자열은 ==로 비교할수없음
			System.out.println("주민번호 확인: ");
			String strNo = sc.nextLine();
			int sno = Integer.parseInt(strNo);
			
			System.out.println("이름확인 :");
			String strName = sc.nextLine();
			BankAccount ej = new BankAccount(sno, strName);
			BankAccount hj = new BankAccount(123123,"호종");
			
			
		} else {
			System.out.println("다른 창구를 이용하세요");
		}
		
//		String str = "Hello";
//		System.out.println(str.);
//		
	}
}
