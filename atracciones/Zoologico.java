package atracciones;

import java.util.Arrays;

//Herencia
public class Zoologico extends Atraccion{
	private int cantidadAnimales;
	private Director director;
	private Animal[] animales;
	private Habitat habitat;

	public Zoologico(String tipo, String nombre, String ruc, int cantidadAnimales, Habitat habitat) {
		super(tipo, nombre, ruc);
		this.cantidadAnimales = cantidadAnimales;
		this.habitat = habitat;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public Animal[] getAnimales() {
		return animales;
	}

	public void setAnimales(Animal[] animales) {
		this.animales = animales;
	}

	@Override
	public void calcularGanancias() {
		// TODO Auto-generated method stub
		System.out.println("Las ganancias totales se calcula multiplicando el número de visitantes por el costo de la entrada, sumado con...");
	}
	
	@Override
	public String toString() {
		return "Zoologico [cantidadAnimales=" + cantidadAnimales + ", director=" + director + ", animales="
				+ Arrays.toString(animales) + ", habitat=" + habitat + ", toString()=" + super.toString() + "]";
	}
	
	
}
