package com.java.static_concept;

import java.util.Collections;

public class MainOperator {

	public static void main(String[] args) {

		Operator op1 = new Operator();
		Operator op2 = new Operator();
		Operator op3 = new Operator();

		op1.takeInput();
		op2.takeInput();
//		Operator.scanner.close();
		op3.takeInput();

		System.out.println("Enter fav color");
//		String color = Operator.scanner.next();
//		System.out.println("color : " + color);

	}

}
