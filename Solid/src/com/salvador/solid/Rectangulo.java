package com.salvador.solid;

public class Rectangulo implements IFigura{
	// crearemos 2 atributos
	public float altura;
	public float base;
	
	// construimos el constructor de la clase
	public Rectangulo(float altura, float base) {
		this.setAltura(altura);;
		this.setBase(base);
	}
	
	// crearemos los getters & setters de ambos atributos
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
	
	// creamos un metodo que nos retorne el área
	public float area() {
		return this.getAltura() * this.getBase();
	}
}
