package kh.lcasss;

import java.util.Scanner;

public class PTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수");
		int a = sc.nextInt();
		System.out.print("두번째 정수");
		int b = sc.nextInt();
		
		int sum = a+b;
		int di = a-b;
		int xx = a*b;
		int sha = a/b;
		
		System.out.println("더하기 결과:" +sum);
		System.out.println("빼기 결과:" +di);
		System.out.println("곱하기 결과:" +xx);
		System.out.println("나누기 결과:" +sha);
		
		sc.close();
	}	
}
