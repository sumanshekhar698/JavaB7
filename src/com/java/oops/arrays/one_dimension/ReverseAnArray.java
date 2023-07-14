package com.java.oops.arrays.one_dimension;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr = { 4, 342, 34, 43, 43, 4323, 2, 13, 3, 23, 78 };

		System.out.println(Arrays.toString(arr));

		int[] reversedArr = new int[arr.length];// backup array

		int counter = 0;
		for (int i = reversedArr.length - 1; i >= 0; i--) {
			reversedArr[counter++] = arr[i];
		}

		int i = 0, j = arr.length - 1, temp;
		while (i <= j) {

			// swapping two numbeers
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;

		}

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(reversedArr));

	}

}
