package com.java.basics2;

public class Operators {

	public static void main(String[] args) {

		byte b = 127;// -128 -127 -126 -125 0 127

//		Unary Operator
		++b;// pre increment
		b++;// post increment
		b += 3;// shorthand
		System.out.println(b);// -128

		int x = 100;
		System.out.println(x++);// 100 --> 101
		System.out.println(x);// 101
		System.out.println(x);

		x = 200;
		System.out.println(++x);// 201
		System.out.println(x);

		x = 300;
		System.out.println(x--);// 300 ---> 299
		System.out.println(x);// 299

		x = 500;// 503
		int y = 10;// 8

//		m = 501 - 9 + 502 + 502 - 504 - 8 + 504 = 1505 - 17 = 1488
		int m = ++x - --y + ++x + x++ - ++x - --y + x--;//
		System.out.println(m);

//		SHORTHAND
		y = 10;
		y = y * 3;
		y *= 3;
		System.out.println(y);

//		ARITHMETIC + - * / %
		y = 100;
		y = 100 % 6;
		System.out.println(y);//

		y = 8 + ((9 / 3) * 2);// 14
		System.out.println(y);

//		COMPRISON OPERATORS
		System.out.println(6 == 7);
		System.out.println(6 < 7);
		System.out.println(6 > 7);
		System.out.println(6 <= 7);
		System.out.println(6 >= 7);
		System.out.println(6 != 7);// FONT LIGNATURES | FIRA CODE

//		BIT WISE OPERATORS
//		LOGIC GATES TRUTH TABLE

		System.out.println(~9);// NOT
//		1. Convert  to binary 
//		2. Apply th logic gates 
//		3. Convert the result to decimal again

		System.out.println(9 | 78);// 79
		System.out.println(86 & 7);
		System.out.println(9 ^ 5);
		System.out.println(68 ^ 68);

	}

}
