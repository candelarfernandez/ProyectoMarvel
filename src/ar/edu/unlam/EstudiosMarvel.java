package ar.edu.unlam;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EstudiosMarvel {
	private Set<Heroe> heroes;
	private Set<Villano> villanos;
	private Set<Batalla> batallas;
	private Set<Heroe> ganadoresHeroes;
	private Set<Heroe> perdedoresHeroes;
	private Set<Villano> perdedoresVillanos;
	private Set<Villano> ganadoresVillanos;
	
	public EstudiosMarvel() {
		this.heroes= new TreeSet<>();
		this.villanos= new TreeSet<>();
		this.ganadoresHeroes= new HashSet<>();
		this.ganadoresVillanos= new HashSet<>();
		this.batallas= new HashSet<>();
		this.perdedoresVillanos= new HashSet<>();
		this.perdedoresHeroes= new HashSet<>();
	}
	
	public Set<Heroe> getGanadoresHeroes() {
		return ganadoresHeroes;
	}

	public void setGanadoresHeroes(Set<Heroe> ganadoresHeroes) {
		this.ganadoresHeroes = ganadoresHeroes;
	}

	public Set<Heroe> getPerdedoresHeroes() {
		return perdedoresHeroes;
	}

	public void setPerdedoresHeroes(Set<Heroe> perdedoresHeroes) {
		this.perdedoresHeroes = perdedoresHeroes;
	}

	public Set<Villano> getPerdedoresVillanos() {
		return perdedoresVillanos;
	}

	public void setPerdedoresVillanos(Set<Villano> perdedoresVillanos) {
		this.perdedoresVillanos = perdedoresVillanos;
	}

	public Set<Villano> getGanadoresVillanos() {
		return ganadoresVillanos;
	}

	public void setGanadoresVillanos(Set<Villano> ganadoresVillanos) {
		this.ganadoresVillanos = ganadoresVillanos;
	}

	public Set<Batalla> getBatallas() {
		return batallas;
	}
	public void setBatallas(Set<Batalla> batallas) {
		this.batallas = batallas;
	}
	public Set<Heroe> getHeroes() {
		return heroes;
	}
	public void setHeroes(Set<Heroe> heroes) {
		this.heroes = heroes;
	}
	public Set<Villano> getVillanos() {
		return villanos;
	}
	public void setVillanos(Set<Villano> villanos) {
		this.villanos = villanos;
	}

	public void agregarHeroes(Heroe thor) {
		if(buscarHeroe(thor)==false) {
			this.heroes.add(thor);
		}
	}
	public void agregarVillanos(Villano loki) {
		if(buscarVillano(loki)==false) {
			this.villanos.add(loki);
		}
	}
	private boolean buscarVillano(Villano loki) {
		for (Villano villano : villanos) {
			if(villano.getIdVillano().equals(loki.getIdVillano())) {
				return true;
			}
		}
		return false;
	}
	private boolean buscarHeroe(Heroe thor) {
		for (Heroe heroe : heroes) {
			if(heroe.getIdHeroe().equals(thor.getIdHeroe())) {
				return true;
			}
		}
		return false;
	}
	public void crearBatalla(Batalla batalla) {
		if(existeBatalla(batalla)==false) {
			this.batallas.add(batalla);
		}
		
	}
	private boolean existeBatalla(Batalla nuevaBatalla) {
		for (Batalla batalla : batallas) {
			if(batalla.getId().equals(nuevaBatalla.getId())) {
				return true;
			}
		}
		return false;
	}
	public void obtenerGanadorDeBatalla(Batalla batalla) {
		if(batalla.getHeroe().getValorPoderIncial()>batalla.getVillano().getValorPoderIncial()) {
			this.ganadoresHeroes.add(batalla.getHeroe());
			this.perdedoresVillanos.add(batalla.getVillano());
		}else {
			this.ganadoresVillanos.add(batalla.getVillano());
			this.perdedoresHeroes.add(batalla.getHeroe());
		}
	}

	public Boolean seSalvoElMundo() throws WorldDestroyedException {
		if(this.ganadoresHeroes.size()>this.ganadoresVillanos.size()){
			return true;
		}throw new WorldDestroyedException();
		
	}
	

}
