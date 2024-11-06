package com.gonzalez.simpleFactory;

// Clase Pizzeria la cual tendra 3 metodos pizzaChica, Mediana y Grande
public class Pizzeria {
	// Metodo para obtener una pizza con 6 rebanadas siendo esta la pizza chica
	public Pizza pizzaChica() {
		return new Pizza(6);
	}
	
	public Pizza pizzaMediana() {
		return new Pizza(8);
	}
	
	public Pizza pizzaGrande() {
		return new Pizza(12);
	}
}
