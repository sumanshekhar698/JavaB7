package com.java.oops.constructors;

public class Fruit {

	String color;
	int shelfLife;
	boolean isSeasonal;

	/*
	 * Fruit() { }// Default Conmstructor Java will create a default constructor if one has not declared
	 * in the class
	 */
	
	Fruit(){//explicit constructor | non parametrized // constructors dont have a retirn type
//		this("red",432,false);
		System.out.println("Fruit() called");
	}

	
	public Fruit(String color, int shelfLife, boolean isSeasonal) {// parameterized 
		//initializing the instance variables
		
		this();//constructor chaining | should be the 1st statement
		System.out.println("Fruit(paramterized) called");

		//Shadow problem
		this.color = color;
		this.shelfLife = shelfLife;
		this.isSeasonal = isSeasonal;
	}
	
	Fruit returnSelf(){
		return this;
	}
	
	

	
	

}
