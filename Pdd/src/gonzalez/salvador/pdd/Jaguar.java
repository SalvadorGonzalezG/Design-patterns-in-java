package gonzalez.salvador.pdd;

public class Jaguar extends Animal implements IFelino{
	// creamos 2 atributos
	private int edad;
	private float peso;
	
	// creamos el constructor metodo muy especial siendo el primero que se ejecuta cuando cuando se crea una instancia
	public Jaguar(int edad, float peso) {
		this.edad = edad;
		this.peso = peso;
	}
	// sobre cargas de metodos con el constructor
	public Jaguar(int edad) {
		this.setEdad(edad);
	}
	
	public Jaguar(float peso) {
		this.setPeso(peso);
	}
	
	public Jaguar() {
		
	}
	
	// creamos los getters y setters para cada atributo
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "Mi edad es " + this.edad + " y peso " + this.peso +  " kilogramos";
	}

	
	// implementamos los metodos de la interfaz
	
	public void rugir() {
System.out.println(" El jaguar Ruge");

	}
	public void dormir() {
	System.out.println("El jaguar duerme");
	}
	
	public void comer() {
		System.out.println("El jaguar come!!");
	}
	
	
	 public void maullar() {
		throw new UnsupportedOperationException("... El jaguar no maulla ...");
	}
	
	 public void cazar() {
		System.out.println("El Jaguar caza");
	}
	 
	 public void correr() {
		 System.out.println("El Jaguar esta corriendo");
	 }
	
}
