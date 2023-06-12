package com.kh.practice.revew;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TxtTest {
	String txt = "hello world";
	public void testFileTxtOut() {	//해당 위치에 abc텍스트 문서를 만드는 메소드
		
		String filePath = "D:/data0612/test/a.txt";
		
		FileOutputStream fos = null;		//스트림 생성
		ObjectOutputStream oos = null;
		try {								//try catch문으로 오류를 잡음
			fos = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fos);
		}catch(FileNotFoundException e) {	
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {							//마지막으로 실행되어야 하는부분
			try {
				if(oos != null)				//스트림 종료/ 선언된 순서 역순으로
					oos.close();
				if(fos != null)
					fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void testFiletest() {
		String filePath = "D:/data0612/test";
		String filename = "a.txt";
		
		
		
		
		
		
	
		
		
		
	}
}	
