package com.gonzalez.pdd;

// clase que sera instanciada una unica vez
public class ConexionDB {
	// creamos un atributo privado, static que sea un objeto de la misma clase 
	private static ConexionDB conexion;
	
	public String localHost;
	
	//creamos el constructor de la clase de manera privada
	private ConexionDB() {
		
	}
	
	// creamos un metodo que retorne un objeto de la misma clase y que sea estatico para poder hacer uso de el en la clase principal
	public static ConexionDB obtenerConexion() {
		// vamos a realizar una condicion del objeto
		if (conexion == null) {
			// si el objeto no a sido instanciado lo instanciamos
			conexion = new ConexionDB();
		}
		// retornamos la conexion
		return conexion;
	}
}
