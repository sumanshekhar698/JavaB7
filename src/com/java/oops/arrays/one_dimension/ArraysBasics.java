package com.java.oops.arrays.one_dimension;

import com.java.oops.basics.Car;

public class ArraysBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "mango";

		String[] fruits = new String[5];// Arrays are objects is Java | Arrays sizeis Fixed, canot be expanded or
										// shrinked

		Car[] cars = new Car[3];
		cars[0] = new Car();
		cars[1] = new Car();
		cars[2] = new Car();

		String[] vegies = { "Potato", "Tomato", "Cucumber", "LadysFinger" };

		for (int i = 0; i < vegies.length; i++) {
			System.out.println(vegies[i]);
		}
//		System.out.println(vegies[4]);

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Lichi";
		fruits[3] = "Kiwi";
		fruits[4] = "Banana";
		fruits[4] = "PineApple";
//		fruits[-1] = "Cherry";
//		fruits[5] = "Cherry";

		System.out.println(fruits);

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

	}

}
