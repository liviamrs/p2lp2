package heranca;

import classes.Assento;

public class Bicicleta extends BicicletaAbstrato{
	public Bicicleta(double velocidadeMaxima, String modelo, Assento assento){
		super(velocidadeMaxima, modelo, assento);
	}
	//Um design melhor seria considerar que se nao for informado o assento, sera
	// considerado um objeto assento padrao, por exemplo, de espuma e largura 120mm
	public Bicicleta(double velocidadeMaxima, String modelo) {
		this(velocidadeMaxima, modelo, null);
	}
	
	@Override
	public void acelera() {
		velocidadeAtual = (velocidadeAtual + 2 > getVelocidadeMaxima()) ? getVelocidadeMaxima() : velocidadeAtual + 2;
	}
	@Override
	public void desacelera() {
		velocidadeAtual = (velocidadeAtual - 2 < 0) ? 0 : velocidadeAtual - 2;
	}
}
