package exercicios.prog2play;

public class Main {
	public static void main(String[] args) {
		ControllerProg2Play sistema = new ControllerProg2Play();
		int cod1 = sistema.cadastrarProduto("mami", 500);
		int cod2 = sistema.cadastrarProduto("saga", 600);
		sistema.cadastrarProduto("slaque", 300);
		sistema.cadastrarProduto("e-liane", 1000);
		System.out.println(sistema.exibirProdutos());
		//com ordenação por Nome
		System.out.println(sistema.exibirProdutosOrdenado());
		sistema.exibirProduto(cod1);
		sistema.exibirProduto(cod2);
		sistema.exibirProduto(cod2);
		System.out.println("cod2 " + sistema.exibirVisualizacoes(cod2));
		System.out.println("cod1 " + sistema.exibirVisualizacoes(cod1));
		//com ordenação por Visualizacaoes
		System.out.println(sistema.exibirProdutosOrdenado("visualizacao"));
		
		//com ordenação por Preço
		System.out.println(sistema.exibirProdutosOrdenado("preco"));
		
	}

}
