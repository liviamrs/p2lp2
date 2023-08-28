package exercicio.oracules;

import exercicio.oracules.Oficina;

public abstract class Produto {
	private String categoria;
	private String nome;
	protected double valorBase;
	
	public Produto(String categoria, String nome, double valorBase) {
		this.categoria = categoria;
		this.nome = nome;
		this.valorBase = valorBase;
	}
	
	@Override
	public String toString() {
		return categoria + " - " + nome;
	}
	
	public double getPrecoBase() {
		return valorBase;
	}
	
	public abstract double calculaPreco();
	
	public static void main(String[] args) {
		Produto p2 = new Oficina("Oficina", "pintura avancada", 60, 2);
		System.out.println(p2);
		System.out.println(p2.getPrecoBase());
		System.out.println(p2.calculaPreco());
	}

}
