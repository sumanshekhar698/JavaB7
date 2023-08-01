package com.java.static_concept;

public class Student {

	//static variable
	static String collegeName;//1. static things are not object lever rather they are class level
	
	//2 instance variables
	int id;
	String name;
	
	static {
		collegeName = "NIT";
		System.out.println("static things loaded");//4. static things are first to get loaded
	}
	
	
	static {
		System.out.println("static things loaded twice");//4. static things are first to get loaded
	}

	public Student(int id, String name) {
		System.out.println("Student() triggred");
		this.id = id;
		this.name = name;
		
		
		//its recomended that static things should be accessd in a static way
		System.out.println(Student.collegeName);//by class name
		System.out.println(collegeName);// if in the same class directly

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	static void sayMyCollegeName() {
		System.out.println("NAME : "+collegeName);//3. Inside a static method or a block you can only access static things(variables and mthods) directly
	}
	
	 void sayMyName() {
		System.out.println("NAME : "+name);}


}
