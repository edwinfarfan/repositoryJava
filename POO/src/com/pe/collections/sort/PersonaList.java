package com.pe.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonaList {

	public static void main(String[] args) {

		
		System.out.println("lista de personas: " + crearList());
		
		System.out.println("lista de personas Ordenada: " + listaOrdenada(crearList()));
		
	}
	
	private static List<Persona> crearList(){
		
		List lista = new ArrayList();
		
		Persona persona1 = new Persona("Juan","Sandoval",7);
		Persona persona2 = new Persona("Miguel","Grau",6);
		Persona persona3 = new Persona("Jorge","Condori",8);
		Persona persona4 = new Persona("Karina","Masa",4);
		Persona persona5 = new Persona("Hugo","Barnechea",3);
		Persona persona6 = new Persona("Tania","Tapia",2);
		Persona persona7 = new Persona("Julia","Tavares",1);
		
		lista.add(persona1);
		lista.add(persona2);
		lista.add(persona3);
		lista.add(persona4);
		lista.add(persona5);
		lista.add(persona6);
		lista.add(persona7);
		
		return lista;
	}
	
	private static List listaOrdenada(List lista){
		
		Collections.sort(lista);
		return lista;
	}

}
