package com.java.oops.strings;

public class MutableStrings {

	public static void main(String[] args) {
		// StringBuilder
		// StringBuffer - is prefeerred for MT env

		StringBuilder stringBuilder = new StringBuilder("MI");
		stringBuilder.append("SSION");

		System.out.println(stringBuilder);
		stringBuilder.delete(1, 3);
		System.out.println(stringBuilder);

		stringBuilder.reverse();
		System.out.println(stringBuilder);

		String m = "MANGO";
		StringBuffer n = new StringBuffer("MANGO");
		StringBuilder o = new StringBuilder("MANGO");


		if (m.equals(n.toString()))
			System.out.println("true");
		else
			System.out.println("false");
		
		if (n.toString().equals(o.toString()))
			System.out.println("true");
		else
			System.out.println("false");


	}

}
