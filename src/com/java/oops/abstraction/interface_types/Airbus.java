package com.java.oops.abstraction.interface_types;

@FunctionalInterface
public interface Airbus {// Inside a functional interface you should have exactly one abstract method

	int numberOfPlanes();
//	int numberOfFighterPlanes();

	static void worldRankin() {
		System.out.println("1st");
	}

}
