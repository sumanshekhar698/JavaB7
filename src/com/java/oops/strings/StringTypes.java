package com.java.oops.strings;

public class StringTypes {

	public static void main(String[] args) {

		String x = "MISSION IMPOSSIBLE";
		String z = "MISSION IMPOSSIBLE";
		String y = new String("MISSION IMPOSSIBLE");
		String w = new String("MISSION impossible");


		
		//COMPARING REFRENCES OF OBJECTS
		if (x == z)// == does not comapres content | it only compares references 
			System.out.println("SAME");
		else
			System.out.println("DIFFERENT");

		if (x == y)
			System.out.println("SAME");
		else
			System.out.println("DIFFERENT");
		
		
		//COMPARING CONTENTS OF STRINGS OBJECTS
		

		if (x.equals(y))
			System.out.println("SAME");
		else
			System.out.println("DIFFERENT");
		
		
		if (x.equalsIgnoreCase(w))
			System.out.println("SAME");
		else
			System.out.println("DIFFERENT");
		
		
		
		

	}

}
