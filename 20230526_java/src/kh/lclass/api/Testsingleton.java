package kh.lclass.api;

public class Testsingleton {
	private int a = 10;
	private static Testsingleton instance = new Testsingleton();
	
	private Testsingleton() {}
	public static Testsingleton getInstance() {
		return instance;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}
