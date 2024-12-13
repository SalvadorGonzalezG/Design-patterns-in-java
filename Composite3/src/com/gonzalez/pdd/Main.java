package com.gonzalez.pdd;

public class Main {
	public static void main(String[] args) {
		IComboCine combo1 = new Combo1();
		
		System.out.println(combo1.descripcion());
		System.out.println(combo1.precio());
		System.out.println(combo1.nota());
		
		System.out.println("---");
		
		IComboCine comboExtra = new Combo1Extra(new Combo1());
		
		System.out.println(comboExtra.descripcion());
		System.out.println(comboExtra.nota());
		System.out.println(comboExtra.precio());
		
		System.out.println("---");
		
		IComboCine comboXG = new ComboXG(new Combo1Extra(new Combo1()));
		
		System.out.println(comboXG.descripcion());
		System.out.println(comboXG.nota());
		System.out.println(comboXG.precio());
		
		
		
	}
}
