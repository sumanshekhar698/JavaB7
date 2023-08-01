package com.java.oops.inheritance;

public class IPLPlayer extends Player {//a class can have only one IMMEDIATE parent BUT a parent can have mutiple childs
	//R1 Multiple Inheritance is banned in Java

	boolean isAllRounder;
	boolean hasOrangeCap;
	int matchesPlayed;

	public IPLPlayer(String name, int age, int jerseyNumber, String nationality, Gender gender, boolean isAllRounder,
			boolean hasOrangeCap, int matchesPlayed) {
		super(name, age, jerseyNumber, nationality, gender);
		System.out.println("IPLPlayer() called");

		this.isAllRounder = isAllRounder;
		this.hasOrangeCap = hasOrangeCap;
		this.matchesPlayed = matchesPlayed;
	}

	@Override
	public String toString() {
		return "IPLPlayer [isAllRounder=" + isAllRounder + ", hasOrangeCap=" + hasOrangeCap + ", matchesPlayed="
				+ matchesPlayed + ", name=" + name + ", age=" + age + ", jerseyNumber=" + jerseyNumber
				+ ", nationality=" + nationality + ", gender=" + gender + "]";
	}

}
