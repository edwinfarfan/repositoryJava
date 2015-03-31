package com.pe.util;

/**
 * 
 * @author Edwin F.
 * 
 *
 */
public class Imprime {

	/**
	 * Imprime en la consola
	 * 
	 * @param la cadena que se imprimira.
	 * @deprecated reemplazado por el metodo {@link  #linea}
	 */
	public static void rint(String s) {
		System.out.print(s);
	}

	/**
	 * Imprime una cadena pero con un salto de linea.
	 * 
	 * @Param s es la cadena que se imprimira
	 */ 

	public static void linea(String s) {
		System.out.println(s);
	}

}