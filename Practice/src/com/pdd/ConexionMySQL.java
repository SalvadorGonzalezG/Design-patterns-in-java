package com.pdd;

// clase que extendera los metodos de la interfaz IConexionSQL
public class ConexionMySQL implements IConexionSQL{
	
	public void conexion() {
		System.out.println("realizando conexion con MySQL");
	}

	@Override
	public String consultaQuery() {
		// TODO Auto-generated method stub
		return "Consulta a MySQl";
	}
	

}
