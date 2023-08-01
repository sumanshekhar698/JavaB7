package com.java.oops.basics;

public class GarbageCollector {

	public static void main(String[] args) {

//		 x = 9;
		
		int x = 9;// statically type declaration
//		Java is a statically type language

		new Car();
		Car c;
		Car c2 = new Car();
		System.out.println(c2);
		Car c3 = c2;

		c2 = null;
		System.out.println(c3);

		System.gc();// triggering GC by yourself

	}

}
