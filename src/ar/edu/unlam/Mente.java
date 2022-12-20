package ar.edu.unlam;

public class Mente extends GemasDelInfinito implements Hechizable{

	public Mente(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer incrementarPoder(Integer valorInicial) {
		// TODO Auto-generated method stub
		return valorInicial*3;
	}

}
