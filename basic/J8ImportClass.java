package com.courses.java8.basic;


/**
 * La clase indica como importar una clase que no esta en su paquete
 * @author edwin.farfan
 * @version 1.0
 * @since 1.0
 */
import java.util.Random; // import tells us where to find Random
import java.util.*; // este import es redundante 
import java.lang.*; // Es redundante.., el paquete lang se importa por default.

/**Import conflicts.
 * por ejemplo la clase Date tiene dos paquetes diferentes
 * java.util.Date 
 * java.sql.Date 
 * @author edwin.farfan
 *
 */


public class J8ImportClass {
	
	java.util.Date date;
	java.sql.Date sqlDate;
	
	public static void main (String arg[]){
	
	Random r = new Random(); 
	System.out.println(r.nextInt(10));
	}

	
}
