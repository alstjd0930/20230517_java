package kh.lclass.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import kh.lclass.oop.sample.Car;

public class TestCollection {
	public <E> String testGenneric(E a) {
		
		return a.toString()+"결과값";
	}
	
	
	public void testStack() {
		Stack<String> strStack = new Stack<String>();
		strStack.push("안녕");
		strStack.push("하");
		strStack.add("세요");
		System.out.println(strStack);
		System.out.println(strStack.get(1));
	}
	public void testHashMap() {
		Map<String , Object> objMap = new HashMap<String, Object>();
		objMap.put("ej",35.0 );
		objMap.put("jy","지영이네" );
		objMap.put("hj", new Car(5000) );
		System.out.println(objMap);
		System.out.println(objMap.get("jy"));
		
		Set<String> keyset = objMap.keySet();
		System.out.println(keyset);
		System.out.println("=========");
		for(String item :keyset) {
			Object value = objMap.get(item);
			System.out.println(item+":"+value);
		}
		System.out.println("====");
		Iterator<String> itr = keyset.iterator();
		while(itr.hasNext()){
			String item = itr.next();
			Object value =objMap.get(item);
			System.out.println(item+":"+value);
		}
				
	}
	
	public void testHastset() {
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(11);
		integerSet.add(22);
		integerSet.add(33);
		integerSet.add(11);
		System.out.println(integerSet.toString()); //순서 정리가 안됨
		for(Integer item:integerSet) {
			System.out.println(item);
		}
		System.out.println("=======");
		Iterator<Integer> itr = integerSet.iterator();	//iterator 
		System.out.println(itr);
		while(itr.hasNext()){
			Integer item = itr.next();
			System.out.println(item);
		}
		
	}
	public void testArrayList() {
		String[] strArr1 = new String[3];
		strArr1[0] = "바나나";
		strArr1[1] = "딸기";
		//System.out.println(strArr1[3]);  //오류
		
		ArrayList<String> list1 = new ArrayList<String>(); //<>안에는 참조자료형만
		ArrayList<Integer> list2 = new ArrayList<Integer>(); 
		ArrayList<Car> list3 = new ArrayList<Car>(); 
		list3.add(new Car(3000));
		list2.add(25);
		list2.add(26);
		list2.add(27);
		System.out.println(list2.get(2)); //꺼내기
		
		for(int i=0 ; i<list2.size(); i++) {	// list.size
			Integer item=list2.get(i);
			System.out.println(list2.get(i));
		}
		for(int i=0 ; i<strArr1.length; i++) {	 //배열.length
			String item=strArr1[i];
			System.out.println(strArr1[i]);
		}
		
		// enhanced for
		for(Integer item : list2 ) {
			System.out.println(item);
		}
		for(String item : strArr1 ) {
			System.out.println(item);
		}
		
		
		if(list1.add("7번")) {
			System.out.println("추가성공");
		}
		list1.add("1번");		//0주소값에 1번넣기
		list1.add("2번");
		list1.add("3번");
		list1.add(1,"1주소값에 2번대신끼워넣기" ); 
		//list.remove("2번");
		//list.removeAll(list); 
		//list.remove(0); 해당 값 삭제
		//list.clear();		클리어
		Collection<String> collection1 = new ArrayList<String>();
		collection1.add("2번");
		((ArrayList<String>)list1).clone();
		
		if(list1 instanceof ArrayList) {
			ArrayList<String>copyList =(ArrayList<String>)list1.clone();
			System.out.println(copyList);
		}
		
		
		System.out.println(list1);
	}
}
