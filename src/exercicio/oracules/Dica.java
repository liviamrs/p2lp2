package exercicio.oracules;

public class Dica extends Oraculo{
	private String descricao;
	
	public Dica(String tema, int codigo, String descricao) {
		super(tema, 1, codigo);
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "Dica (" + super.getTema() + "): " + descricao;
	}

}
