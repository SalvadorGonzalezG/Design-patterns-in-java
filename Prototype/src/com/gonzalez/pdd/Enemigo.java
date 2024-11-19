package com.gonzalez.pdd;

public class Enemigo {
	// atributos privados para que sean modificados atravez de su setter
	private String imagen;
	private int posX;
	private int posY;
	private int cantidadVida;
	
	// generamos el constructor de la clase
	public Enemigo(String imagen, int posX, int posY, int cantidadVida) {
		this.setImagen(imagen);
		this.setPosX(posX);
		this.setPosY(posY);
		this.setCantidadVida(cantidadVida);
	}
	
	// Sobre escribimos el constructor de la clase pasando el objeto de la clase
	public Enemigo(Enemigo enemigo) {
		this.setImagen(enemigo.getImagen());
		this.setPosX(enemigo.getPosX());
		this.setPosY(enemigo.getPosY());
		this.setCantidadVida(enemigo.getCantidadVida());
	}
	
	// generamos un metodo que retorne el objeto de la clase
	public Enemigo clone() {
		return new Enemigo(this);
	}
	
	// Sobre escribimos el metodo toString 
	public String toString() {
		return " " + this.imagen + " " + this.posX + 
				" " + this.posY + " " + this.cantidadVida;
	}
	
	// fgeneramos los getters de los atributos
	public String getImagen() {
		return imagen;
	}
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
	public int getCantidadVida() {
		return cantidadVida;
	}
	
	// setters de la clase
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public void setCantidadVida(int cantidadVida) {
		this.cantidadVida = cantidadVida;
	}
}

