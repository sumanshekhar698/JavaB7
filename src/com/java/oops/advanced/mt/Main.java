package com.java.oops.advanced.mt;

public class Main {

	public static void main(String[] args) {

		System.out.println("START");
//		for (int i = 0; i < 10; i++) {
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(i + " => " +Thread.currentThread().getName());
//		}

		CustomThread1 t3 = new CustomThread1();
		Thread t4 = new Thread(new CustomWork());// Create a thread using Runnable interface
		Thread t5 = new Thread(() -> {// using lambda function
			for (int i = 0; i < 20; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i + " => " + Thread.currentThread() + " STATE => "+Thread.currentThread().getState());
			}
		});// Create a thread using Runnable interface

		System.out.println(t3.getState());
		System.out.println(t4.getState());
		System.out.println(t5.getState());

		t3.setName("t3");
		t4.setName("t4");
		t5.setName("t5");

		t3.start();
		t4.start();
		t5.start();

		t4.setPriority(Thread.MIN_PRIORITY);
		t5.setPriority(8);
		t3.setPriority(Thread.MAX_PRIORITY);

		System.out.println("END");

	}

}
