package com.java.static_concept;

public class Main {

	public static void main(String[] args) {

//		Main main = new Main();
//		main.test();

		
		Student mary = new Student(4, "Mary");
		mary.id = 5;
		mary.collegeName = "IIT Delhi";
		System.out.println(mary);

		Student john = new Student(8, "John");
		john.collegeName = "Harvads";
		System.out.println(john);

		System.out.println(mary.collegeName);
		mary.collegeName = "Hogwards";

		System.out.println(mary.collegeName);
		System.out.println(john.collegeName);

		// 2. static things can be access by object refrence BUT its a good habit to
		// access by class name
		System.out.println(Student.collegeName);

	}

	void test() {
		System.out.println("TESTING");
	}

}
