package com.java.oops.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetExample {

	public static void main(String[] args) {

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(324);
		arrList.add(2);
		arrList.add(45);
		arrList.add(2);
		arrList.add(2, 200);

		arrList.add(45);// it adds the element at the end
//		arrList.add("Suman");
		arrList.add(1000);//
		arrList.add(0, 99);//

		System.out.println(arrList);// [99, 324, 2, 200, 45, 2, 45, 1000]
		arrList.contains(1000);//8

		ArrayList<Integer> arrListUnique = new ArrayList<Integer>();

		for (Integer num : arrList) {
			if (!arrListUnique.contains(num)) {
				arrListUnique.add(num);
			}
		}

		System.out.println(arrListUnique);// [99, 324, 2, 200, 45, 2, 45, 1000]


		HashSet<Integer> hashSetNum = new HashSet<Integer>();//order not preserved and no index accss
		for (Integer num : arrList) {
			hashSetNum.add(num);
		}
		
		Set<Integer> collect2 = arrList.stream().collect(Collectors.toSet());
		System.out.println("SET => "+collect2);

		System.out.println(hashSetNum);// the positions are not RANDOM
		hashSetNum.add(98987);
		System.out.println(hashSetNum);
		
		List<Integer> collect = hashSetNum.stream().collect(Collectors.toList());
		System.out.println(collect);
		
		boolean contains = collect.contains(2);//10000000000
		System.out.println(contains);//1 time |SEARCHING IS VERY VERY FAST
		


	}

}
