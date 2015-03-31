package com.pe.Polimorfismo;

import java.util.*;

public class Musica {
	// No importa el tipo, así es que los nuevos
	// tipos agregados al sistema funcionaran igual:
	static void afinar(Instrumento i) {
		i.ejecutar();
	}

	static void afinarTodo(Instrumento[] e) {
		for (int i = 0; i < e.length; i++)
			afinar(e[i]);
	}

	public static void main(String[] args) {

		Instrumento[] orquesta = new Instrumento[5];
		int i = 0;
		// Upcasting durante la asignación a el arreglo:
		orquesta[i++] = new Viento();
		orquesta[i++] = new Percusion();
		orquesta[i++] = new Cuerdas();
		orquesta[i++] = new Metal();
		orquesta[i++] = new Madera();
		afinarTodo(orquesta);
	}

}

interface Instrumento {
	// Constante en tiempo de compilación:
	//int i = 5; // static & final

	// No se puede tener definiciones de métodos:
	void ejecutar(); // Automáticamente público

	String que();

	void ajustar();
}

class Viento implements Instrumento {
	public void ejecutar() {
		System.out.println("Viento.ejecutar()");
	}

	public String que() {
		return "Viento";
	}

	public void ajustar() {
	}
}

class Percusion implements Instrumento {
	public void ejecutar() {
		System.out.println("Percusion.ejecutar()");
	}

	public String que() {
		return "Percusión";
	}

	public void ajustar() {
	}
}

class Cuerdas implements Instrumento {
	public void ejecutar() {
		System.out.println("Cuerdas.ejecutar()");
	}

	public String que() {
		return "Cuerdas";
	}

	public void ajuste() {
	}

	public void ajustar() {
	}

}

class Metal extends Viento {
	public void ejecutar() {
		System.out.println("Metal.ejecutar()");
	}

	public void ajustar() {
		System.out.println("Metal.ajustar()");
	}
}

class Madera extends Viento {
	public void ejecutar() {
		System.out.println("MAdera.ejecutar()");
	}

	public String que() {
		return "Madera";
	}
}
