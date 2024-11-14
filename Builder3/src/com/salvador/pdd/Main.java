package com.salvador.pdd;

public class Main {

	// Clase principal del programa
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario user1 = Usuario.make("Salvador", "GG")
				.setMedioContacto(true)
				.setEmail("sgg@mailcom")
				.setTelefono("55-55-55")
				.setDireccion("Av Lopez mateos")
				.setMetodoPago("Targeta Credito")
				.setToken("1s45r2")
				.build();
		
		// imprimimos el objeto
		System.out.println(user1);
							
				

	}

}
