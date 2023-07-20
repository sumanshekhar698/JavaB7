package com.java.oops.constructors;

import com.java.oops.access_modifiers.Employee;

public class Main {

	public static void main(String[] args) {

//		Fruit apple = new Fruit();//Constructor is triggered automatically while creating an object but only once
		Fruit mango = new Fruit("yellow", 10, true);
		System.out.println(mango.color);
		System.out.println(mango.hashCode());
		Fruit returnSelf = mango.returnSelf();
		System.out.println(returnSelf.hashCode());
		
//		Employee emp1 = new Employee("John", 700000, 156, true);



	}

}
