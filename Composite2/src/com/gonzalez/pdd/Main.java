package com.gonzalez.pdd;

	// Clase principal donde se realizaran las intancias de los objetos
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFelino tigre =  new Tigre();
		
		System.out.println(tigre.cazar());
		System.out.println(tigre.crias());
		System.out.println(tigre.gestacion());
		
		System.out.println("----");
		
		// felino hibrido
		IFelino bengala = new TigreHibrido(new Tigre());
		
		System.out.println(bengala.cazar());
		System.out.println(bengala.crias());
		System.out.println(bengala.gestacion());
		
		System.out.println("----");
		
		// Felino Hibrido en cautiberio
		IFelino bagui = new TigreHCautiberio(new TigreHibrido(new Tigre()));
		
		System.out.println(bagui.cazar());
		System.out.println(bagui.crias());
		System.out.println(bagui.gestacion());
		
		

	}

}
