package com.java.oops.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

//		1 	: Robin
//		2 	: James
//		3	: Mina
//		10  : Tom
//		K	:	V

		HashMap<Integer, String> hashMap = new HashMap<>();

		// hashing will happen on Keys and not values
		hashMap.put(110, "Robin");// 1 Entry
		hashMap.put(21, "James");
		hashMap.put(13, "Mina");
		hashMap.put(40, "Tom");
		hashMap.put(5, "Kriti");
		hashMap.put(13, "Mary");//Keys cannot be duplicate But Valus can be

		System.out.println(hashMap);
		boolean containsKey = hashMap.containsKey(110);// one time hashing opeartion | SERCHING IS VERY FAST for Keys
		System.out.println(containsKey);

		boolean containsValue = hashMap.containsValue("Tom");
		System.out.println(containsValue);

		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();

		for (Entry<Integer, String> entry : entrySet) {
			System.out.println("KEY = " + entry.getKey() + " | " + entry.getValue());
		}

	}

}
