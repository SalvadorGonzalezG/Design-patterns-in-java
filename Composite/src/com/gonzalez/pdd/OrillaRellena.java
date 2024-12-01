package com.gonzalez.pdd;

public class OrillaRellena implements IPizza{

	// creamos un atributo de tipo IPizza de tipo privado
	private IPizza pizza;
	
	// generamos el constructor con el objeto
	public OrillaRellena(IPizza pizza) {
		this.pizza = pizza;
	}
	
	
	public String descripcion() {
		return this.pizza.descripcion() + " Con orilla reyena de Queso";
	}
	
	public float precio() {
		return this.pizza.precio() + 6.5f;
	}
	
	
}
