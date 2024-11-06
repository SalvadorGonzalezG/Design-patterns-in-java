package com.gonzalez.pdd;

public interface AbstractFactory {
	
	// definimos los metodos y retornamos el objeto, estos objetos seran interfaces
	Computadora crearComputadora();
	
	Tablet crearTablet();

}
