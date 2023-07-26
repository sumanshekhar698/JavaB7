package com.java.oops.modifiers.final_keyword;

public class Main {

	public static void main(String[] args) {// final on local variables

		final float pi = 3.14159f;
		final int dozen;

		dozen = 12;
//		dozen = 12;

//		dozen++;
//		pi = -4;//final values cannot be reassigned
		Employee emp1 = new Employee("Michael",4);
//		emp1.id = 42342;
		System.out.println(emp1);
		
		
		Employee emp2 = new Employee("Mary",41);
		System.out.println(emp2);



	}

}
