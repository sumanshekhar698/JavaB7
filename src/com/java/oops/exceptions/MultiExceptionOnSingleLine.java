package com.java.oops.exceptions;

import java.util.Scanner;

public class MultiExceptionOnSingleLine {

	public static void main(String[] args) {
		System.out.println("START");

		int[] arr = { 23, 32, 3, 3, 21342, 34 };// 6
		Scanner sc = new Scanner(System.in);

		// try catch
		// try catch catch catch
		// try catch finally
		// try catch catch catch finally
		// try finally
		try {// handling of exeption
				// unchecked exceptions => optional to handle
//			return;
			System.out.println(arr[6 / sc.nextInt()]);// 0 - 5

		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {// default exception block
			System.out.println(e);
		} finally {
//			System.exit(0);
			System.out.println("Scanner closed");
			sc.close();

		}
	}
}
