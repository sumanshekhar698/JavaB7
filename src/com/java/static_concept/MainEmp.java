package com.java.static_concept;

public class MainEmp {

	public static void main(String[] args) {

		Empolyee emp1 = new Empolyee("John");
		Empolyee emp2 = new Empolyee("Jacob");
		Empolyee emp3 = new Empolyee("Josh");
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		System.out.println(Constants.VALUE_OF_PI);
		System.out.println(Math.PI);



//		Empolyee employees[] = { emp1, emp2, emp3 };
//		
//		int counter = 1;
//		for (int i = 0; i < employees.length; i++) {
//			employees[i].id = "EMP"+ counter++;
//		}

	}

}
