package com.pe.collections;

import com.pe.util.Imprime;

public class SumadorMain {

	public static void main(String[] args) {
		
		
		SumadorGeneric<Integer, Integer> suma = new SumadorGeneric<Integer, Integer>(20, 20);
		
		Imprime.linea("el resultado es: " + suma.resultadoSuma());
		
	}

}
