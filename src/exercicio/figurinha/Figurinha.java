package exercicio.figurinha;

import java.util.Objects;

public class Figurinha {
	private String time;
	private String jogador;
	private int quantidade;
	private int peso;
	
	public Figurinha(String jogador, String time, int peso) {
		this.jogador = jogador;
		this.time = time;
		//um tipo de tratamento de erros com excecao; poderiam haver outros
		if(peso < 2) {
			throw new IllegalArgumentException("Peso deve ser maior ou igual a 2");
		}
		this.peso = peso;
		quantidade = 1;
	}
	
	public Figurinha(String jogador, String time) {
		this(jogador, time, 2);
	}
	public void incrementaQtd() {
		quantidade++;
	}
	
	public boolean decrementaQtd() {
		if(quantidade > 1) {
			quantidade--;
			return true;
		}
		return false;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setPeso(int novoPeso) {
		if(novoPeso < 2) {
			throw new IllegalArgumentException("Peso deve ser maior ou igual a 2");
		}
		peso = novoPeso;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public String exibirDetalhes() {
		String r = toString() + " # " + quantidade;
		return r;
	}
	
	public String getJogador() {
		return jogador;
	}
	
	public String getTime() {
		return time;
	}
	
	@Override
	public String toString() {
		return jogador + " - " + time + " * " + peso;
	}

	//equals e hashcode gerados pelo eclipse
	@Override
	public int hashCode() {
		return Objects.hash(jogador, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figurinha other = (Figurinha) obj;
		return Objects.equals(jogador, other.jogador) && Objects.equals(time, other.time);
	}
	
	
	/*
	@Override
	public boolean equals(Object f) {
		if(!(f instanceof Figurinha)) {
			return false;
		}
		Figurinha f2 = (Figurinha) f;
		return jogador.equals(f2.getJogador())&& time.equals(f2.getTime());
	}*/
	
	
}

