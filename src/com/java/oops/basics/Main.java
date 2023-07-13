package com.java.oops.basics;

public class Main {

	public static void main(String[] args) {

//		float x;
//		System.out.println(x);

		Car hondaCivic = new Car();// Your 1st car object

//		hondaCivic is a refrence variables

		System.out.println(hondaCivic.mielage);// 0.0
		hondaCivic.mielage = 20.4f;
		System.out.println(hondaCivic.mielage);// 20.4

		Car volkswagenVirtus = new Car();// Your 1st car object
		System.out.println(volkswagenVirtus.mielage);// 0.0

		new Car();
		new Car();
		
		

		Car i20;
		Car thar;
		System.out.println(hondaCivic);
		System.out.println(hondaCivic.hashCode());// DECIMAL SYSTEM

		System.out.println(volkswagenVirtus);
		
		i20 = hondaCivic;
		volkswagenVirtus = null;
		
		System.out.println(volkswagenVirtus.mielage);

	}

}
