package com.gonzalez.pdd;

public class ConexionMongoDB implements IConexionNoSQL{
	// metodos implementados desde la interfaz IConexionNoSQL
	public void conexion() {
		System.out.println("Conexion con MongoDB");
	}
	public String excecuteScentence() {
		return "Consulta a MongoDB";
	}
	
}
