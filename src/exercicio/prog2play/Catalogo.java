package exercicio.prog2play;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Catalogo {
	private Map<Integer, Produto> produtos;
	private int geradorId;
	
	public Catalogo() {
		produtos = new HashMap<>();
	}
	
	public int cadastrarProduto(String nome, double preco) {
		produtos.put(++geradorId, new Produto(nome,preco,geradorId));
		return geradorId;
	}
	public void comentarProduto(int id, String comentario) {
		
	}
	public String exibirProduto(int id) {
		return produtos.get(id).exibirProduto(); 
	}
	
	public String exibirProdutos() {
		return produtos.toString();
		}
	public int exibirVisualizacoes(int id) {
		return produtos.get(id).getVisualizacoes();
	}
	
	public String exibirProdutosOrdenado() {
		ArrayList<Produto> lista = new ArrayList<>(produtos.values());
		Collections.sort(lista);
		return lista.toString();
		}
	
	public String exibirProdutosOrdenado(String tipoOrdenacao) {
		Comparator<Produto> comparador;
		switch(tipoOrdenacao) {
		case "visualizacao":
			comparador = new ComparadorPorVisualizacoes();
			break;
		case "preco":
			comparador = new ComparadorPorPreco();
			break;
		default:
			return "";
		}
		ArrayList<Produto> lista = new ArrayList<>(produtos.values());
		Collections.sort(lista, comparador);
		return lista.toString();
		}

}
