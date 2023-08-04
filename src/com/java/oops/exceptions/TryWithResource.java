package com.java.oops.exceptions;

import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		System.out.println("START");

		int[] arr = { 23, 32, 3, 3, 21342, 34 };// 6

		// try catch
		// try catch catch catch
		// try catch finally
		// try catch catch catch finally
		// try finally
		// try with resource
		try (Scanner sc = new Scanner(System.in);) {// AutoCloseable child resoucrese are only one which are auto closed
			// unchecked exceptions => optional to handle
//			return;
			System.out.println(arr[6 / sc.nextInt()]);// 0 - 5

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

//		finally {
//			sc.close();
//		}

	}

}
