package com.java.oops.access_modifiers;

public class Main {

	public static void main(String[] args) {

		Employee emp1 = new Employee("John", 700000, 156, true);
		
		System.out.println(emp1.getSalary());
		System.out.println(emp1.getIsFullTime());
		emp1.setIsFullTime(false);
		System.out.println(emp1.getIsFullTime());

//		emp1.salary = 0;
//		System.out.println(emp1.salary);


	}

}
