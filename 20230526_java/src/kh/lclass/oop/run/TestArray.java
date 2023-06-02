package kh.lclass.oop.run;

import kh.lclass.oop.sample.Person;
import kh.lclass.oop.sample.Student;

public class TestArray {
	public static void main(String[] args) {
		
		Person[] personArray2 = new Person[] {new Person(),new Person()};
		//방법1
		Person[] personArray = new Person[22];
		for(int i=0; i<personArray.length ; i ++) { //방법2
			personArray[i] = new Person();
		}
		//personArray[0].setAge(25);
		//NullPointerException 해결방법
		//원인: . 찾기 .앞에 있는 변수(객체=인스턴스)가 null 상태 
		//personArray[0] 에 null 주소값을 가지고잇엇음
		//해결방법 변수에 new 생성자();를 해줌
		Person[] personArray3 = new Person[22];
		personArray3[0] = new Person();
		personArray3[0].setAge(25);
		personArray3[0].setName("김말똥");
		personArray3[0].setGender('여');
		
		personArray3[1] = new Person("김개똥",19,'남');
		personArray3[2] = new Person("김소똥",22,'남');
		
		Student[] stdArray = new Student[3];	//배열 생성
		for(int i = 0 ; i<stdArray.length ; i++) {		
			stdArray[i] = new Student();		//객체 생성
			
		}
		stdArray[0].setAge(15);
		stdArray[0].setName("김명희");
		stdArray[0].setGender('여');
		stdArray[0].setScore(85);
		stdArray[0].setGrade(3);
		
		System.out.println(stdArray[0].getName());
		System.out.println(stdArray[0].getAge());
		System.out.println(stdArray[0].getGender());
		System.out.println(stdArray[0].toString());
		
		//Student yh = new Student("김영희"
		
	}
}
