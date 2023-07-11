package com.java.basics2;

public class Loops {

	public static void main(String[] args) {

//		 1 to 10
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);

		// FOR LOOP
		int i = 1;
		for (; i > 0; i += 10000000) {// initialisation; condition ; updation
			System.out.println(i);
		}

		System.out.println(i);

//		for (;;) {
//			System.out.println("LOOPING...");
//		}

		int j = 0;
		while (j < 100) {// WHILE LOOP
			if (j % 2 == 0) {
				System.out.print(j + " ");
			}
			j++;
		}

		do {// DO WHILE
			System.out.println("Ruunning do while");
		} while (4 == 5);

	}

}
