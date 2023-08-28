package exercicio.perambulando;

import java.util.Arrays;
import java.util.Iterator;

public class Sala {
	private String[][] matrizEspaco;
	private int linAtual, colAtual;
	private final int DIREITA = 1;
	private final int ESQUERDA = 2;
	private final int CIMA = 3;
	private final int BAIXO = 4;
	private String emoji;
	
	public Sala(int dimensao, String emoji) {
		matrizEspaco = new String[dimensao][dimensao];
		iniciaMatrizEspaco();
		this.emoji = emoji;
		matrizEspaco[0][0] = emoji;
	}

	private void iniciaMatrizEspaco() {
		for(int i=0; i<matrizEspaco.length; i++) {
			for (int j=0; j<matrizEspaco.length; j++) {
				matrizEspaco[i][j] = "-";
			}
		}
	}
	
	public boolean mover(int direcao) {
		//observem que não estamos fazendo nenhum tratamento de erros sobre as posições da matriz
		switch(direcao) {
		case DIREITA:
			liberaPosicaoAtual();
			matrizEspaco[linAtual][++colAtual] = emoji;
			break;
		case ESQUERDA:
			liberaPosicaoAtual();
			matrizEspaco[linAtual][--colAtual] = emoji;
			break;
		case CIMA:
			liberaPosicaoAtual();
			matrizEspaco[--linAtual][colAtual] = emoji;
			break;
		case BAIXO:
			liberaPosicaoAtual();
			matrizEspaco[++linAtual][colAtual] = emoji;
			break;
		default:
			return false;
		
		}
		return true;
	}
	
	private void liberaPosicaoAtual() {
		matrizEspaco[linAtual][colAtual] = "-";	
	}

	public String exibirSala() {
		String resultado = "";
		for (int i = 0; i < matrizEspaco.length; i++) {
			for (int j = 0; j < matrizEspaco.length; j++) {
				resultado += matrizEspaco[i][j] + " ";
			}
			resultado.trim();
			resultado += "\n";
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		Sala minhaSala = new Sala(3, ":)");
		System.out.println(minhaSala.exibirSala());
		//DIREITA=1; ESQUERDA=2; CIMA=3; BAIXO=4
		minhaSala.mover(1);
		minhaSala.mover(4);
		minhaSala.mover(2);
		System.out.println(minhaSala.exibirSala());
		
	}

}
