package com.java.oops.arrays.two_dimensional_arrays;

import java.util.Arrays;

public class TwoDArrayQuestions {

	public static void main(String[] args) {

		int[][] matrix = { { 23, 43, 5, 32 }, { 23, 345, 6, 65 }, { 432, 6, 32, 5 } };

		for (int i = 0; i < matrix.length; i++) {
			Arrays.sort(matrix[i]);
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		//cloning
//		int[][] cloneMatrix = matrix.clone();
		int[][] cloneMatrix = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < cloneMatrix.length; i++) {
			cloneMatrix[i] = matrix[i].clone();
		}

		
		Arrays.fill(matrix[0], -9);
		
		System.out.println("\n##############################################\n");
		for (int i = 0; i < cloneMatrix.length; i++) {
			for (int j = 0; j < cloneMatrix[i].length; j++) {
				System.out.print(cloneMatrix[i][j] + " ");
			}
			System.out.println();
		}
		

	}
}