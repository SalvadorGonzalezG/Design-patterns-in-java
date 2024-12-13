package com.gonzalez.pdd;

public class Combo1 implements IComboCine{
	
	@Override
	public String descripcion(){
		return "Combo Sencillo incluye Palominas y refresco grandes";
	}
	
	@Override
	public String nota() {
		return "Gracias por tu compra";
	}
	
	@Override
	public float precio() {
		return 5.5f; 
	}
	

}
