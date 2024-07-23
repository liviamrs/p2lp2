package exercicio.pratoCheio;

public class PratoCircular extends PratoPersonalizado {

	private static final double PI = 3.14;
	private double raio;
	
	public PratoCircular(double precoBase, Personalizacao personalizacao, double raio) {
		this(precoBase, personalizacao, raio, "");
	}
	
	public PratoCircular(double precoBase, Personalizacao personalizacao, double raio, String autor) {
		super(precoBase, personalizacao, autor);
		this.raio = raio;
	}
	
	@Override
	public String toString() {		
		return super.toString()+" Formato circular.";
	}

	@Override
	public double calculaPreco() {
		return super.getPrecoBase() + (0.01 * getAreaTotal());
	}
	
	private double getAreaTotal() {
		return PI*raio*raio;
	}
}
