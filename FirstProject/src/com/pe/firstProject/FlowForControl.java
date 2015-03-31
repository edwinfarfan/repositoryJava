package com.pe.firstProject;

import com.pe.util.Imprime;

public class FlowForControl {

	// FOR flow control
	static String[] names = { "Sofia", "Lara", "Thalia", "Paola","Luisa" };
			
	public static void main(String[] args) {
		
		// FOR flow control
		for (int i = 0; i < names.length; i++) {
			Imprime.linea(names[i]);
		}
		
		//reverse list
		Imprime.linea("\nreverse list: ");
		for (int i = (names.length-1); i >= 0; i--) {
			Imprime.linea(names[i]);
		}
		
		
		//FOR each control
		Imprime.linea("\neach control: ");
		for (String name : names) {
			Imprime.linea(name);
		}
	}

}
