package kh.lcasss;

import java.util.Scanner;

public class IfTest {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("나이를 입력해주세요. :");
		
		int age = sc.nextInt();
	
		if(age >= 8 && age <=19) {
			System.out.println("학교에 다닙니다");	
			if(age == 8) {
				System.out.println("입학합니다");
				}
			else if(age == 19) {
				System.out.println("곧 졸업합니다");
			}
		}
		else {
			System.out.println("학교를 다니지않습니다.");
		} 
		
		System.out.println("============");
		System.out.println("공원 입장료");
		System.out.println("============");
		System.out.print("나이를 입력해주세요:");
		
		int age1 = sc.nextInt();
		int money;
		
		if(age1 < 8) {
			money = 1000;
			System.out.println("취학 전 아동입니다.");
		}
		else if(age1 < 14) {
			money = 2000;
			System.out.println("초등학생입니다");
		}
		else if(age1 < 16) {
			money = 2500;
			System.out.println("중학생입니다");
		}
		else if(age1 < 20) {
			money = 3000;
			System.out.println("고등학생입니다");
		}
		else {
			money = 5000;
			System.out.println("성인입니다");
		}
	
		System.out.println("요금은"+money+"원 입니다");
		System.out.println("============");
		*/
		
		System.out.println("==========");
		System.out.println("====학점====");
		System.out.print("평균점수 입력 :");
		int totalScore = sc.nextInt();
		int Score = totalScore /10;
		
		switch (totalScore /10) {
		case 10 :
		case 9:
			System.out.println("A학점");
		case 8:
			System.out.println("B학점");
		case 7:
			System.out.println("C학점");
		case 6:
			System.out.println("D학점");
		default: //else
			System.out.println("과락");
		}
		
		// 1~100 정수의 합을 구하시오
		int i;
		int sum = 0 ;
		// for ( 초깃값 ; 조건식 ; 증감식){ }
		for(i=0 ; i<=100 ; i+=1) {
			sum += i;	
		}
		System.out.println(sum);
		
		// 화면에 1-5까지 display 해줘
		
		for(i=0; i<6 ; i++)
		
		System.out.println(i);
		
		
		
		
		
		
		
		sc.close();
	}
}

