package exercicio.diarioBordo;

import java.util.ArrayList;

public class DiarioDeBordoLista {
	private ArrayList<Anotacao> anotacoes;
	private String dono;
	private int ano;
	
	public DiarioDeBordoLista(String dono, int ano) {
		anotacoes = new ArrayList<Anotacao>();
		this.dono = dono;
		this.ano = ano;
	}
	
	public void anotar(String texto, String data) {
		anotacoes.add(new Anotacao(texto, data));
	}
	
	public void anotar(String texto, String data, double avaliacao) {
		anotacoes.add(new Anotacao(texto, data, avaliacao));
	}
	public String listar() {
		String resultado = "";
		for (int i = 0; i < anotacoes.size(); i++) {
			resultado += anotacoes.get(i).toString() + System.lineSeparator();
		}
		return resultado;
	}
	public String pesquisar(int index) {
		//testar tambem se index esta dentro dos limites do array
		if(anotacoes.get(index)==null) {
			return "VAZIO";
		}
		return anotacoes.get(index).getTexto();
	}
	
	public String statusCompreensao(int index) {
		if(anotacoes.get(index)==null) {
			return "VAZIO";
		}
		return anotacoes.get(index).situacaoDesempenho();
	}
	
	public double mediaCompreensao() {
		double soma = 0;
		for (int i = 0; i < anotacoes.size(); i++) {
			soma += anotacoes.get(i).getAvaliacao();
		}
		return soma/anotacoes.size();
	}

}
