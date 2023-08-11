package com.java.oops.advanced.io.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDeSerialization {

	public static void main(String[] args) {

//		Student s1 = new Student(234, 1, "Angel");
//		System.out.println(s1);

		// Serialization
		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B7\\notes\\sample.txt";
//		File file = new File(path);

		try (FileInputStream fis = new FileInputStream(path); ObjectInputStream ois = new ObjectInputStream(fis);) {
			Student student = (Student) ois.readObject();
			System.out.println(student);
			student.readUniName();
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
