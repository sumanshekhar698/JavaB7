package com.java.oops.modifiers.final_keyword;

public class Employee {

	String name;
	final int id;//final on instance variables

//	public Employee(String name, int id) {
//		this.name = name;
//		this.id = id;
//	}


	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
//		return "NNNNNNNNNNNNNNNNNNNNNN";
	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
//		this.id = id;

	}

//	public Employee() {// once your ID is final, you have an option to intialize in the constructor
//	}
	
	

}
