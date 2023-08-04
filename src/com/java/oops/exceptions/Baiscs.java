package com.java.oops.exceptions;

public class Baiscs {

	static int counter = 0;

	public static void main(String[] args) {

		System.out.println("START");

		int[] arr = { 23, 32, 3, 3, 21342, 34 };// 6

//		try {//handling of exeption
//			System.out.println(arr[6]);// 0 - 5
//		} catch (Exception e) {
//			System.out.println(e);
//		}

		test();//Stack OverFlow Errors | Errors should not be handled
		System.out.println("END");

	}

	static void test() {
		System.out.println("Counter => " + ++counter);

		test();

	}

}
