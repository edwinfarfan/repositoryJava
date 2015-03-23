package com.pe.firstProject;

import com.pe.util.Imprime;

public class CompareString {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");

		if(s1 == s2){
			Imprime.linea("es igual");
		}else {
			Imprime.linea("no es igual");
		}
	}

}
