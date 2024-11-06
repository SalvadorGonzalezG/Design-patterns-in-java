package com.salvador.patrones;

/* Def: Define an interface for creating an object, 
but let subclasses decide which 
class to instantiate. Factory Method a class defer instantiation to subclasses 
*/

// Clase principal del programa
public class Main {
	public static void main(String[] args) {
		// instanciamos la el objeto de la clasee Pizza
		PizzeriaSG sg = new PizzeriaSG();
		
		Pizza peperoni = sg.crearPizza("Peperoni");
		System.out.println(peperoni);
		System.out.println("-------");
		
		Pizza mexicana = sg.crearPizza("Mexicana");
		System.out.println(mexicana);
		
		System.out.println("-------");
		
		Pizza orillaRellena = sg.crearPizza("Pizza Orilla Rellena");
		System.out.println(orillaRellena);
		
	}
}
