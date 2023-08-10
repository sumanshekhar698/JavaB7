package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		int[] arr = { 23, 43, 54, 3, 423, 8 };
		// Size is fixed
		// Homogenous

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(324);
		arrList.add(2);
		arrList.add(45);
		arrList.add(2);
		arrList.add(2, 200);


		arrList.add(242343);//it adds the element at the end
//		arrList.add("Suman");
		arrList.add(1000);//[324, 2, 200, 45, 2, 242343, 1000]
		arrList.add(0,99);//[99,	324, 2, 200, 45, 2, 242343, 1000]

		System.out.println(arrList);
		System.out.println(arrList.size());

		// 1st way
		for (int i = 0; i < arrList.size(); i++) {// Horrible way to iterate an ArrayList
//			arrList.add(i);//You should not mutate the same collection while looping
			System.out.print(arrList.get(i) + " ");
		}

		System.out.println();

		// 2nd way
		for (Integer num : arrList) {// much safer to use
//			arrList.add(88);//java.util.ConcurrentModificationException
			System.out.print(num + " ");
		}

		System.out.println();
//		 [  324, 2, 45,2 , 242343 ]
		// 3rd way
		Iterator<Integer> itr = arrList.iterator();
		while (itr.hasNext()) {
			Integer num = (Integer) itr.next();
			System.out.print(num + " ");
		}

		System.out.println();

//		4th //		 [  324, 2, 45,2 , 242343 ]
		arrList.stream().forEach(System.out::println);// :: double colon operator

		Collections.sort(arrList);
		System.out.println(arrList);
		
		Collections.sort(arrList, Collections.reverseOrder());
		System.out.println(arrList);
		
		
		arrList.add(null);
		Collections.shuffle(arrList);
		System.out.println(arrList);
		
		boolean contains = arrList.contains(1000);
		System.out.println(contains);
		
	

	}

}
