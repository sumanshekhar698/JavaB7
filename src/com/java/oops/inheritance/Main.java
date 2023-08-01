package com.java.oops.inheritance;

public class Main {

	public static void main(String[] args) {

		IPLPlayer virat = new IPLPlayer("Virat", 40, 18, "IND", Gender.Male, true, true, 189);
		System.out.println(virat);
		
		TennisPlayer maria = new TennisPlayer("Maria Sharapowa", 50, 20, "RUS", Gender.Female, 3);
		System.out.println(maria);
		maria.sayMyData();
		maria.test();
//		System.out.println(maria.salary);//private things are not inherited

	}

}
