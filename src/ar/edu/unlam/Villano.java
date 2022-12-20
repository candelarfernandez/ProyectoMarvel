package ar.edu.unlam;

import java.util.HashSet;
import java.util.Set;

public class Villano implements Comparable<Villano>{
	private Integer idVillano;
	private String nombre;
	private Integer valorPoderIncial;
	private Set<GemasDelInfinito> gemas;
	public Villano(Integer idVillano, String nombre, Integer valorPoderInicial) {
		super();
		this.idVillano = idVillano;
		this.nombre = nombre;
		this.valorPoderIncial=valorPoderInicial;
		this.gemas= new HashSet<>();
	}
	public Integer getIdVillano() {
		return idVillano;
	}
	public void setIdVillano(Integer idVillano) {
		this.idVillano = idVillano;
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
	public void agregarGema(GemasDelInfinito alma) {
		this.gemas.add(alma);
		aumentarValor(alma);
	}
	public void aumentarValor(GemasDelInfinito alma) {
		setValorPoderIncial(alma.incrementarPoder(getValorPoderIncial()));
	}
	@Override
	public String toString() {
		return "Villano [idVillano=" + idVillano + ",\n nombre=" + nombre + ",\n valorPoderIncial=" + valorPoderIncial
				+ ",\n gemas=" + gemas + "]";
	}
	@Override
	public int compareTo(Villano o) {
		// TODO Auto-generated method stub
		return o.getNombre().compareTo(getNombre());
	}
	

}
