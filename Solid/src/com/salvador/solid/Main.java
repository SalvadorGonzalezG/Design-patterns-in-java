package com.salvador.solid;

// Clase principal del programa.
public class Main {
	public static void main(String[] args) {
		// instanciamos nuestro objeto de la clase rectangulo
		Rectangulo rectangulo = new Rectangulo(10f, 20f);
		System.out.println(rectangulo.area());
		
		// Instanciamos nuestra clase Presentacion
		Presentacion presentacion = new Presentacion();
		presentacion.area(rectangulo);
		
		// intsnaciamos el objeto de la clase Triangulo
		Triangulo triangulo = new Triangulo(50f, 100f);
		
		presentacion.area(triangulo);
		
		
	}

}
