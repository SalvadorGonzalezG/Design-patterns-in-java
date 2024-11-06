package com.gonzalez.simpleFactory;

// Clase principal de mi programa
public class Main {
	public static void main(String[] args) {
		// instanciamos el objeto de la clase Pizza
		Pizza pizza = new Pizza(10);
		
		System.out.println(pizza);
		
		
		// instanciamos nuestro objeto de la clase Pizzeria
		Pizzeria pizzaSalvador = new Pizzeria();
		Pizza pizzaHawahiana = pizzaSalvador.pizzaGrande();
		System.out.println(pizzaHawahiana);
	}
}
