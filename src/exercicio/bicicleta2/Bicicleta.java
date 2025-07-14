
package exercicio.bicicleta2;

import java.util.Objects;

public class Bicicleta implements Cloneable{
	private double velocidadeAtual;
	private double velocidadeMaxima;
	private String modelo;
	public final int LIMITE_VELO = 70;

	public Bicicleta(double velocidadeMaxima, String modelo){
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;	
	}
	
	public Bicicleta(double velocidadeMaxima){
		this(velocidadeMaxima, "");
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
		return "Super bike " + getModelo().toUpperCase() + " - " + getVelocidadeMaxima();
	}
	
	public String exibirDetalhes() {
		return toString() + " - " + getVelocidadeAtual();
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
		Bicicleta other = (Bicicleta) obj;
		return Double.doubleToLongBits(velocidadeMaxima) == Double.doubleToLongBits(other.velocidadeMaxima);
	}
}
