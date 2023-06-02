package kh.lcasss;

import java.util.Iterator;

public class TestFor {

	public static void main(String[] args) {
		
		int num8 = 10;
		for (num8 = 1; num8 <5 ; num8++) {
			
			System.out.println(num8);
		}
		System.out.println("=====");
		System.out.println(num8);
		System.out.println("=====");
		
		for(int num9=1; num9<5; num9++) {
			System.out.println(num9);
		}
		
		//System.out.println(num9); /// for문 안에서 선언된 지역변수임
		
		for(int num9=3 ; num9<7 ;num9++) { //for문안에 int num9이라는 변수를 선언
			System.out.println(num9);
		}
		
	
		System.out.println("====구구단====");
		int dan = 2;
		int su = 1; // 1씩 증가, 9까지 변함
		
		System.out.printf("%2d * %2d = %2d\n", dan, su , dan*su);
		System.out.printf("%2d * %2d = %2d\n" , dan, ++su , dan*su);
		System.out.printf("%2d * %2d = %2d\n" , dan, ++su , dan*su);
		
		for(dan=2 ; dan<=9; dan++) {
			for(su=1 ; su<=9; su++) {
			System.out.printf("%2d * %2d = %2d\n", dan, su , dan*su);
			if(su==5) {
				break;
			}
			
		}
			
			
		System.out.println("=========");
		}
		System.out.println("=========");
		int total = 0;
		for(int i=1; i<10 ; i++) {
			if(i%2==0) {
				continue;
			}
			total += i;
		// total = 	(i%2==0) ? total + i  : total ;
		}
		System.out.printf("합계는 %d\n", total);
		
	}
}
