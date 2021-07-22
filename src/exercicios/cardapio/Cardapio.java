package exercicios.cardapio;

import java.util.Arrays;
public class Cardapio {
	private String nome;
	private Item[] itens;
	private int i;
	
	public Cardapio(String nome, int qtdItens) {
		this.nome = nome;
		itens = new Item[qtdItens];
	}
	
	public Cardapio(String nome) {
		this(nome, 5);
	}
	
	public String getNome() {
		return nome;
	}
	
	public boolean adicionaItem(String nome, int calorias) {
		if(i == itens.length) {
			return false;//incrementei para nao adicionar se exceder tamanho
		}
		Item item = new Item(nome, calorias);
		if(!temItem(item)) {
			itens[i++] = item;//nao adiciona se for duplicado
			return true; // seria mais legal retornar se foi bem sucedido ou não
		}
		return false;
	}
	
	private boolean temItem(Item item) {
		for(Item it:itens) {
			if(it !=null && it.equals(item)) {//nao eh muito eficiente; melhor usar i
				return true;
			}
		}
		return false;
	}
	
	public String listaCardapio() {
		String resultado = "";
		int ordem = 1;
		for(int j=0; j<i; j++) {
			resultado += ordem++ + "-" + itens[j].toString()+"\n";

		}
		return resultado;
	}
	
	public int calcularCaloriasRefeicao(String[] refeicao, String tamanhoRefeicao) {
		int soma = 0;
		for(String prato:refeicao) {
			Item umItem = getItem(prato);
			soma += umItem.getCalorias();
		}
		int multiplicador = multiplicadorTamanho(tamanhoRefeicao);
		return soma*multiplicador;
	}
	
	private Item getItem(String prato) {
		for(int j=0; j<i; j++) {
			if(itens[j].getNome().equals(prato)) {
				return itens[j];
			}
		}
		throw new IllegalArgumentException("Item de cardapio invalido!");
	}
	
	private int multiplicadorTamanho(String tamanho) {
		switch(tamanho) {
		case "padrao":
			return 1;
		case "grande":
			return 2;
		case "mega":
			return 3;
		default:
			throw new IllegalArgumentException("Tamanho de refeicao invalido!");
		}	
	}
	
	@Override
	public String toString() {
		return getNome() + "\n" +
				Arrays.toString(itens);
	}

}
