package com.java.basics2;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		outer: while (true) {
			System.out.println(
					"Enter you favourite drink:\n1: Coke \n2: Mountain Dew \n3: Milk \n4: Mineral Water\n0: Exit");
			int kritikaChoice = scanner.nextInt();

//			if (kritikaChoice == 0) {//ACCEPTABLE
//				break;
//			}
			switch (kritikaChoice) {

			case 1: {
				System.out.println("Enjoy yor Coke!");
				break;
			}
			case 2: {
				System.out.println("Enjoy yor Dew and darr ke aage jeet hai!");
				break;
			}
			case 3: {
				System.out.println("Enjoy your Milk as its a heatlhier option!");
				break;
			}
			case 4: {
				System.out.println("Just Have your water!");
				break;
			}
			case 0: {
				System.out.println("Thanks for using our service :) ");
//				System.exit(8997);//ACCEPTABLE
				break outer;
			}

			default:// Optional but good to have
				System.out.println("Invalid Choice !!");
				break;
			}

			System.out.println("<==== *** ===>");

		}

//		Menu Driven Program

	}

}
