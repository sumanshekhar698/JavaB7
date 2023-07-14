package com.java.oops.arrays.one_dimension;

import java.util.Arrays;

public class ArraysUtilityClass {

	public static void main(String[] args) {
		int[] arr = { 4, 342, 34, 43, 43, 4323, 2, 13, 3, 23, };

		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		Arrays.fill(arr, -9);
		Arrays.fill(arr, 2, 6, 7);
		System.out.println(Arrays.toString(arr));

	}

}
