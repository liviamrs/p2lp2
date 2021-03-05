package exercicios.pratoCheio;

public class PratoTriangular extends PratoPersonalizado {
	
	private double base;
	private double altura;
	
	public PratoTriangular(double precoBase, Personalizacao personalizacao, double base, double altura) {
		this(precoBase, personalizacao, base, altura, "");
	}

	public PratoTriangular(double precoBase, Personalizacao personalizacao, double base, double altura, String autor) {
		super(precoBase, personalizacao, autor);
		this.base = base;
		this.altura = altura;
	}
	@Override
	public String toString() {
		return super.toString()+" Formato triangular.";
	}

	@Override
	public double calculaPreco() {
		return super.getPrecoBase() + (0.01 * getAreaTotal());
	}
	
	private double getAreaTotal() {
		return (base*altura)/2.0;
	}

	
}
