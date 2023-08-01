package com.java.oops.inheritance;

public class Cattle {

	static String species;

	static String getSpecies() {// method hiding
		return species;
	}

	void test() {

	}

	public static void main(String[] args) {
		Sheep sheep = new Sheep();
		String species2 = sheep.getSpecies();// static method are getting inherited
		System.out.println(species2);
	}

}

class Sheep extends Cattle {

//	@Override //Dont try to override Static methods
	static String getSpecies() {
		return species + " breeded";
	}
}
