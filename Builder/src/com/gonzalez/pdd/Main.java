package com.gonzalez.pdd;


/*Separate the construction of a complex object from its 
 * representation so that the same
 * construction process can create
 * different representation
 * */

public class Main {
	public static void main(String[] args) {
		// metodo principal del programa
		// instanciamos el objeto de la clase
		Usuario user = Usuario.make("Leo", "Maravillas")
				.setEmail("leo@mail.com")
				.setTelefono("55-11-18-30-20")
				.setDireccion("Circuito Bicentenario cdmx 57,000")
				.build();
		
		System.out.println(user);
	}
}
