package com.courses.java8.basic;

public class DeclaringInitializingVars {
	// declaring variables
		String zooName;
		int numberOfObjects;
		
		// declare multiple variables in single line if they are the same type
		String s1, s2;
		String s3 = "yes", s4 = "no";
		
		// only i3 is explicitly initialized although i1 and i2 are also zero because that is the default
		// value for int vars
		int i1, i2, i3 = 0;
		

		// valid examples
		boolean b1, b2;
		String s5 = "1", s6;
		int i4; int i5;
		
		// initializing variables, compile error?
		//zooName = "The Best of the world";
		//numberOfObjects = 100;

		// declaring and initializing variables in one line
		String zooName2 = "The Best Zoo";
		int numberOfObjects2 = 100;
				
}
