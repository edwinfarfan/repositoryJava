/**
 * this is a comment could be first.
 */
package com.courses.java8.basic; // package must be first 

/** remenber the acronym PIC (picture): package, import, and class
 * 
 * Element
Package declaration	 		 : First line in the file
Import statements 	 		 : Immediately after the package
Class declaration (required) : Immediately after the import
Field declarations 			 : Anywhere inside a class
Method declarations 		 : Anywhere inside a class    
 * @author edwin.farfan
 *
 */

import java.util.*; 			// import must come after package

public class PICOrderingClass {  // then comes the class
	double weight; 			// fields and methods can go in either order
	public double getWeight() {
		return weight;
	 }
	double height; 			// another field – they don't need to be together


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
