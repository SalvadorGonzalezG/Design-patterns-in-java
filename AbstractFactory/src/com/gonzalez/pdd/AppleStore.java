package com.gonzalez.pdd;

// Implementaremos de AbstractFactory he implementaremos los metodos de manera public
public class AppleStore implements AbstractFactory{
	public Computadora crearComputadora() {
		
		//retornaremos un objeto del tipo que implementemos 
		return new MacBookPro();
	}
	
	public Tablet crearTablet() {
		return new Ipad();
	}

}
