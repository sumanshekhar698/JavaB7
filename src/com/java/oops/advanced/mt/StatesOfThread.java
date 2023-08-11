package com.java.oops.advanced.mt;

public class StatesOfThread {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("START " + Thread.currentThread() + "STATE => " + Thread.currentThread().getState());

		CustomThread1 t1 = new CustomThread1();
		t1.setName("t1");
		System.out.println(t1.getState());
		t1.start();
		t1.join();
		System.out.println(t1.getState());

		

		System.out.println("END " + Thread.currentThread() + "STATE => " + Thread.currentThread().getState());

	}

}
