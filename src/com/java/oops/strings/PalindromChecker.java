package com.java.oops.strings;

import java.util.Scanner;

public class PalindromChecker {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word to check for Palindrome");
//		PALINDROME
		String input = scanner.next();

		boolean result = palindromeChecker(input);
		System.out.println(result);

	}

	static boolean palindromeChecker(String input) {

		String reversed = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);

		}

		if (reversed.equals(reversed))
			return true;
		else

			return false;
	}

}
