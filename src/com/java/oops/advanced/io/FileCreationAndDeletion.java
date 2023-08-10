package com.java.oops.advanced.io;

import java.io.File;
import java.io.IOException;

public class FileCreationAndDeletion {

	public static void main(String[] args) {
		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B7\\notes\\new_file.txt";
		File file = new File(path);

		System.out.println(file.exists());

		if (!file.exists()) {
			try {
				boolean createNewFile = file.createNewFile();// CREATION OF A FILE
				System.out.println(createNewFile);
			} catch (IOException e) {// file creation is a checked Exception operation
				e.printStackTrace();
			}
		}

		if (file.exists()) {

			boolean deleted = file.delete();// DELETION OF FILE
			System.out.println(deleted);

		}

	}

}
