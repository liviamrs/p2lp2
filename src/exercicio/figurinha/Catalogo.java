package exercicio.figurinha;

import java.util.Arrays;

public class Catalogo {
	private Figurinha[]figuras;
	private int posicao;
	private final int TAMANHO = 32;

	public Catalogo(){
		figuras = new Figurinha[TAMANHO];
	}
	
	public void adicionarFigura(String nome, String time, int peso) {
		Figurinha f = new Figurinha(nome, time, peso);
		int i;
		if((i = getIndex(f)) == -1) {
			figuras[posicao++] = f;
		}else {
			figuras[i].incrementaQtd();
		}
		
	}
	
	public void adicionarFigura(String nome, String time) {
		adicionarFigura(nome, time, 2);
	}
	
	public boolean contemFigura(Figurinha figura) {
		if(getIndex(figura) == -1) {
			return false;
		}
		return true;
	}
	
	public int getIndex(Figurinha figura) {
		for (int i = 0; i < figuras.length; i++) {
			if(figuras[i] != null && figuras[i].equals(figura)) {
				return i;
			}
		}
		return -1;
	}
	
	public int totalFiguras() {
		int contador = 0;
		for (Figurinha figurinha : figuras) {
			if(figurinha == null) {
				return contador;
			}
			contador += figurinha.getQuantidade();
		}
		return contador;
	}
	
	public String exibirCatalogo() {
		return Arrays.toString(figuras);
	}
	
	public String exibirFigura(int posicao) {
		if(figuras[posicao]==null) {
			return "INEXISTENTE";
		}
		return figuras[posicao].exibirDetalhes();
	}
	public boolean removerFigura(Figurinha f) {
		int i = getIndex(f);
		if(i == -1) {
			return false;
		}
		return figuras[i].decrementaQtd();
	}
}
