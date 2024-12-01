package com.pdd;

// clase que implementara de la interface NoSQL
public class ConexionMongoDB implements IConexionNoSQL{
	
	
	public void conexion() {
		System.out.println("Conexion con MongoDB");
	}
	
	public String ExcecuteScentence() {
		return "Consulta to MongoDB";
	};
	
	

}
