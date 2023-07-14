package com.java.oops.strings;

public class BattleOfStrings {

	public static void main(String[] args) {

//		String x = "Barbie ";
//		long start = System.nanoTime();
//		for (int i = 0; i < 100000; i++) {
//			x += "Hey Barbie";
//		}
//		long end = System.nanoTime();//
//
//		System.out.println("Time Taken: " + (end - start));//nanoseconds Time Taken: 50262214100

		StringBuilder y = new StringBuilder("Barbie");
		long start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			y.append("Hey Barbie");
		}
		long end = System.nanoTime();//

		System.out.println("Time Taken: " + (end - start));// nanoseconds Time Taken: 50262214100

	}

}
