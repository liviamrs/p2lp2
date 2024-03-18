package exercicio.bicicleta2;

import java.util.Objects;

public class BicicletaComExcecao {
	private double velocidadeAtual;
	private double velocidadeMaxima;
	private String modelo;
	public static final int LIMITE = 200;

	public BicicletaComExcecao(double velocidadeMaxima, String modelo){
		if(velocidadeMaxima < 0 || velocidadeMaxima > LIMITE) {
			throw new IllegalArgumentException("Velocidade maxima fora da faixa 0.." + LIMITE+"km/h");
		}
		if(modelo == null) {
			throw new NullPointerException("Modelo null");
		}

		this.velocidadeMaxima = velocidadeMaxima;
		this.modelo = modelo;
	}

	public double getVelocidadeMaxima(){
		return velocidadeMaxima;
	}

	public double getVelocidadeAtual(){
		return velocidadeAtual;
	}

	public String getModelo() {
		return modelo;
	}

	public void acelera() {
		velocidadeAtual = (velocidadeAtual + 2 > this.getVelocidadeMaxima()) ? getVelocidadeMaxima() : velocidadeAtual + 2;
	}
	public void desacelera() {
		velocidadeAtual = (velocidadeAtual - 2 < 0) ? 0 : velocidadeAtual - 2;
	}

	public void para(){
		velocidadeAtual = 0;
	}	
	
	@Override
	public String toString() {
		return "Super bike " + getModelo();
	}
	
	public String exibirDetalhes() {
		return "Super bike " + getModelo() + getVelocidadeAtual();
	}

	@Override
	public int hashCode() {
		return Objects.hash(velocidadeMaxima);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BicicletaComExcecao other = (BicicletaComExcecao) obj;
		return Double.doubleToLongBits(velocidadeMaxima) == Double.doubleToLongBits(other.velocidadeMaxima);
	}
	

}
