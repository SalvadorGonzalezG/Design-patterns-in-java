package com.gonzalez.pdd;

// implementaremos de la clase a la cual vamos a querer tener un decir teenmos una conexionSQL pero queremos mudarnos a una conexion MongoDB
public class Adaptador implements IConexionSQL{
	// generamos un atributo de tipo IConexionNoSQL
	private IConexionNoSQL NoSQL;
	
	// vamos a generar un constructor el cual reciba el atributo del tipo IConexionNoSQL
	public Adaptador(IConexionNoSQL NoSQL) {
		this.NoSQL = NoSQL;
	}
	
	// se colocaran los metodoq ue se encuentran en la interfaz
	public void conexion() {
		this.NoSQL.conexion();
	}
	// metodo que retornara el objeto de la clase NoSQL y su metodo
	public String runQuery() {
		return this.NoSQL.excecuteScentence();
	}
	
}
