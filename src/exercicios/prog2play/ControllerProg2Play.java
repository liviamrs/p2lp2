package exercicios.prog2play;

public class ControllerProg2Play {
	private Catalogo produtos;
	
	public ControllerProg2Play() {
		produtos = new Catalogo();
	}
	
	public int cadastrarProduto(String nome, double preço) {
		return produtos.cadastrarProduto(nome, preço);
	}
	public void comentarProduto(int id, String comentario) {
		produtos.comentarProduto(id, comentario);
	}
	public String exibirProduto(int id) {
		return produtos.exibirProduto(id);
		}
	
	public String exibirProdutos() {
		return produtos.exibirProdutos();
		}
	
	public int exibirVisualizacoes(int id) {
		return produtos.exibirVisualizacoes(id);
		}
	
	public String exibirProdutosOrdenado() {
		return produtos.exibirProdutosOrdenado();
	}
	
	public String exibirProdutosOrdenado(String tipoOrdenacao) {
		return produtos.exibirProdutosOrdenado(tipoOrdenacao);
	}

}
