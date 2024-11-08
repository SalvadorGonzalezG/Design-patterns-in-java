package com.gonzalez.pdd;

//	Singleton Concurrent
public class Main {
	public static void main(String[] args) {
		// instanciamos el obto ConexionDB
		
		ConexionDB conexion = ConexionDB.obtenerConexion();
		
		
		
		System.out.println(conexion.hashCode());
		System.out.println("----");
		
		// mandaremos llamar a obtebner conexion mediante Threads
		Thread t1 = new Thread( new Runnable() {
			public void run() {
				// Instanciamos el objeto ConexionDb
				ConexionDB conexion1 = ConexionDB.obtenerConexion();
				System.out.println(conexion1.hashCode());
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				ConexionDB conexion2 = ConexionDB.obtenerConexion();
				System.out.println(conexion2.hashCode());
			}
		});
		
		t1.start();
		t2.start();
		
	}

}
