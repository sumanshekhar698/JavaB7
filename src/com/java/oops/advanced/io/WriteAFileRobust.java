package com.java.oops.advanced.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteAFileRobust {

	public static void main(String[] args) {
		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B7\\notes\\sample.txt";
		File file = new File(path);

		String msg = "Hello Java \n It was a nice learning Journey!!";

		System.out.println(file.exists());
		try (FileOutputStream fos = new FileOutputStream(path);) {
			fos.write(msg.getBytes());
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
