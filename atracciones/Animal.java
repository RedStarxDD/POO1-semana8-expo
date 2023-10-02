package atracciones;

public class Animal {
	private String nombre, familia;
	private int edad;
	
	public Animal(String nombre, String familia, int edad) {
		super();
		this.nombre = nombre;
		this.familia = familia;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", familia=" + familia + ", edad=" + edad + "]";
	}
	
	
}
