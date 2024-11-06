package com.gonzalez.pdd;

// clase principal del programa
/* Provide an interface for creating families of related or dependent
 * objects without specifying their concrete classes*/
public class Main {
	public static void main(String[] args) {
		// Intanciaremos ambas rtiendad
		AppleStore apple = new AppleStore();
		SamsungStore samsung = new SamsungStore();
		HuaweiStore huawei = new HuaweiStore();
		OppoStore oppo = new OppoStore();
		// Creamos los objetos para la tienda de Appe 
		Computadora macbook = apple.crearComputadora();
		Tablet ipad = apple.crearTablet();
		
		// Creamos los objetos para la tienda de Samsung
		Computadora samsungbook = samsung.crearComputadora();
		Tablet tab3 = samsung.crearTablet();
		
		Computadora matebook = huawei.crearComputadora();
		Tablet matetab = huawei.crearTablet();
		
		Computadora oppobook = oppo.crearComputadora();
		Tablet oppotab = oppo.crearTablet();
			
		
	}
}
