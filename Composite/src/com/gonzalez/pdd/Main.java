package com.gonzalez.pdd;

public class Main {
	public static void main(String[] args) {
		
		PizzaHawahiana pizzaH = new PizzaHawahiana();
		
		System.out.println(pizzaH.descripcion());
		System.out.println(pizzaH.precio());
		
		System.out.println("-----");
		
		IPizza pizzaPeperoni = new PizzaPeperoni();
		System.out.println(pizzaPeperoni.descripcion());
		System.out.println(pizzaPeperoni.precio());
		
		System.out.println("----");
		// Queso extra + 2 = 10.5;
		// Orilla Rellena + 4
		
		// realizemos una ppiza con quesoExtra
		IPizza pizzaHawahiana = new QuesoExtra(new PizzaHawahiana());
		System.out.println(pizzaHawahiana.descripcion());
		System.out.println(pizzaHawahiana.precio());
		
		System.out.println("----");
		// generamos una pizza de peperoni con orilla rellena
		IPizza pizzaP = new OrillaRellena(new PizzaPeperoni());
		
		System.out.println(pizzaP.descripcion());
		System.out.println(pizzaP.precio());
		
		System.out.println("----");
		//ahora generaremos una Pizza con queso extra y con orilla reyena
		// este patron va sumando los valores ya que realiza un wrap del objeto en simotivo por el cual evitamos el uso de la herencia de clases
		// haciendo que dicho patron sea más corto al momento de implementarlo!
		IPizza pizzaORQE = new QuesoExtra(new OrillaRellena(new PizzaHawahiana()));
		System.out.println(pizzaORQE.descripcion());
		System.out.println(pizzaORQE.precio());
		
		
		
		
		
		
		
	}
}
