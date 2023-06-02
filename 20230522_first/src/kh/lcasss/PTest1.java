package kh.lcasss;

import java.util.Scanner;

public class PTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("이름을 입력하세요 : ");
		String a = sc.next();
		System.out.print("성별을 입력하세요(남/여) :");
		String b = sc.next();
		System.out.print("나이를 입력하세요 : ");
		int c = sc.nextInt();
		System.out.print("키를 입력하세요(cm) : ");
		float d = sc.nextFloat();
		
		System.out.println("키는"+d+"인 "+c+"살 "+b+a+"님 반갑습니다^^");
		
		sc.close();
	}
}
