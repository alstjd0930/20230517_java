package kh.lclass.oop.sample;


// class 예약어키워드 abstract는 해당클래스 내에 abstract메소드가 0개 이상 있을 것이라는 것을 의미함
public class Student extends Person { //위에 세개 변수가 부모클래스에 존재하기때문 상속
	private String name;
//	private int age;
//	private char gender;
	private int score;			//부모클래스에서 변수가 private으로 선언된경우 protected									//로 변경하면 자식클래스에서 사용가능
	private int grade;
	

	public Student() {
		super();	
	}
	public Student(String name,char gender, int age , int grade) {
		super(name, age, gender);
		this.name=name;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", grade=" + grade + ", toString()=" + super.toString()
				+ "]";
	}
	public String getName() {
		return this.getName(); //this를 사용하면 이 Student클래스에서 선언된 this값
						//super를 사용하면 person클래스
	}
	//Overriding 부모한테 있는 메소드를 재정의 할때
	//상속한 클래스와 동일한 메소드명
	//매개 변수 자료형 동일, 갯수 동일
	//리턴타비 동일
	//단 제약조건은 달라도됨 - 부모메소드의 접근제한자보다 넓은범위접근제어자 사용
	public int getAge() { 
		return super.getAge()+1; //overriding으로 person에잇는 getage를 수정
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	Student yh =new Student("김영희",'여',20,1) {
		//@Override
		//public void setGrade(int grade);
		
	};
	
}
