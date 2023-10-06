package atracciones;

import java.util.Arrays;

//Herencia
public class Zoologico extends Atraccion{
	private int cantidadAnimales;
	private Director guardia;
	private Animal[] animales;
	private Habitat habitat;

	public Zoologico(String tipo, String nombre, String ruc, int cantidadAnimales, Habitat habitat) {
		super(tipo, nombre, ruc);
		this.cantidadAnimales = cantidadAnimales;
		this.habitat = habitat;
	}

	public Director getGuardia() {
		return guardia;
	}

	public void setGuardia(Director guardia) {
		this.guardia = guardia;
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
		return "Zoologico [cantidadAnimales=" + cantidadAnimales + ", guardia=" + guardia + ", animales="
				+ Arrays.toString(animales) + ", habitat=" + habitat + ", toString()=" + super.toString() + "]";
	}
	
	
}
