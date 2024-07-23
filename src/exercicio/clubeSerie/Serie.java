package exercicio.clubeSerie;

import java.util.ArrayList;
import java.util.List;

public class Serie implements Comparable<Serie>{
	private String titulo, categoria, anoLancamento;
	private double imdb;
	private List<Opiniao> opinioes;
	
	public Serie(String titulo, String categoria, String anoLancamento, double imdb) {
		this.titulo = titulo;
		this.categoria = categoria;
		this.anoLancamento = anoLancamento;
		this.imdb = imdb;
		this.opinioes = new ArrayList<>();
	}
	
	public double getImdb() {
		return imdb;
	}

	public void setImdb(double imdb) {
		this.imdb = imdb;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public String exibirDetalhes(FormasVisualizacao tipo) {
		return toString() + "\n"+
				detalhesOpinioes(tipo);
	}
	
	private String detalhesOpinioes(FormasVisualizacao tipo) {
		return tipo.notaGeral(opinioes) + " " + tipo.comentarioLegal(opinioes);
	}
	
	public void cadastrarOpiniao(double nota, String comentario) {
		opinioes.add(new Opiniao(nota, comentario));
	}
	
	public void cadastrarOpiniao(double nota, String comentario, String autor) {
		opinioes.add(new Opiniao(nota, comentario, autor));
	}
	
	public String listarOpinioes() {
		return opinioes.toString();
	}
	
	@Override
	public String toString() {
		return getTitulo() + "-" +
				getCategoria() + "-" +
				getAnoLancamento() + "-" +
				getImdb();
	}

	@Override
	public int compareTo(Serie o) {
		return getTitulo().compareTo(o.getTitulo());
	}

}
