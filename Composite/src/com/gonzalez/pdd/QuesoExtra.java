package com.gonzalez.pdd;

public class QuesoExtra implements IPizza{
	
	// esta clase tendra un atributo privado de tipo pizza
	private IPizza pizza;
	
	// constructor de la clase que implementara el objeto de la interdaz
	// se realiza con el fin de modificar la descripcion y el precio
	public QuesoExtra(IPizza pizza) {
		this.pizza = pizza;
	}
	
	public String descripcion() {
		return this.pizza.descripcion() + " Con queso extra";
		
	}
	public float precio() {
		return this.pizza.precio() + 4f;
		
	}

}
