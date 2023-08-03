package com.java.oops.abstraction.interface_types;

public class Main {

	public static void main(String[] args) {

		A320 a320 = new A320();

		Airbus airbus = new Airbus() {

			@Override
			public int numberOfPlanes() {
				return 5350;
			}
		};

		Airbus aibus2 = () -> {// lambda funtion can be ONLY used on Functional Interfaces
			return 6789;
		};

	}
}

class A320 implements Airbus {

	@Override
	public int numberOfPlanes() {

		return 7220;
	}

}
