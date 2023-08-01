package com.java.static_concept;

public class President {// Singelton Design Pattern

	String name;
	int age;
	private static President president;

	private President(String name, int age) {// use static logic somewhere
		this.name = name;
		this.age = age;
	}

	static President getPresident(String name, int age) {
		if (president == null)
			president = new President(name, age);

		return president;

	}

	@Override
	public String toString() {
		return "President [name=" + name + ", age=" + age + "]";
	}

}
