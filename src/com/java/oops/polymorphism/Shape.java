package com.java.oops.polymorphism;

public class Shape {

	int square(int side) {
		return side * side;
	}

	double circle(float radius) {
		return radius * radius * Math.PI;
	}

	float rectangle(float length, int breadth) {
		return length * breadth;
	}

	float triangle(float base, int height) {
		return 0.5f * base * height;
	}

}
