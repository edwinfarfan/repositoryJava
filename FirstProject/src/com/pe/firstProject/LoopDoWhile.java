package com.pe.firstProject;

import java.util.Scanner;

import com.pe.util.Imprime;

public class LoopDoWhile {

	public static void main(String[] input) {
		Imprime.linea("Ingrese un numero entero del 0 al 10.");
		int attempt = 0;
		
		//Hace una simple validacion de tres intentos en el cual puedes poner un numero en la pantalla 
		// si el numero coincide saldra un mensaje de felicitaciones. 
		//para cada intento se generara nuevamente el numero (0 -10)

		do {
			System.out.printf("\t"); // Input on screen is indented
			
			int nroGenerado =(int) (Math.random() * 10);
			
			int nroIngresado = Integer.parseInt(input[attempt]);

			if (nroIngresado== nroGenerado) {
				Imprime.linea("Felicidades... usted dio en el blanco " + input[attempt] );
				break;
			}
			if (nroIngresado < nroGenerado) {
				Imprime.linea("Sorry but the number %d is too low, the correct number is %d, please try again." + input[attempt]  +" nro generado: " + nroGenerado);
			}
			if (nroIngresado > nroGenerado) {
				Imprime.linea("Sorry but the number %d is too high, the correct number is %d, please try again." + input[attempt] +" nro generado: " + nroGenerado);
			}
			attempt++;
		} while (attempt < 4);
		
		Imprime.linea("Over game....");

	}

}
