package ar.edu.unlam;

public class Espacio extends GemasDelInfinito implements Hechizable{

	public Espacio(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer incrementarPoder(Integer valorInicial) {
		// TODO Auto-generated method stub
		return valorInicial*2;
	}

}
