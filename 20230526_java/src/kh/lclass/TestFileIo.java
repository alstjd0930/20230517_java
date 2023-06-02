package kh.lclass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileIo {
	public void testFile(){
//		File f1 = new File("D:/data1/aaa.txt") ;
//		f1.mkdirs();
		String path =" D:data2/test";
		String filename= "aaa.txt";
		
		new File(path).mkdirs();
		
		File f2 = new File(path, filename);
			//f1.createNewFile();
		FileWriter fw =null;
		try {
			f2.createNewFile(); //파일 생성
			
			fw =new FileWriter(f2);
			fw.write("abcdf");
			fw.flush();
			return;
		}catch (IOException e) {
			System.out.println("파일 생성못함");
			e.printStackTrace();
		} finally {
			try{
				if(fw !=null) fw.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	
	}
}
