package com.java.oops.advanced.io;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B7\\notes\\sample.txt";
		File file = new File(path);

		System.out.println(file.exists());

		if (file.exists()) {
			System.out.println("Path " + file.getAbsolutePath());
			System.out.println("Name " + file.getName());
			System.out.println("R Permission " + file.canRead());
			System.out.println("W Permission " + file.canWrite());
		} else {
			System.out.println("File is missing");
		}

	}

}
