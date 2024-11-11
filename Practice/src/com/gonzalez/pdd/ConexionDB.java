package com.gonzalez.pdd;

public class ConexionDB {
	
	// creamos un atrivuto privado statico y que regrese el objeto de la clase
	private static ConexionDB conexion;
	
	// creamos un constructor privado
	private ConexionDB() {
		
	}
	
	// implementamos un metodo que retorne el objeto de la clase y que sea statico
	public synchronized static ConexionDB crearConexion() {
		if(conexion == null) {
			conexion = new ConexionDB();
		}
		return conexion;
		
	}
	
	
}
