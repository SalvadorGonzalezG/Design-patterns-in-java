package com.gonzalez.pdd;


/* PDD PROTOTYPE
 * Specify the kinds of objects to create usuing a prototypical instance,
 * and create new objects by copyng this prototype
 * */
public class Main {
	public static void main(String[] args) {
	// pasamos el objeto de la clase Enemigo
	Enemigo enemigoBase = new Enemigo("imagenbase.png", 0, 0, 2);
	
	Enemigo enemigo1 = new Enemigo(enemigoBase);
	enemigo1.setImagen("enemigo1.png");
	enemigo1.setPosX(10);
	
	// generamos otro enemigo conforme el objeto de enemigoBase
	Enemigo enemigo2 = new Enemigo(enemigoBase);
	enemigo2.setImagen("Enemigo2.png");
	enemigo2.setPosX(20);
	
	Enemigo enemigoBase2 = new Enemigo("enemigoBase.png", 0, 0, 3);
	Enemigo enemigo3 = enemigoBase2.clone();
	enemigo3.setImagen("enemigo3.png");
	enemigo3.setPosY(100);
	
	// clonamos el objeto enemigoBase2 en un nuevo enemigo cambiando los atributos
	Enemigo enemigo4 = enemigoBase2.clone();
	enemigo4.setImagen("enemigo4.png");
	enemigo4.setPosY(200);
	
	// imprimimos en la consola como se modificaron los datos de cada uno de los objetos
	System.out.println(enemigoBase);
	System.out.println(enemigo1);
	System.out.println(enemigo2);
	System.out.println(enemigoBase2);
	System.out.println(enemigo3);
	System.out.println(enemigo4);
	
	}
}
