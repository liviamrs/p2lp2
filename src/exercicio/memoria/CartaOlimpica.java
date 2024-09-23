package exercicio.memoria;

public class CartaOlimpica {
	private String nomeAtleta;
	private String esporte;
	private boolean revelada;
	private String descricao;
	private int numero;
	
	public CartaOlimpica(String nomeAtleta, String esporte, int numero) {
		this(nomeAtleta, esporte, numero, "");
	}
	
	public CartaOlimpica(String nomeAtleta, String esporte, int numero, String descricao) {
		this.nomeAtleta = nomeAtleta;
		this.esporte = esporte;
		this.numero = numero;
		this.descricao = descricao;
		this.revelada = false;
	}

	public boolean isRevelada() {
		return revelada;
	}

	public void setRevelada() {
		revelada = revelada?false:true;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeAtleta() {
		return nomeAtleta;
	}

	public String getEsporte() {
		return esporte;
	}

	public int getNumero() {
		return numero;
	}
	
	public String exibirDetalhes() {
		return "Nome atleta: " + getNomeAtleta() + "\n" + 
				"Esporte: " + getEsporte() + "\n" + 
				"Numero: " + getNumero() + "\n" +
				"Descricao: " + getDescricao();
	}
	@Override
	public String toString() {
		return getNomeAtleta() + " " + getEsporte() + " " + getNumero();
	}
	

}
