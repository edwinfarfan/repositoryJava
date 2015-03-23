package com.pe.herencia;

import java.util.List;

public class Manager extends Trabajador{
	
	List<Subordinado>  empleados;

	public List<Subordinado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Subordinado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public String obtenerNombrePuesto() {

		return "Jefe del area de informatica";
	}
	

}
