package com.gonzalez.pdd;

public class Main {
	public static void main(String[] args) {
		// clase principal de mi programa
		// instanciamos la clase ConexionDB
		ConexionDB conexion = ConexionDB.crearConexion();
		
		System.out.println(conexion.hashCode());
		
		//creamos una instancia de un hilo
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				ConexionDB con = ConexionDB.crearConexion();
				System.out.println(con.hashCode());
			}
		});
		t1.start();
		
	}
}
