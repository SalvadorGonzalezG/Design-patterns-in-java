package com.gonzalez.pdd;

public class Usuario {
	// generamos atributos privados de la clase
	private String nombre;
	private String apellido;
	
	private String email;
	private String telefono;
	private String direccion;
	
	//generamos un construcor privado que reciba los 2 parametros obligatorios, nombre, apellido
	private Usuario(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
		
		this.email = "";
		this.telefono = "";
		this.direccion = direccion;
	}
	
	// generamos los setters de los objetos para poder tener acceso solamente mediante los mismos
	// retornaran el objeto de la clase
	public Usuario setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	public Usuario setApellido(String apellido) {
		this.apellido = apellido;
		return this;
	}
	public Usuario setEmail(String email) {
		this.email = email;
		return this;
	}
	public Usuario setTelefono(String telefono) {
		this.telefono = telefono;
		return this;
	}
	public Usuario setDireccion(String direccion) {
		this.direccion = direccion;
		return this;
	}
	
	// generamos un metodo static que retorne el objeto de la clase
	public static Usuario make(String nombre, String apellido) {
		return new Usuario(nombre, apellido);
	}
	// generamos un metodo que reretorne todo el objeto de la clase
	public Usuario build() {
		return this;
	}
	
	// rescribimos el metodo toString()
	public String toString() {
		return this.nombre + " " + this.apellido + " " + this.email + " " + this.telefono + " " + this.direccion;
	}
	
	
	
	
	
	
	
}
