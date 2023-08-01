package com.java.static_concept;

public class MainPresident {

	public static void main(String[] args) {
//		President p1 = new President("Biden", 70);
//		President p2 = new President("Biden", 7);
		
		
		//Singelton Paatter of OOPS
		President p1 = President.getPresident("Biden", 70);
		President p2 = President.getPresident("Donald", 60);

		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1);
		System.out.println(p2);



	}

}
