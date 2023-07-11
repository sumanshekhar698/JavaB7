package com.java.basics2;

public class Scopes {

	public static void main(String[] args) {

//		System.out.println(i);
		int i = 0;

//		SCOPE
		for (int j = 0; i < 20; i++) {
//			i ?
			int k = 0;

		}

		System.out.println(i);
//		System.out.println(j);//COMPLIE TIME ERROR
//		System.out.println(k);//COMPLIE TIME ERROR

		if (true) {
			int x = 99;
		}

//		System.out.println(x);//COMPLIE TIME ERROR

	}

}
