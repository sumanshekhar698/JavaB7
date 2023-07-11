package com.java.basics2;//R1: package declaration is a must

//RULES are must to follow
//STANDARDS are optional but recomended
public class BasicVariables {// R2: class name and file name should exactly match
//	S1: class name should be in PascalCase

	public static void main(String[] args) {// R3: dont change the psvm signature

		// Primitive Variables to hold simple data
//		integers
		byte a;// declaration //8 bits
		short b = 88;// declaring and intiialising at the same time //16 bits
		int c = 78990;// 32 bits
		long d;// 64 bits

		a = 77;// initialisation

//		a = c;
		a = (byte) c;// force by explicit conversion
		System.out.println(a);

		c = a;// implicit conversion

		System.out.println(a);

		// Boolean Data Type
		boolean isJavaEasy = true;
		isJavaEasy = false;

		// Phone Number
		long phoneNumber = 9006567388L;// camelCase

		// Floating Point numbers
		float sample1 = 44423.45353234324F;// IEEE format | 32 bits
		double sample2 = 44423.45353234324;// By default Java takes every decimal number as double

		System.out.println(sample1);
		System.out.println(sample2);
		
		float sample3 = phoneNumber; 

		char rupeeSymbol = '₹';// UTF - 16
		System.out.println((int) rupeeSymbol);// typecasting
		System.out.println((char) c);// explicit conversion
		
		
		
		//NUMBER SYSTEM - DECIMAL - base 10 [0 - 9]
		
		//BINARY | Base 2 | 2 symbols 0,1
		int binNum = 0b101011010;
		
		//OCTAL | Base 8 | 8 symbols 0-7
		int octNum = 0323235;
		
		
		//HEX | Base 16 | 16 symbols 0-9 + A - F
		long hexNum = 0x32B32A35AbcL;
		System.out.println(binNum);

		System.out.println(octNum);
		System.out.println(hexNum);

		

	}

}
//CASES
//tomisabadcat => lower/small case
//TOMISABADCAT =>UPPER CASE
//tomIsABadCat  => camelCase*
//TomIsABadCat  => PascalCase*
//TOM_IS_A_BAD_CAT => CAPITAL_SNAKE_CASE*
