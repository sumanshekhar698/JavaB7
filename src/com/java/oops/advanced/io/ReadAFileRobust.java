package com.java.oops.advanced.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAFileRobust {

	public static void main(String[] args) {
		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B7\\notes\\sample.txt";
		File file = new File(path);

		System.out.println(file.exists());
		try (FileInputStream fis = new FileInputStream(path);) {
			int readChar = 0;
			while ((readChar = fis.read()) != -1) {
				System.out.print((char)readChar);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
