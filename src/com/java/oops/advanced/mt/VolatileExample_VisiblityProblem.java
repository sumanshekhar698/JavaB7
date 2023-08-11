package com.java.oops.advanced.mt;

public class VolatileExample_VisiblityProblem {

	static volatile boolean flag = true;

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			while (flag) {
				System.out.println("STOP ME IF YOU CAN!!!");
			}
		});
		t1.start();
		
		Thread t2 = new Thread(() -> {
			flag = false;
		});
		t2.start();
		
	}

}
