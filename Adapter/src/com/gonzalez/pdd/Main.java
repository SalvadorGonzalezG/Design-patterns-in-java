package com.gonzalez.pdd;

public class Main {
	public static void main(String[] args) {
		// instanciamos el objeto IConexionSQL
		IConexionSQL conexion1 = new ConexionMySQL();
		conexion1.conexion();
		String resultado = conexion1.runQuery();
		System.out.println(resultado);
		System.out.println("----");
		
		// instanciamos el objeto IConexionNoSQL
		IConexionNoSQL conexion2 = new ConexionMongoDB();
		// imprimira en consola Conexion con MongoDb
		conexion2.conexion();
		//generamos una variable llamada resultado de tipoString la cual guardara lo que retorne conexion2.excecuteScentence()
		String resultado2 = conexion2.excecuteScentence();
		System.out.println(resultado2);
		System.out.println("----");
		
		// ahora supongamos que tenemos una conexionde tipo SQL y queremos implementar el adaptador el cual se conectara con un DB de tipo NSQL
		// este adaptador recibira un parametro de tipo ConexionNoSQL
		IConexionSQL conexion3 = new Adaptador(new ConexionMongoDB());
		conexion3.conexion();
		String resultado3 = conexion3.runQuery();
		System.out.println(resultado3);
		
	}
}
