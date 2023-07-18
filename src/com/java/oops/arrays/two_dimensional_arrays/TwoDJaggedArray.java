package com.java.oops.arrays.two_dimensional_arrays;

public class TwoDJaggedArray {

	public static void main(String[] args) {

		int[][] matrix = { { 23, 43, 5, 32 }, { 23, 345, 6, 65, 54, 3 }, { 432, 6, 32 } };//jagged 2d array
		
		System.out.println("\n##############################################\n");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
