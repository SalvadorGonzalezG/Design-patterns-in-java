package com.gonzalez.simpleFactory;

public class Pizza {
	// creamos un atributo private
	private int cantidadRebanadas;
	
	// creamos el construcotr
	public Pizza(int cantidadRebanadas) {
		this.cantidadRebanadas = cantidadRebanadas;
	}
	
	// sobre escribimos el metodo toString
	public String toString() {
		return "Cantidad de rebanadas: " + this.cantidadRebanadas; 
	}

}
