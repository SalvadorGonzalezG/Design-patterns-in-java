package com.gonzalez.pdd;

public class SamsungStore implements AbstractFactory{
	// implementemos los metodos de abstractfactory de manera publica y retornamos unn objeto de tipo Computadora
	public Computadora crearComputadora() {
		return new SamsungBook();
	}
	public Tablet crearTablet() {
		return new Tab3();
	}
}
