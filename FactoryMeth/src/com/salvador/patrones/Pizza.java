package com.salvador.patrones;

public class Pizza {
	// Atributos de la clase
	private int cantidadRebanadas;
	private String especialidad;
	
	// constructor de la clase
	public Pizza(int cantidadRebanadas, String especialidad) {
		this.cantidadRebanadas = cantidadRebanadas;
		this.especialidad = especialidad;
	}
	
	// Rescribir el metodo toString
	public String toString() {
		return "Cantidad de Rebanadas: " + this.cantidadRebanadas + " Especialidad: " + this.especialidad ;
	}
}
