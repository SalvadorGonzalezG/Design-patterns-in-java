package com.gonzalez.pdd;

public interface IConexionSQL {
	// generamos 2 metodos abstractos y esta clase sera implementada en ConexionSQL
	void conexion();
	
	String runQuery();

}
