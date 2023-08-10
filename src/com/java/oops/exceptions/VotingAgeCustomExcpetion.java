package com.java.oops.exceptions;

import java.util.Scanner;

public class VotingAgeCustomExcpetion {

	public static void main(String[] args) {

		System.out.println("Enter your AGE");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try {
			checkVotingAge(age);
		} catch (InvalidVotingAgeException e) {
			e.printStackTrace();
		}

	}

	private static void checkVotingAge(int age) throws InvalidVotingAgeException {
		if (age >= 18) {
			System.out.println("Eligible for Voting");
		} else {
			System.out.println("Not Eligible for Voting");
			throw new InvalidVotingAgeException("Not Eligible for Voting");

		}
	}

}

class InvalidVotingAgeException extends Exception {

	public InvalidVotingAgeException(String message) {
		super(message);
	}

}
