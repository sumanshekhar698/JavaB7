package com.java.oops.inheritance;

public class TypCasting {

	public static void main(String[] args) {

		Eagle e = new Eagle();
		Animal a = e;// Upcasting is implicit
		Object o = a;

//		e.species = "Himalyan";
//		e.flyingHeightInMeters = 1300;

		e.isDangerous(false);
//		o.isDangerous(false);

//		e.getFlyingHeight();

		// Downcasting
//		Eagle e2 = (Eagle) new Animal();// Upcasting is not implicit rather it is explicit
//		System.out.println(e2);

		Animal a2 = new Eagle();

//		Eagle

		if (a2 instanceof Eagle) {// befor writing a downcasting logic, please check using instanceof operator
			System.out.println(true);
			Eagle e4 = (Eagle) a2;
			System.out.println(a2);
		} else {
			System.out.println(false);
		}

	}

}
