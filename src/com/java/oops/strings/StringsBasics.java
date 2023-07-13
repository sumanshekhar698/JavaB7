package com.java.oops.strings;

public class StringsBasics {

	public static void main(String[] args) {

//		Strings are objects in Java 
//		Strings are sequence of Characters

//		Strings are IMMUTABLE
		int m = 9;

		String name = "SumanShekhar";// 0
		System.out.println(name.length());
		System.out.println(name.substring(2, 5));
		System.out.println(name.substring(6));

		String sub = name.substring(6);

		name = name.toUpperCase();
		System.out.println(name);// ?

		String x = "78\"9";
		System.out.println(x);
		String s = "";// s ----> ""

		System.out.println(s);

		s = null;// s --->
	}
}
