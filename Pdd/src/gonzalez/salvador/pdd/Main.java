package gonzalez.salvador.pdd;

public class Main {
	public static void main(String[ ] args) {
		Jaguar jaguar1 = new Jaguar(12, 20.5f);
		System.out.println(jaguar1);
		
		// objeto sobrecargado el cual unicamente tiene la edad
		Jaguar jaguar2 = new Jaguar(16);
		System.out.println(jaguar2);
		
		Jaguar jaguar3 = new Jaguar(15.5f);
		System.out.println(jaguar3);
		
		Jaguar jaguar4 = new Jaguar();
		System.out.println(jaguar4);
		//jaguar1.setEdad(12);
		//jaguar1.setPeso(18.5f);
		
		
		//System.out.println(jaguar1.getEdad());
		
		jaguar1.dormir();
		jaguar1.comer();
		jaguar1.cazar();
		jaguar1.rugir();
		jaguar1.correr();
		//jaguar1.maullar();
		
		
	}
}
