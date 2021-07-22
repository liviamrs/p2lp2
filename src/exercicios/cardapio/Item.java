package exercicios.cardapio;

public class Item {
	private String nome;
	private int calorias;
	
	public Item(String nome, int calorias) {
		this.calorias = calorias;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getCalorias() {
		return calorias;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " Calorias: " + getCalorias();
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Item))
				return false;
		
		Item item = (Item)obj;
		return item.getNome().equals(getNome());
	}

}
