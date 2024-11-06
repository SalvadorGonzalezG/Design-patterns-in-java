package com.gonzalez.pdd;

public class HuaweiStore implements AbstractFactory{
	// Sobre escribimos los metodos de la interfaz AbstractFactory de manera publica
	@Override
	public Computadora crearComputadora() {
		return new MateBook13();
	}
	@Override
	public Tablet crearTablet() {
		return new MatePad();
	}
}
