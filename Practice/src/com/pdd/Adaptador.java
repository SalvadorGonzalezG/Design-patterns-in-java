package com.pdd;

public class Adaptador implements IConexionSQL{
		
	// vamos a crear un atributo de tipo Conexion para colocarlo en las funciones
	private IConexionNoSQL NoSQL;
	
	// generamos un constructor de la clase
	public Adaptador(IConexionNoSQL NoSQL) {
		this.NoSQL = NoSQL;
	}
	
	public void conexion() {
		this.NoSQL.conexion();
	}
	
	public String consultaQuery() {
		return this.NoSQL.ExcecuteScentence();
	}
	
}
