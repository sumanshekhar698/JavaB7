package com.java.static_concept;

public class Empolyee {

	String id;//EMP1 EMP2
	String name;
	static int counter = 0;
	
	
	public Empolyee(String name) {
		this.id = "EMP" + ++counter;
		this.name = name;
		
	}


	@Override
	public String toString() {
		return "Empolyee [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
