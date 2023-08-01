package com.java.static_concept;

import java.util.Scanner;

public class Operator {

	
	private static Scanner scanner = new Scanner(System.in);//resource optimization
	
	void takeInput() {
		System.out.println("Enter your name");
//		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Name: " + name);
	}
}
