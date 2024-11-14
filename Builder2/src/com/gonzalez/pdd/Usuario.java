package com.gonzalez.pdd;

/*
 * con un atributo nuevo medioCOntacto el cual sera un boolean; si este atributo es true podremos instanciar los setters
 * setEmail, setTelefono y setDireccion de lo contrario nos mandara una excepcion con un msd
 * 
 * */
public class Usuario {
	// crearemos 1 atributo nuevo medio de constacto
	private String nombre;
	private String apellido;
	private boolean medioContacto;
	private String email;
	private String telefono;
	private String direccion;
	
	/* generamos el constructor de la clase con 2 atributos obligatorios nombre y apellido
	   los demas atributos seran vacios y mediContacto por defectossera false */
	private Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.medioContacto = false;
		this.email = "";
		this.telefono = "";
		this.direccion = "";
	}
	
	// generamos el setter que se utilizara el cual retornara el objeto de la clase BuilderUsuario
	// y contendra la condicion para enviar la excepcion
	public BuilderUsuario setMedioContacto(boolean medioContacto) {
		if(!medioContacto) {
			throw new IllegalArgumentException("No se puede crear el objeto si el medio de contacto es falso");
		}
		this.medioContacto = medioContacto;
		// retornamos una nueva instancia del objeto BuilerUsuario
		return new BuilderUsuario(this);
	}
	// generamos un metodo que cree una instancia de la clase Usuario utilizando el constructor del objeto Usuario
	public static Usuario make(String nombre, String apellido) {
		// retornamos un objeto de tipo usuario pasando el objeto actual this
		return new Usuario(nombre, apellido);
	}
	
	// sobre escribimos el metodo toString
	public String toString() {
		return this.nombre + " " + this.apellido + " " + this.email + " " + this.telefono + " " + this.direccion;
	}
	
	// creamos una nueva clase anidada en la primare la cual nos permita instanciar los  setters siempre y cuando medioContacto sea true
	public class BuilderUsuario{
		// generamos un atributo de tipo Usuario
		public Usuario usuario;
		
		// generamos el constructor de la clase con el atributo antes definido
		public BuilderUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		// generamos los setters para los atributos de la clase Usuario la cual retornara el objeto de la clase BuilderUsuario
		public BuilderUsuario setEmail(String email) {
			usuario.email = email;
			return this;
		}
		public BuilderUsuario setTelefono(String telefono) {
			usuario.telefono = telefono;
			return this;
		}
		public BuilderUsuario setDireccion(String direccion) {
			usuario.direccion = direccion;
			return this;
		}
		// colocaremos el metodo Build el cual retornara el objeto actual de la clase Usuario
		// generamos un metodo que retorne el objeto actual de la clase Usuario
		public Usuario build() {
			return usuario;
		}
		
		
		
		
	}
	
}
