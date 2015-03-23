package com.pe.firstProject;

import com.pe.util.Imprime;

public class Basic {
	

	static int valueZero;
	public static void main(String[] promt) {

		Imprime.linea("Numero de argumentos:" + promt.length);
		
		Imprime.rint("default value: "+ valueZero);
		for (int i = 0; i < promt.length; i++) {
			Imprime.linea(promt[i]);
		}
	}

}
