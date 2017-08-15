package com.courses.java8.basic;

/**
 * 1. el constructor llama otro constructor usando this, or a su clase padre usando super.
	2. super() debe de ser la primera llamada en el constructor.
	3. Si el super() no es llamado explicitamente en el constructor, Java insertara super() por defecto.
	4. Si la clase padre no tiene un constructor sin argumentos y en la clase hija no define un constructor, el compilador lanzara un error. 
	5. If the parent doesn’t have a no-argument constructor, the compiler requires an explicit
	call to a parent constructor in each child constructor.
 * @author edwin.farfan
 *
 */
public class ContructorClass {

	public ContructorClass() {
		System.out.println( "constructor 1..");
		//super(); no compila, ya que debe estar en la primera linea
	}

	/**
	 * this is a method, not constructor.
	 * since it has a return value.
	 */
	public static void ContructorClass() {
		System.out.println( " constructor 2");
		
	}
	
	public static void main(String[] args) {
		
		ContructorClass();
		ContructorClass.ContructorClass();
		new ContructorClass();

	}

}
