package exercicio.oracules;

public abstract class Oraculo implements OraculoInterface{

	private int peso;
	private String tema;
	private int codigo;
	
	public Oraculo(String tema, int peso, int codigo) {
		this.peso = peso;
		this.codigo = codigo;
		this.tema = tema;
	}
	@Override
	public int getPeso() {
		return peso;
	}
	
	public String getTema() {
		return tema;
	}

}
