package exercicio.oracules;

public class Oficina extends Produto{
	private int cargaHoraria;
	
	public Oficina(String categoria, String nome, double valorBase, int cargaHoraria) {
		super(categoria, nome, valorBase);
		this.cargaHoraria = cargaHoraria;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	@Override
	public double calculaPreco() {
		return cargaHoraria*super.valorBase;
	}

}
