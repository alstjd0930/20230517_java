package com.kh.practice.revew;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderer {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("inputa.txt");BufferedReader br = new BufferedReader(fr)){
			String str =null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
