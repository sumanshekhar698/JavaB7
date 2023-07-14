package com.java.oops.arrays.one_dimension;

import java.util.Arrays;

public class PassByValueAndReference {

	public static void main(String[] args) {

		int x = 9;
		int[] arr = { 4, 342, 34, 43, 43, 4323, 2, 13, 3, 23, 78 };

//		COPY

		int[] arrCopy = new int[arr.length];
		for (int i = 0; i < arrCopy.length; i++) {
			arrCopy[i] = arr[i];
		}
		
		int [] arrSmartCopy = arr.clone();//its valid for 1D arrays only
		change(x, arrSmartCopy);

		System.out.println(x);//
		System.out.println(Arrays.toString(arr));//
		System.out.println(Arrays.toString(arrSmartCopy));//


	}

	private static void change(int x, int[] art) {// pass by value, pass by reference
		x = 67;
		Arrays.fill(art, -88);
	}

}
