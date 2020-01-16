package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectMain {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		PersonDTO dto = new PersonDTO("ȫ�浿", 23, 170.879999);
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
//		oos.writeObject(dto);
//		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));

		PersonDTO dto2 = (PersonDTO) ois.readObject();
		
		System.out.println(dto2.getName());
		System.out.println(dto2.getAge());
		System.out.println(dto2.getHeight());
		
		ois.close();
	}
}
