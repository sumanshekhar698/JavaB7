package com.java.oops.polymorphism;


class MainTwo{
	public static void main(String[] args) {
		System.out.println("MainTwo main");
	}
}

public class Main {

	public static void main(String[] args) {// p s v main (String[] args)

//		MainTwo.main(args);
		Shape shape = new Shape();
		System.out.println(shape.circle(7));
		System.out.println(shape.square(7));
		System.out.println(shape.rectangle(1.77f, 7));
		System.out.println(shape.triangle(7.9f, 7));

		// improves code readiblity
		System.out.println();
		ShapePolymorphic shapePolymorphic = new ShapePolymorphic();
		System.out.println(shapePolymorphic.shape(5.6f));// circle
		System.out.println(shapePolymorphic.shape(5));// square
		System.out.println(shapePolymorphic.shape(8, 5.6f));// rectangle
		System.out.println(shapePolymorphic.shape(5.6f, 87));// triangle

//		CompileTime ✅ - Nethods calls will be determined duint time compile time only

//		RunTime

	}

	public static void main(int... args) {
		System.out.println("main int");

	}

}


