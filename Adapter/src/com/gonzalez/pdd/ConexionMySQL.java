package com.gonzalez.pdd;

public class ConexionMySQL implements IConexionSQL{
	// metodos que son implementados desde la interface definiendo lo que realizara cada uno!
	// metodo que imprimira en panatalla un msj
	public void conexion() {
		System.out.println("Conexion con MySQL");
	}
	// metodo que retornara un msj de tipo String
	public String runQuery() {
		return "Consulta a MySQL";
	}
}
