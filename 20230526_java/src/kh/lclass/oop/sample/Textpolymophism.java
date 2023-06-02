package kh.lclass.oop.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Textpolymophism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Car> carList = new ArrayList<Car>();
		Collection<Car> carCollection = new ArrayList();
		
		TestInterface kh = new Kh();
		((Kh)kh).khspecial();
		
		TestInterface bit;
		TestInterface bit2;
		TestInterface bit3;
		
		Driver ej = new Driver();
		ej.setMoney(10000);
		ej.buy(new Avante());
		ej.buy(new Sonata());
	}
}
