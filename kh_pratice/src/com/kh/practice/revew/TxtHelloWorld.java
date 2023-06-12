package com.kh.practice.revew;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TxtHelloWorld {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("inputa.txt")) {
			fw.write("hello world");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
