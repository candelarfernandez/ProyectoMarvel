package ar.edu.unlam;

import java.util.HashSet;
import java.util.Set;

public class Heroe implements Comparable<Heroe>{
	private Integer idHeroe;
	private String nombre;
	private Integer valorPoderIncial;
	private Set<GemasDelInfinito> gemas;
	public Heroe(Integer idHeroe, String nombre, Integer valorPoderInicial) {
		super();
		this.idHeroe = idHeroe;
		this.nombre = nombre;
		this.valorPoderIncial=valorPoderInicial;
		this.gemas= new HashSet<>();
	}
	public Integer getIdHeroe() {
		return idHeroe;
	}
	public void setIdHeroe(Integer idHeroe) {
		this.idHeroe = idHeroe;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getValorPoderIncial() {
		return valorPoderIncial;
	}
	public void setValorPoderIncial(Integer valorPoderIncial) {
		this.valorPoderIncial = valorPoderIncial;
	}
	public Set<GemasDelInfinito> getGemas() {
		return gemas;
	}
	public void setGemas(Set<GemasDelInfinito> gemas) {
		this.gemas = gemas;
	}
	public void agregarGema(GemasDelInfinito tiempo) {
		this.gemas.add(tiempo);
		aumentarValor(tiempo);
		
	}
	public void aumentarValor(GemasDelInfinito tiempo) {
		setValorPoderIncial(tiempo.incrementarPoder(getValorPoderIncial()));
	}
	@Override
	public String toString() {
		return "Heroe [idHeroe=" + idHeroe + ",\n nombre=" + nombre + ",\\n valorPoderIncial=" + valorPoderIncial
				+ ",\\n gemas=" + gemas + "]";
	}
	@Override
	public int compareTo(Heroe o) {
		// TODO Auto-generated method stub
		return o.getNombre().compareTo(getNombre())*(-1);
	}
	

}
