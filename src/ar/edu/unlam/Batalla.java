package ar.edu.unlam;

public class Batalla {

	private Integer id;
	private Heroe heroe;
	private Villano villano;

	public Batalla(Integer id, Heroe heroe, Villano villano) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.heroe=heroe;
		this.villano=villano;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Heroe getHeroe() {
		return heroe;
	}

	public void setHeroe(Heroe heroe) {
		this.heroe = heroe;
	}

	public Villano getVillano() {
		return villano;
	}

	public void setVillano(Villano villano) {
		this.villano = villano;
	}

}
