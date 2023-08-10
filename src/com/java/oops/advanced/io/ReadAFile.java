package com.java.oops.advanced.io;

import java.io.File;
import java.util.Scanner;

public class ReadAFile {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B7\\notes\\sample.txt";
		File file = new File(path);

		System.out.println(file.exists());

		int counter  = 0;
		try (Scanner sc = new Scanner(file);) {
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
			System.out.println(++counter);
		}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
