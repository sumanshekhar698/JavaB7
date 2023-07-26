package com.java.oops.arrays.one_dimension;

import java.util.Arrays;

public class Main {

	public static void main(String... suman) {// psvm(String args[])
		// String args[] is used to accept arguments during RUNTIME

		System.out.println("Hello");
		System.out.println(suman.length);// 1
		System.out.println(suman[2]);// 2

//		if (1 == 0) {
//			System.out.println("Again");
//			return;
//		} else
//			System.out.println("World");

		test("Barbie", "Monkey", "Mission");

	}

	static void test(String... params) {// var args
		System.out.println(params);
		System.out.println(Arrays.toString(params));

		for (String element : params) {// foreach
			System.out.println(element);
		}
	}

}
