package com.gonzalez.pdd;


// clase principal donde sera instanciado nuestro objeto.
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// instanciamos el objeto Usuario
		Usuario user = Usuario.make("Salvador", "GG")
				.setMedioContacto(true)
				.setEmail("SGG@mail.com")
				.setTelefono("55-55-55-55-55")
				.setDireccion("Col Xochimilco")
				.build();
		
		// mandamos a imprimir en consola el objeto generado anteriormente;
		System.out.print(user); // funciona correctamente 
		
		// hacemos otra instancia con el mismo objeto pero con setMedioContscto como falso
		System.out.println("-----");
		
		Usuario user2 = Usuario.make("Gilberto", "Arteaga")
				.setMedioContacto(false)
				.setEmail("@mail.com")
				.build();
		
		// imprimimos este objeto
		System.out.println(user2);
	}

}
