package kh.lcasss;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//스캐너를 가져다가 전원버튼을 누
		//enter 키를 누를때까지 스캐너 동작
		
		
		String str1 =scan.next();	//띄워쓰기 또는 enter 한덩어리 리턴
		System.out.println(str1);
		int num1 = scan.nextInt();//띄워쓰기전 한덩어리 정수로 바꿔 리턴
		System.out.println(num1);
		double num2 = scan.nextDouble(); //띄워쓰기전 한덩어리 실수로 바꿔 리턴
		System.out.println(num2);
		String str2 = scan.nextLine(); //줄바꿈 전 한덩어리 문자로 바꿔 리턴
		System.out.println(str2);
		
		
		System.out.println("입력1");
		int num3 = scan.nextInt();
		System.out.println(num3);

		
		
		
		
		scan.close();
	}
}
