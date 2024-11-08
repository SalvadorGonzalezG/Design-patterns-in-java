package com.gonzalez.pdd;

/* Ensure a class only has one instance, 
 * and provide a global point to access to it.
*/

public class Main {
	public static void main(String[] args) {
		//Patron de diseño singleton patron que utilizaremos cuando querramos una instancia unica dentro nuestra app
		ConexionDB conexion = ConexionDB.obtenerConexion();
		ConexionDB conexion1 = ConexionDB.obtenerConexion();
		ConexionDB conexion2 = ConexionDB.obtenerConexion();
		ConexionDB conexion3 = ConexionDB.obtenerConexion();
		
		// Asignamos un String al objeto conexion para de esta manera al immprimir otro objeto con el mismo string observa 
		// Si imprime el mismo String solo lo realizara si el objeto es el mismo
		conexion.localHost = "LocalHost";
		
		//imprimimos el hashCone de cada uno de los objetos creados para observar que el objeto siempre sera unico
		System.out.println(conexion.localHost);
		System.out.println(conexion1.localHost);
		
		
		System.out.println(conexion2.hashCode());
		System.out.println(conexion3.hashCode());
		
		
		
	}

}
