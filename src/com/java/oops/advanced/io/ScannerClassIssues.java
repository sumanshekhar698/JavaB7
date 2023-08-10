package com.java.oops.advanced.io;

import java.util.Scanner;

public class ScannerClassIssues {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int num = sc.nextInt();
		System.out.println(num);
		
		
		sc.nextLine();//FLUSING
		System.out.println("Enter your name");
		String name = sc.nextLine();

		System.out.println(name.length());
		System.out.println(name);
		
		System.out.println("Tom" + "Jerry");

	}

}
