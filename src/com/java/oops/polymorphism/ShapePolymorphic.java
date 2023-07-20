package com.java.oops.polymorphism;

public class ShapePolymorphic {
//	CompileTimePloymorphism ✅ - Nethods calls will be determined duint time compile time only

	
	
	// If the method name is differnet
	// But of the method name is identical
	// The main motive is the method should uniquely identify
	// Parametr number
	// Parametr Type
	// Parameter Position
	
	
	// RETURN TYPE DOESNT MATTER IN POLYMORPHISM

	int shape(int side) {
		return side * side;
	}

	double shape(float radius) {
		return radius * radius * Math.PI;
	}

	float shape(int breadth, float length) {
		return length * breadth;
	}

	float shape(float base, int height) {
		return 0.5f * base * height;
	}

}
