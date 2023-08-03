package com.java.oops.abstraction;

public class Main {

	public static void main(String[] args) {

//		new Bank();//you cannot DIRECTLY create an object of an abstract class
		RBL rbl = new RBL();
		System.out.println(rbl);
		rbl.balanceOfAnATM();
		
		RBL rb3 = new RBL();


		Bank rbl2 = new RBL();
		System.out.println(rbl2);

		Bank lakshmiBank = new Bank() {// creating an object of an abstract class using Annoymous Inner Type

			@Override
			void balanceOfAnATM() {
				System.out.println("Balance :: 3cr");

			}
		};
		
		lakshmiBank.balanceOfAnATM();

	}

}
