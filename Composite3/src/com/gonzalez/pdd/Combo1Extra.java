package com.gonzalez.pdd;

public class Combo1Extra implements IComboCine{
	
	// implementaremos los metodos de la interfaz pero implementaremos
	// un atributio de tipo IComboCine de tipo private
	private IComboCine icomboCine;
	
	// Costructor de la clase que recibe un objeto implementa la interfaz IComboCine 
	public Combo1Extra(IComboCine icomboCine) {
		this.icomboCine = icomboCine; // asignamos el objeto recibido a icomboCine
	}
	
	public String descripcion() {
		return this.icomboCine.descripcion() + " Ademas incluye 1 entrada extra";
	}
	
	public String nota() {
		return this.icomboCine.nota() + " Adquiriste un combo extra";
	}
	
	public float precio(){
		return this.icomboCine.precio() + 3.0f;
	}
	
	

}
