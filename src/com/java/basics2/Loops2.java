package com.java.basics2;

public class Loops2 {

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {

			if (i % 2 == 0)
				continue;// loops

			System.out.println(i);

		}

		for (int i = 0; i < 100; i++) {
			if (i > 50)
				break;

			System.out.println(i);
		}

	}

}
