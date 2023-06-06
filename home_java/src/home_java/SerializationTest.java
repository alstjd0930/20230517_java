package home_java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
		String name;
		String job;
	
	public Person() {}
	public Person(String name, String job) {
		this.job=job;
		this.name=name;
	}
	public String toString() {
		return name+","+job;
	}
}
public class SerializationTest {
	public static void main(String[] args)throws ClassNotFoundException {
		Person personAhn = new Person("안재용", "대표이사");
		Person personkim = new Person("김철수", "상무이사");
		try(FileOutputStream fos = new FileOutputStream("serial.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos))	{
			oos.writeObject(personAhn);
			oos.writeObject(personkim);
		}catch(IOException e) {
			e.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			System.out.println(p1);
			System.out.println(p2);
		}catch(IOException e ) {
			e.printStackTrace();
		}
	}
}
