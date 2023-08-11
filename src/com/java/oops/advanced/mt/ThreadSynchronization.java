package com.java.oops.advanced.mt;

public class ThreadSynchronization {

	public static void main(String[] args) {
		
		Operation ops = new Operation();
		Thread1 t1 = new Thread1(ops);
		t1.setName("t1");
		
		Thread1 t2 = new Thread1(ops);
		t2.setName("t2");
		
		Thread1 t3 = new Thread1(ops);
		t3.setName("t3");
		
		t1.start();
		t2.start();
		t3.start();

	}

}

class Operation {

	synchronized void printNum(int n) {
		for (int i = 0; i < n; i++) {
			try {
				Thread.sleep(100);
				System.out.println(i + " " + Thread.currentThread() + "STATE => " + Thread.currentThread().getState());

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}

class Thread1 extends Thread {
	Operation ops;

	public Thread1(Operation ops) {
		super();
		this.ops = ops;
	}

	@Override
	public void run() {
		ops.printNum(25);
	}

}

class Thread2 extends Thread {
	Operation ops;

	public Thread2(Operation ops) {
		super();
		this.ops = ops;
	}

	@Override
	public void run() {
		ops.printNum(25);
	}

}

class Thread3 extends Thread {
	Operation ops;

	public Thread3(Operation ops) {
		super();
		this.ops = ops;
	}

	@Override
	public void run() {
		ops.printNum(25);
	}

}
