package com.java.oops.exceptions;

public class ThrowsExample {

	public static void main(String[] args) {// DEH = Default Exception Handler
		new ThrowsExample().test1();

	}

	void test1() {
		try {
			test2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void test2() throws InterruptedException {
		test3();
	}

	void test3() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			Thread.sleep(500);
		}

	}

}
