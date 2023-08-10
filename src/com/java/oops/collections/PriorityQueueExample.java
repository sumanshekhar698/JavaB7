package com.java.oops.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();// Min Heap
		PriorityQueue<Integer> pq1 = new PriorityQueue(Collections.reverseOrder());// Max Heap
		
		pq.add(34);
		pq.add(3);
		pq.add(74);
		pq.add(34);
		pq.add(33);
		pq.add(1);
		pq.add(-2);
		pq.add(44);

		System.out.println(pq);
		Integer poll = pq.poll();
		System.out.println(poll);
		System.out.println(pq);

		System.out.println(pq.poll());
		System.out.println(pq);

		System.out.println(pq.poll());
		System.out.println(pq);

		System.out.println(pq.poll());
		System.out.println(pq);

		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());

	}

}
