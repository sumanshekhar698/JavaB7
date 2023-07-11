package com.java.basics2;

public class Factorial {// Arsmtrong Number r1:5 ---> r2:100000

	public static void main(String[] args) {

		long num = 25L;
//		0 <= num <= 25

//		6 -> 6*5*4*3*2*1
//		200!
//		-ve --> no factorial
//		0 --> 1
//		1 ---> 1

//		if else if ladder
		if (num < 0) {
			System.out.println("Invalid number for Factorial as -ve numbers dont have factorials");
		} else if (num == 0) {
			System.out.println("FACTORIAL = 1");
		} else {
			long ans = 1;
			for (long i = num; i >= 1; i--) {
//				ans *= i;
				ans = ans * i;
			}
			System.out.println("FACTORIAL ==> " + ans);
		}
		
		
		//if
		//if else
		//if, else if ,else if  ,else if
		//if ,else if ,else if , else if, else


	}

}
