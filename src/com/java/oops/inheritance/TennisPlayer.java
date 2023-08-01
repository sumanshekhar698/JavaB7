package com.java.oops.inheritance;

public class TennisPlayer extends Player {

	int wimbeldonWon;
	int test = 8;

	public TennisPlayer(String name, int age, int jerseyNumber, String nationality, Gender gender, int wimbeldonWon) {
		super(name, age, jerseyNumber, nationality, gender);
		this.wimbeldonWon = wimbeldonWon;
	}

	@Override
	public String toString() {
		return "TennisPlayer [wimbeldonWon=" + wimbeldonWon + ", name=" + name + ", age=" + age + ", jerseyNumber="
				+ jerseyNumber + ", nationality=" + nationality + ", gender=" + gender + "]";
	}

	@Override//Annotation 
	void sayMyData() {//overiddedn method
		System.out.println("Data :" + name + " | " + age);
	}
	
	void isRetired() {//specialized method
		
		if(this.age > 50)
			System.out.println("Retired");
		else
			System.out.println("Still palying");
	}
	
	void test() {
		System.out.println(test);//8
		System.out.println(this.test);//8
		System.out.println(super.test);//super is used to access the things of IMMEDIATE parent
		super.sayMyName();

	}
	
	

}
