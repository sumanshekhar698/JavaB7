package com.java.oops.access_modifiers;

//Encapsulation
 public class Employee {

	// instance variables
	String name;
	private long salary;// private entities can only be access within the class
	public int empId;
	private boolean isFullTime;

	public long getSalary() {
		return salary;
	}

	public boolean getIsFullTime() {
		return isFullTime;
	}

	public void setIsFullTime(boolean isFullTime) {
		this.isFullTime = isFullTime;
	}

	// methods
	void sayMyName() {
		int x;
		System.out.println("NAME :" + name);
	}

	public Employee(String name, long salary, int empId, boolean isFullTime) {
		this.name = name;
		this.salary = salary;
		this.empId = empId;
		this.isFullTime = isFullTime;
	}

}
