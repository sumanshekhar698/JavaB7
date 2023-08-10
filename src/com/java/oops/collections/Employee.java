package com.java.oops.collections;

public class Employee implements Comparable<Employee> {

	int empID;
	String name;
	int age;

	public Employee(int empID, String name, int age) {
		super();
		this.empID = empID;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee e1) {
		if (e1.age == this.age)
			return 0;
		else if (e1.age < this.age)
			return 1;// positive no
		else
			return -1;// negative no

	}

}
