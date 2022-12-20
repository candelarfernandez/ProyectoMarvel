package ar.edu.unlam;

public class Alma extends GemasDelInfinito implements Hechizable{

	public Alma(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer incrementarPoder(Integer valorInicial) {
	return valorInicial*2;		
	}

}
