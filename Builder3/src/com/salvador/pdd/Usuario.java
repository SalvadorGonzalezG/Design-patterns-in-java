package com.salvador.pdd;

public class Usuario {
	// Creamos atributos de manera privada
	private String apellido;
	private String nombre;
	
	
	private String metodoPago;
	private String token;
	private boolean medioContacto;
	
	private String email;
	private String telefono;
	private String direccion;

	// Generamos un constructor privado que reciba 2 atributos obligatoriamente agremas los demas atributos vacios
	private Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.medioContacto = false;
		this.metodoPago = "";
		this.token = "";
		this.email = "";
		this.telefono = "";
		this.direccion = "";
	}
	
	// creamos el setter de medioContacto el cual retornara el objeto de la clase Builderusuario
	
	public BuilderUsuario setMedioContacto(boolean medioContacto) {
		// crearemos una condicional la cual si no se ingresa medioContacto = true retorne una excepcion y de lo contrario genere una
		// nueva instancia del objeto BuilderUsuario
		if(!medioContacto) {
			throw new IllegalArgumentException("error al generar datos en email, telefono y direccion cuando el medio de contacto es falso");
		}
		this.medioContacto = medioContacto;
		return new BuilderUsuario(this);
	}
	
	// generamos un metodo que retorne una instancia del objeto
	public static Usuario make(String nombre, String usuario) {
		return new Usuario(nombre, usuario);
	}
	
	// Sobre escribimos el metodo toString()
	public String toString() {
		return this.nombre + " " + this.apellido + " " + this.email + " " + this.telefono + " " + this.direccion + " " + this.metodoPago + " " + this.token;
	}
	// generamos una nueva clase llamada BuilderUsuario la cual nos permitira hacer uso de los setters email, telefono y direccion 
	// siempre y cuando medioContacto = true
	
	public class BuilderUsuario{
		// generamos un atributo de tipo Usuario
		private Usuario usuario;
		// generamos un atributo de tipo String
		private String metodoPago;
		private String token;
		
		
		// generamos el constructor que tenga el atributo de tipo Usuario
		public BuilderUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		
		// generamos los setters para email telefono y direccion que retornen el objeto BuilderUsuario
		public BuilderUsuario setEmail(String email) {
		
			if(email != null && !email.trim().isEmpty()) {
			usuario.email = email;
			}
			return this;
		}
		public BuilderUsuario setTelefono(String telefono) {
			if (telefono != null && !telefono.trim().isEmpty()) { 
			usuario.telefono = telefono;
			}
			return this;
		}
		public BuilderUsuario setDireccion(String direccion) {
			if(direccion != null && !direccion.trim().isEmpty()) {
			usuario.direccion = direccion;
			}
			return this;
		}
		
		// creamos el setter para metodoDePago
		public BuilderUsuario setMetodoPago(String metodoPago) {
			if(usuario.email.isEmpty() || usuario.telefono.isEmpty() || usuario.direccion.isEmpty()) {
				throw new IllegalArgumentException("Si email, telefono & direccion estan vacion no se puede generar un metodo de pago");
			}
			// actualizamos  el objeto Usuario dentro del constructor
			this.usuario.metodoPago = metodoPago;
			return this;
			
		}
		
		// seamos el setter para toker
		public BuilderUsuario setToken(String token) {
			// verificamos si metodoPago es nulo o vacio
			if( usuario.metodoPago == null || usuario.metodoPago.isEmpty()) {
				// ser asi enviamos la excepcion con un ms de lo que esta sucediendo
				throw new IllegalArgumentException("No se puede generar el token ya que el metodo de pago no se encuentra activo");
			}
			// de no ser asi asignamos el valor al atributo de la clase y este lo envia a la clase usuario para actualizarse 
			this.usuario.token = token;
			return this;
		}
		
		// generamos un metodo que nos permita retornar el objeto de la clase Usuario
		public Usuario build() {
			return usuario;
		}
		
	}
	
}
