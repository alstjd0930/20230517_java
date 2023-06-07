package kh.lclass.api;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;



import kh.lclass.vo.TestVo;
import static kh.lclass.api.KHCommonApi.checkMenu;;

public class TestApi {
	public void testDate() {
		Date when = new Date(2000L);
		System.out.println(when);
		Calendar c= new GregorianCalendar();
		System.out.println(c.getTime());
		//new calendar 안됨
		//원인 1. abstract class 2.protected
		Calendar c2 = Calendar.getInstance();
		Testsingleton ts = Testsingleton.getInstance();
		System.out.println( ts.getA());
		ts.setA(50);
		System.out.println( ts.getA());
		Testsingleton ts2 = Testsingleton.getInstance();
		System.out.println( ts2.getA());
		ts.setA(100);
		System.out.println( ts2.getA());
	}
	
	
//	public boolean checkMenu(int start, int end,int value) {
//		boolean result = false;
//		if(value < start || value >end) {
//			System.out.printf("%d~%d사이 선택\n" ,start ,end);
//		}else {
//			result = true;
//		}
//		return result;
//	}
	public void testWrapperDoWhile() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴 1~5 사이 선택해주세요");
			int menu = 0;
			try {
				String meunStr = sc.nextLine();
				menu =Integer.parseInt(meunStr);
			}catch(NumberFormatException e) {
			//NumberFormatException에선	e.printStackTrace(); 굳이안씀
			}
			if(!checkmenu(1,5,menu)) {
				continue;
			}
				System.out.println("정상적으로 입력되어서..다른 함수 호출");
				toString();
				System.out.println("동작마침");
				break;
		}
	}
	
	
	private boolean checkmenu(int i, int j, int menu) {
	// TODO Auto-generated method stub
	return false;
}


	public void testString() {
		StringBuffer str1 = new StringBuffer("aaa");
		StringBuffer str2 = new StringBuffer();
		str2.append("12345");
		System.out.println(str2);
		System.out.println(str2.indexOf("bc"));
		StringBuilder str3 = new StringBuilder("bbb");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구분자를 입력하세요");
		String token = sc.nextLine();
		System.out.println("내용을 입력하세요");
		String content = sc.nextLine();
		String str = "AA||BB||CC";
		StringTokenizer st = new StringTokenizer(str,"|");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st);
		
		int i =35;
		double d =35.0;
		String s1 =String.valueOf(d);
		String s2 =Double.valueOf(d).toString();
		
		//String > 기본자료형
		String s = "35";
		i = Integer.parseInt(s);
		System.out.println(i);
		
		
		
		
		
		
		System.out.println("끝");
		
		
		
		
		
		
		
//
//	int bnum1=10;
//	int bnum2=11;
//	String bcontent2 = "aaaa";
//	String bwriter1 = "aa";
//	bwriter1 ="bb";
//	
//	TestVo tvo =new TestVo(10,"aa");
//	TestVo tvo2 = new TestVo(11);
//	tvo2.setBoardContent("aaaa");
//	tvo2.getBoardNum();
	
	}
}
