package ar.edu.unlam;

public class Realidad extends GemasDelInfinito implements Hechizable{

	public Realidad(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer incrementarPoder(Integer valorInicial) {
		// TODO Auto-generated method stub
		return valorInicial*2;
	}

}
