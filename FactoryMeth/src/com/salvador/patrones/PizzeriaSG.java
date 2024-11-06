package com.salvador.patrones;

public  class PizzeriaSG implements Pizzeria{
	
	// Ocupamos el metodo de la interface Pizzeria con logica en ella;
	public Pizza crearPizza(String tipo) {
		
		if(tipo.equals("Peperoni")) {
			return new Pizza(10, "Peperoni");
		}
		if(tipo.equals("Mexicana")) {
			return new Pizza(11, "Mexicana");
		}
		if(tipo.equals("Pizza Orilla Rellena")) {
			return new PizzaOrillaRellena(15, "Italina");
		}
		return null;
	}

}
