package exercicio.prog2play;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Produto implements Comparable<Produto>{
	
	private String nome;
	private double valor;
	private int id;
	private int visualizacoes;
	private List<String> comentarios;
	private LocalDate dataLancamento;
	
	public Produto(String nome, double valor, int id) {
		this.nome = nome;
		this.valor = valor;	
		this.id = id;
		comentarios = new ArrayList<>();
		dataLancamento = LocalDate.now();
	}
	
	public String getNome() { 	
		return nome; 	
		}
	
	public double getValor() { 
		return valor; 
		}
	
	public double getId() { 
		return id; 
		}
	
	public int getComentarios() { 
		return comentarios.size(); 
		}
	
	public int getVisualizacoes() { 
		return visualizacoes; 
		}
	private void atualizaVisualizacoes() {
		visualizacoes++;
	}
	
	public void adicionaComentario(String comentario) {
		comentarios.add(comentario);
	}
	public String exibirProduto() {
		atualizaVisualizacoes();
		return this.toString(); //idealmente um clone do objeto
	}
	@Override
	public String toString() { 
		return id + " Nome: " + nome + "| Valor: " + valor; 
		}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public int compareTo(Produto outro) {
		return getNome().compareTo(outro.getNome());
	}
	
	

}
