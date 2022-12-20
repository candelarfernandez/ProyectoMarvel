package ar.edu.unlam;

public abstract class GemasDelInfinito {
	private String nombre;
	

	public GemasDelInfinito(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public abstract Integer incrementarPoder(Integer valorInicial);

	@Override
	public String toString() {
		return "GemasDelInfinito [nombre=" + nombre + "]";
	}
	
}
