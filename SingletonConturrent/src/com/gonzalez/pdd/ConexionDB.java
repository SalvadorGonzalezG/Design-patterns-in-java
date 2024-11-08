package com.gonzalez.pdd;

public class ConexionDB {
	
	// creamos un atributo privado y estatico que sea un objeto de la misma clase
	private static ConexionDB conexion;
	
	// creamos un constructor privado
	private ConexionDB() {
		
	}
	
	// creamos un metodo static que retorne el objeto de la misma clase de forma sincronizada por si tenemos varios hilos la concurrencia siempre sea la misma
	public synchronized static ConexionDB obtenerConexion() {
		// Condicion que permitira saber si el objeto a sio instanciado 
		if(conexion == null) {
			// si no a sido instanciado lo instanciamos
			conexion = new ConexionDB();
		}
		// retornamos el objeto
		return conexion;
	}

}
