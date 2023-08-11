package com.java.oops.advanced.mt;

public class CustomWork implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " => " + Thread.currentThread() + " STATE => "+Thread.currentThread().getState());
		}
	}

}
