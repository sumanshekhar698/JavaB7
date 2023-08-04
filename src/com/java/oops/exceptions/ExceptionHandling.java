package com.java.oops.exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("START");

		int[] arr = { 23, 32, 3, 3, 21342, 34 };// 6

//		checked exception
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);// checked exception => must handle it
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// unchecked exceptions => optional to handle
		System.out.println(arr[6 / 0]);// 0 - 5

		System.out.println("END");

	}

}
