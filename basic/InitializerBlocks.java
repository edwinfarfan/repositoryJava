package com.courses.java8.basic;

/**
 * clase para graficar los bloques de inicializacion
 * @author edwin.farfan
 *
 */
public class InitializerBlocks {


	private String name = "Fluffy";

	{ System.out.println("setting field"); }

	public InitializerBlocks() {
		name = "Tiny";
		System.out.println("setting constructor");
	}
	
	public static void main(String[] args) {
		InitializerBlocks chick = new InitializerBlocks();
		System.out.println(chick.name); 
	}

}
