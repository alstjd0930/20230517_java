package kh.lclass.oop.sample;

public class Driver {
	private int license;
	private int money;
	
public int getLicense() {
		return license;
	}
	public void setLicense(int license) {
		this.license = license;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	public void khSpecial() {
		String str = "111222";
		try {
			Car[] carArr = new Car[3];
			carArr[4].setPrice(5000);  		//ArrayIndexOutOfBoundsException
			carArr[0].setPrice(5000);  		//NullPointerException
			
			int a = Integer.parseInt(str); 	//NumberFormatException
			int c = 10 / 0 ;				//ArithmeticeException
			c= 0/10;
		}catch (NumberFormatException e ) {
			System.out.println(Integer.MAX_VALUE+"까지");
			e.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눈수는 나타낼수없응");
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("0으로 나눈수는 나타낼수없응");
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("==========");
	}
	//	public void buy(Sonata c) {
//		if(money > c.getPrice()) {
//			System.out.println("구매확정");
//		}
//		else {
//			System.out.println("잔액부족");
//		}
//			
//	}
	public void buy(Car c) {
		if(money > c.getPrice()) {
			((Avante)c).moveCar();
			
			if(c instanceof Sonata) {
				//((Sonata)c).moveSonata();
				System.out.println("Sonata 이벤트에 응모되었습니다");
			}
			if(c instanceof Car) {
				System.out.println("car 이벤트에 응모되었습니다");
			}
			if(c instanceof Object) {
				System.out.println("이벤트에 응모되었습니다");
			}
			System.out.println(c.getPrice()+"원에 구매확정");
			money = money - c.getPrice();
			c.moveCar();
		}
		else {
			System.out.println("잔액부족 잔액은"+money);
		}
			
	}
	public void driving() {
		
	}
}
