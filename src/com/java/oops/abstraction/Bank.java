package com.java.oops.abstraction;

abstract public class Bank {// What is the level of abstraction
	// Currently, Partial Abstraction because this class is having both concerete and abstract methods

	// if you have atleast 1 abstract method in the class. make sure to put the
	// abstract keyword in front of the class

	String name;
	String IFSC_CODE;

	void giveMeBankDetails() {// concrete methods are methods with body
		System.out.println("Name : " + name + "\nIFSC : " + IFSC_CODE);
	}

	abstract void balanceOfAnATM();// abstract methods dont have body
	// R1: If a method is abstract, make sure to use abstarct keyword

}
