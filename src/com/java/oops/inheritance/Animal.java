package com.java.oops.inheritance;

public class Animal {

	String name;

	void isDangerous(boolean dangerous) {
		System.out.println(" =? " + dangerous);
	}

}

class Eagle extends Animal {
	String species;
	int flyingHeightInMeters;

	void getFlyingHeight() {// Special method
		System.out.println("Height " + flyingHeightInMeters);
	}
}
