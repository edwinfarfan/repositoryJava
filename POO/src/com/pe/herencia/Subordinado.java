package com.pe.herencia;

public class Subordinado extends Trabajador{

	
	public Manager manager;
	
	
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	@Override
	public String obtenerNombrePuesto() {

		return "Empleado del area de servicios informaticos";
	}
	
}

