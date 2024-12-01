package com.pdd;

// clase principal de nuestro programa
public class Main {
	public static void main(String[] args) {
		// intanciaremos los objeto de las clase  ConexionMSQl & ConexionMongoDB
		
		// consuklta de DB con SQL
		IConexionSQL msql = new ConexionMySQL();
		msql.conexion();
		System.out.println(msql.consultaQuery());
		
		System.out.println("----");
		// Consulta de una DB NoSQL
		IConexionNoSQL mongo = new ConexionMongoDB();
		mongo.conexion();
		System.out.println(mongo.ExcecuteScentence());
		
		System.out.println("-----");
		// vamos a suponer que nuestro sistema unicmante trabaja con una db SQL y tenemos que conetar con mongo sin cambiar todos los metodos
		// tendremos que crrear un adaptador que ejecute de una manera diferente estos metodos
		IConexionSQL mongo2 = new Adaptador(new ConexionMongoDB());
		mongo2.conexion();
		System.out.println(mongo2.consultaQuery());
		}
}
