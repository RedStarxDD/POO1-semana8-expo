package atracciones;

public class Director {
	private String nombre, apellido;
	private boolean enPlanilla;
	
	public Director(String nombre, String apellido, boolean enPlanilla) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.enPlanilla = enPlanilla;
	}

	@Override
	public String toString() {
		return "Director [nombre=" + nombre + ", apellido=" + apellido + ", enPlanilla=" + enPlanilla + "]";
	}
	
	
}
