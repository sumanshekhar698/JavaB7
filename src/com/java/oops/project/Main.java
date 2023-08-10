package com.java.oops.project;

import java.util.Scanner;


//support@yhills.com info@yhills.com
public class Main {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Lift Testing STARTS");

//		--------- Manual Call ------------
		manualElevator();
//		--------- Lunch Time Random Call ------------
//		automaticElevator();
		System.out.println("Lift Testing ENDS");

	}

	static void automaticElevator() throws InterruptedException {
		Elevator elevator = new Elevator();
		elevator.lunchtimeElevatorRush();
		elevator.start();
	}

	static void manualElevator() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Elevator elevator = new Elevator();

		System.out.println("Enter a starting floor 0 - 10");
		int start = sc.nextInt();
		System.out.println("Enter a destination floor 0 - 10");
		int end = sc.nextInt();
		elevator.callElevator(start, end);
		elevator.start();
	}

}
