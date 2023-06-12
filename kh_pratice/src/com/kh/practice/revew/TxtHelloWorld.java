package com.kh.practice.revew;

import java.io.FileInputStream;
import java.io.IOException;

public class TxtHelloWorld {
	public static void main(String[] args) {
		FileInputStream fis = null;
	
			try {
				fis = new FileInputStream("input.txt");
				System.out.println(fis.read());
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					try {
						fis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}catch(NullPointerException e) {
					e.printStackTrace();
				}
			}
	}
}
