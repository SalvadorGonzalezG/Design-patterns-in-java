package com.gonzalez.pdd;

public class HisenseStore implements AbstractFactory{
	
	//implementamos los metodos de manera publica
	public Computadora crearComputadora() {
		return new HisenseSystem();
	}
	public Tablet crearTablet() {
		return new HisenseTab();
	}

}
