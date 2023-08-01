package com.java.oops.inheritance;

public class A {

	int x;

	public A(int x) {
//		super();
		this.x = x;
	}

	public static void main(String[] args) {
		int x = new B(6).x;
	}
}

class B extends A {

	public B(int x) {
		super(x);// calling the parent constructor using siper( )
	}

}

class C extends B {//R3 : Multilevel Inheritance is Allowed in Java

	public C(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

}

final class W{
	
}
//R4: final classes cannot be inherited

//class M extends W{
//	
//}



//R5: Cyclic Inheritance is banned in Java

//class X extends Y{
//	
//}
//
//class Y extends X{
//	
//}
