package com.courses.java8.basic;

public class FinalizerClass {

	/**
	 * this method run when the object is eligible for garbage collection
	 * finalize() call could run zero or one time
	 */
	@Override
	protected void finalize() {
		System.out.println("Calling finalize");
	}
	public static void main(String[] args) {
		FinalizerClass f ;
		f = new FinalizerClass();
		//f = null;
		
		FinalizerClass f2 = new FinalizerClass();
		
		f =f2;
	} 

}
