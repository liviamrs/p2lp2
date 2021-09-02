package exercicios.clubeSerie;

import java.util.HashMap;

public class ClubeDaSerie {
	private HashMap<String, Serie> series;
	
	public ClubeDaSerie() {
		series = new HashMap<>();
	}
	
	public void cadastrarSerie(String titulo, String categoria, String anoLancamento, double imdb) {
		series.put(titulo, new Serie(titulo, categoria, anoLancamento, imdb));
	}
	
	public String listarSeries() {
		return series.toString();
	}
	
	public String exibirSerie(String titulo) {
		return series.get(titulo).toString();
	}
	
	public String exibirSerieComDetalhes(String titulo, String tipoVisualizacao){
		FormasVisualizacao f;
		if(tipoVisualizacao.equals("Simples")){
			f = new Simples();
		}else if(tipoVisualizacao.equals("Temporal")) {
			f = new Simples();//temporal
		}else {
			throw new IllegalArgumentException("tipo invalido");
		}
		return series.get(titulo).exibirDetalhes(f);
	}
	
	public void cadastrarOpiniao(String titulo, double nota, String comentario) {
		series.get(titulo).cadastrarOpiniao(nota, comentario);
	}
	
	public void cadastrarOpiniao(String titulo, double nota, String comentario, String autor) {
		series.get(titulo).cadastrarOpiniao(nota, comentario, autor);		
	}
	
	public String listarOpinioes(String titulo) {
		return series.get(titulo).listarOpinioes();
	}
	
	

}
