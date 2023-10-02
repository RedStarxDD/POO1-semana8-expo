package atracciones;

public class Atraccion {
	private String tipo, nombre, ruc;

	public Atraccion(String tipo, String nombre, String ruc) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
		this.ruc = ruc;
	}

	@Override
	public String toString() {
		return "Atraccion [tipo=" + tipo + ", nombre=" + nombre + ", ruc=" + ruc + "]";
	}

	
}
