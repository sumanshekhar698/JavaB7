package com.java.oops.arrays.two_dimensional_arrays;

public class AdditionOfTwoDArrays {

	public static void main(String[] args) {
//		ASSUMPTION : Both 2D Arrays are Symmetric
		int[][] matrix1 = { { 23, 43, 5, 32 }, { 23, 345, 6, 65 }, { 432, 6, 32, 5 }

		};// 3*4

		int[][] matrix2 = { { 3, 453, 5, -732 }, { 23, 2, 6, 465 }, { 42, -6, 32, 25 } };// 3*4

		// checking eligiblity for addition
		if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
			int[][] result = new int[matrix1.length][matrix1[0].length];

			// addition logic
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1[0].length; j++) {
					result[i][j] = matrix1[i][j] + matrix2[i][j];
				}
			}

			// printing logic
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[i].length; j++) {
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}

		} else {
			System.out.println("Addition not possible");
		}

	}

}
