package com.java.oops.advanced.io.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainSerialization {

	public static void main(String[] args) {

//		Student s1 = new Student(234, 1, "Angel");
//		System.out.println(s1);

		// Serialization
		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B7\\notes\\sample.txt";
//		File file = new File(path);

		Student s1 = new Student(234, 1, "Angel");
		s1.uniName = "National College";
		System.out.println(s1);

		try (FileOutputStream fos = new FileOutputStream(path); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(s1);
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
