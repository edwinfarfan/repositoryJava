package com.pe.collections.sort;

import java.util.Comparator;

public class Persona implements Comparable<Persona> {
	
	private String nombre;
	private String apellido;
	private Integer dni;
	
	
	public Persona(String name, String apellido, Integer dni) {
		super();
		this.nombre = name;
		this.apellido = apellido;
		this.dni = dni;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return nombre + ", " + apellido ;
	}


	@Override
	public int compareTo(Persona per) {
		return this.dni - per.dni;
	}


}
