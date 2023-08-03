package com.java.oops.abstraction;

public class RBL extends Bank {

	
	@Override
	void balanceOfAnATM() {// it is the duty of the child class to provide the body for the unimplemenetd
							// methods of the parent abstract class
		System.out.println("Balance :: 2cr");

	}

	@Override
	public String toString() {
		return "RBL [name=" + name + ", IFSC_CODE=" + IFSC_CODE + "]";
	}

}
