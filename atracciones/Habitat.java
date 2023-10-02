package atracciones;

public class Habitat {
	private String nombre;
	private double extension;
		
	public Habitat(String nombre, double extension) {
		super();
		this.nombre = nombre;
		this.extension = extension;
	}

	@Override
	public String toString() {
		return "Habitat [nombre=" + nombre + ", extension=" + extension + "]";
	}
	
	
}
