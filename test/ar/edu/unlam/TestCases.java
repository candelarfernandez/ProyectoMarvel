package ar.edu.unlam;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class TestCases {

	@Test
	public void queSeCreenLosEstudiosMarvel() {
		EstudiosMarvel marvel = new EstudiosMarvel();
		assertNotNull(marvel);
	}
	
	@Test
	public void queSeCreenHeroesYVillanosEnElJuego() {
		EstudiosMarvel marvel = new EstudiosMarvel();
		Heroe thor = new Heroe(1, "thor", 0);
		Villano loki = new Villano(2, "loki", 0);
		marvel.agregarHeroes(thor);
		marvel.agregarVillanos(loki);
		assertEquals((Integer)1, (Integer)marvel.getHeroes().size());
		assertEquals((Integer)1, (Integer)marvel.getVillanos().size());
	}
	@Test
	public void queSeAgreguenGemas() {
		EstudiosMarvel marvel = new EstudiosMarvel();
		Heroe thor = new Heroe(1, "thor", 2);
		Villano loki = new Villano(2, "loki", 3);
		GemasDelInfinito alma = new Alma("alma");
		GemasDelInfinito tiempo = new Tiempo("tiempo");
		GemasDelInfinito espacio = new Espacio("espacio");
		GemasDelInfinito mente = new Mente("mente");
		GemasDelInfinito realidad = new Realidad("realidad");
		GemasDelInfinito poder = new Poder("poder");
		marvel.agregarHeroes(thor);
		marvel.agregarVillanos(loki);
		thor.agregarGema(tiempo);
		loki.agregarGema(alma);
		assertEquals((Integer)6, thor.getValorPoderIncial());
		assertEquals((Integer)6, loki.getValorPoderIncial());
	}
	@Test
	public void crearBatallas() {
		EstudiosMarvel marvel = new EstudiosMarvel();
		Heroe thor = new Heroe(1, "thor", 2);
		Villano loki = new Villano(2, "loki", 3);
		GemasDelInfinito alma = new Alma("alma");
		GemasDelInfinito tiempo = new Tiempo("tiempo");
		GemasDelInfinito espacio = new Espacio("espacio");
		GemasDelInfinito mente = new Mente("mente");
		GemasDelInfinito realidad = new Realidad("realidad");
		GemasDelInfinito poder = new Poder("poder");
		Batalla batalla = new Batalla(1, thor, loki);
		marvel.agregarHeroes(thor);
		marvel.agregarVillanos(loki);
		thor.agregarGema(tiempo);
		loki.agregarGema(alma);
		marvel.crearBatalla(batalla);
		assertEquals((Integer)1, (Integer)marvel.getBatallas().size());
	}
	@Test
	public void queGaneElQueTieneMasPuntos() {
		EstudiosMarvel marvel = new EstudiosMarvel();
		Heroe thor = new Heroe(1, "thor", 5);
		Villano loki = new Villano(2, "loki", 4);
		GemasDelInfinito alma = new Alma("alma");
		GemasDelInfinito tiempo = new Tiempo("tiempo");
		GemasDelInfinito espacio = new Espacio("espacio");
		GemasDelInfinito mente = new Mente("mente");
		GemasDelInfinito realidad = new Realidad("realidad");
		GemasDelInfinito poder = new Poder("poder");
		Batalla batalla = new Batalla(1, thor, loki);
		marvel.agregarHeroes(thor);
		marvel.agregarVillanos(loki);
		thor.agregarGema(tiempo);
		loki.agregarGema(alma);
		marvel.crearBatalla(batalla);
		marvel.obtenerGanadorDeBatalla(batalla);
		assertEquals((Integer)1, (Integer)marvel.getGanadoresHeroes().size());
	}
	@Test
	public void obtenerListaDeVillanosDescendenteyListaHeroesAscendente() {
		EstudiosMarvel marvel = new EstudiosMarvel();
		Heroe thor = new Heroe(1, "thor", 5);
		Heroe capitanamerica = new Heroe(2, "capitan", 3);
		Heroe ironman = new Heroe(3, "ironman", 8);
		Villano loki = new Villano(1, "loki", 4);
		Villano redskull = new Villano(2, "loki", 12);
		Villano hela = new Villano(3, "hela", 5);
		GemasDelInfinito alma = new Alma("alma");
		GemasDelInfinito tiempo = new Tiempo("tiempo");
		GemasDelInfinito espacio = new Espacio("espacio");
		GemasDelInfinito mente = new Mente("mente");
		GemasDelInfinito realidad = new Realidad("realidad");
		GemasDelInfinito poder = new Poder("poder");
		Batalla batalla = new Batalla(1, thor, loki);
		Batalla batalla1 = new Batalla(2, capitanamerica, redskull);
		Batalla batalla2 = new Batalla(3, ironman, hela);
		marvel.agregarHeroes(thor);
		marvel.agregarHeroes(capitanamerica);
		marvel.agregarHeroes(ironman);
		marvel.agregarVillanos(loki);
		marvel.agregarVillanos(redskull);
		marvel.agregarVillanos(hela);
		thor.agregarGema(tiempo);
		capitanamerica.agregarGema(poder);
		ironman.agregarGema(espacio);
		loki.agregarGema(alma);
		redskull.agregarGema(mente);
		hela.agregarGema(realidad);
		marvel.crearBatalla(batalla);
		marvel.crearBatalla(batalla1);
		marvel.crearBatalla(batalla2);
		marvel.obtenerGanadorDeBatalla(batalla);
		marvel.obtenerGanadorDeBatalla(batalla1);
		marvel.obtenerGanadorDeBatalla(batalla2);
		Set<Villano> listaVillanos = marvel.getGanadoresVillanos();
		Set<Heroe> listaHeroes = marvel.getGanadoresHeroes();
		System.out.println(listaVillanos);
		System.out.println(listaHeroes);
	}
	@Test
	public void saberSiSeSalvoElMundo() throws WorldDestroyedException {
		EstudiosMarvel marvel = new EstudiosMarvel();
		Heroe thor = new Heroe(1, "thor", 5);
		Heroe capitanamerica = new Heroe(2, "capitan", 3);
		Heroe ironman = new Heroe(3, "ironman", 8);
		Villano loki = new Villano(1, "loki", 4);
		Villano redskull = new Villano(2, "loki", 12);
		Villano hela = new Villano(3, "hela", 5);
		GemasDelInfinito alma = new Alma("alma");
		GemasDelInfinito tiempo = new Tiempo("tiempo");
		GemasDelInfinito espacio = new Espacio("espacio");
		GemasDelInfinito mente = new Mente("mente");
		GemasDelInfinito realidad = new Realidad("realidad");
		GemasDelInfinito poder = new Poder("poder");
		Batalla batalla = new Batalla(1, thor, loki);
		Batalla batalla1 = new Batalla(2, capitanamerica, redskull);
		Batalla batalla2 = new Batalla(3, ironman, hela);
		marvel.agregarHeroes(thor);
		marvel.agregarHeroes(capitanamerica);
		marvel.agregarHeroes(ironman);
		marvel.agregarVillanos(loki);
		marvel.agregarVillanos(redskull);
		marvel.agregarVillanos(hela);
		thor.agregarGema(tiempo);
		capitanamerica.agregarGema(poder);
		ironman.agregarGema(espacio);
		loki.agregarGema(alma);
		redskull.agregarGema(mente);
		hela.agregarGema(realidad);
		marvel.crearBatalla(batalla);
		marvel.crearBatalla(batalla1);
		marvel.crearBatalla(batalla2);
		marvel.obtenerGanadorDeBatalla(batalla);
		marvel.obtenerGanadorDeBatalla(batalla1);
		marvel.obtenerGanadorDeBatalla(batalla2);
		assertTrue(marvel.seSalvoElMundo());
	}

}
