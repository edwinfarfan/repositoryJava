package com.pe.Polimorfismo;

import java.util.Scanner;

import com.pe.herencia.Manager;
import com.pe.herencia.Subordinado;
import com.pe.herencia.Trabajador;

public class Main {
	
	public static void main(String[] args) {
		
		Trabajador trabajador =  null;

		System.out.print("Ingrese una opcion (1 o 2) para obtener el area del empleado: ");
		Scanner input = new Scanner(System.in);
		int type = input.nextInt();
		if (type ==1 || type ==2) {
			if (type == 1){
				trabajador = new Subordinado();
				
			}else if(type ==2){
				trabajador = new Manager();
			}
			
			System.out.println("nombre del puesto: " + trabajador.obtenerNombrePuesto());
		}
	}

}
