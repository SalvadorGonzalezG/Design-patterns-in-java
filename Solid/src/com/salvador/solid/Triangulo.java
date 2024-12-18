package com.salvador.solid;

public class Triangulo implements IFigura{
	public float altura;
	public float base;
	
	// genjerando el constructor de la clase
	public Triangulo(float altura, float base) {
		this.setAltura(altura);
		this.setBase(base);
	}
	
	// generando getters & setters de la clase triangulo
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	
	
	public float area() {
		return ( this.getAltura() * this.getBase() ) / 2 ;
	}
}
