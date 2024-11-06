package com.gonzalez.pdd;

// Clase que implementara los metodos de Abstract Factory
public class OppoStore implements AbstractFactory{
	
	@Override
	public Computadora crearComputadora() {
		return new OppoBook();
	}
	@Override
	public Tablet crearTablet() {
		return new OppoTab();
	}

}
