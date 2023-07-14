package com.java.oops.strings;

import java.util.Arrays;

public class SomeStringMethods {

	public static void main(String[] args) {
		String movie = " Mission Impossible  ";
		String movie_title = " - Dead Reckoning Part One  ";

//		movie = movie.concat(movie_title);
		movie += movie_title;

		System.out.println(movie.trim());
		System.out.println();

		System.out.println(Arrays.toString(movie.split(" ")));

		movie.isEmpty();
		boolean isEmpty = movie.length() == 0;
		
		System.out.println(movie.indexOf('n'));
		System.out.println(movie.lastIndexOf('n'));


	}

}
