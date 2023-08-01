package com.java.oops.inheritance;

public class Player {// Object
	String name;
	int age;
	int jerseyNumber;
	String nationality;
	private int salary;//R2 : private things are not inherited
	Gender gender;// male OR female
	int test = 9;

	public Player(String name, int age, int jerseyNumber, String nationality, Gender gender) {
//		super();
		System.out.println("Player() called");

		this.name = name;
		this.age = age;
		this.jerseyNumber = jerseyNumber;
		this.nationality = nationality;
		this.gender = gender;
	}

	void sayMyData() {
		System.out.println("Name :" + name);
	}
	
	void sayMyName() {//thsi wil be inherited to all of the child
		System.out.println("Name :" + name);
	}

}

//IPLPlayer
//FootballPlayer
