package kh.lcasss;

import java.util.Scanner;

public class IfTest1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학점을 입력하시오");
		
		int score = sc.nextInt();
		char grade =0;
		
		if(score>=90 && score<=100) {
			grade = 'A';
		}
		else if(score>=80 && score<=89) {
			grade = 'B';
		}
		else if(score>=70 && score<=79) {
			grade = 'C';
		}
		else if(score>=60 && score<=69) {
			grade = 'D';
		}
		System.out.println("학점은"+ grade +"입니다.");
	}
}
