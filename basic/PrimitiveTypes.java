package com.courses.java8.basic;

public class PrimitiveTypes {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

//		double notAtStart = _1000.00; // DOES NOT COMPILE
//		double notAtEnd = 1000.00_; // DOES NOT COMPILE
//		double notByDecimal = 1000_.00; // DOES NOT COMPILE
		double annoyingButLegal = 1_00_0.0_0; // this one compiles

		
		//long maxi = 3123456789; ///the number is out of range

		long max = 3123456789L; // now Java knows it is a long

		// si no pones "L" genera un error
		

		//los primitivos no tienen referencia a un objeto
		//int value = null;    // DOES NOT COMPILE
		
		
		String reference = "hello";
		int len = reference.length();
//		int bad = len.length(); // does not compile, len es un primitivo

		

	}

}
