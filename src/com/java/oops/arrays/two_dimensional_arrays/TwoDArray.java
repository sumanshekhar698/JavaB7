package com.java.oops.arrays.two_dimensional_arrays;

public class TwoDArray {

	public static void main(String[] args) {

		int[][] matrix = { 
				{ 23, 43, 5, 32 }, 
				{ 23, 345, 6, 65 }, 
				{ 432, 6, 32, 5 }

		};// 3*4
		System.out.println(matrix.length);
		
		System.out.println(matrix);
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(matrix[i]);
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
