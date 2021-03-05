package classes;

public class Assento {

	private int tamanhoAssento;
	private String descricaoAssento;
	
	public Assento(int tamanho, String descricaoAssento){
		tamanhoAssento = tamanho;
		this.descricaoAssento = descricaoAssento;
	}
	
	
	public int getTamanhoAssento() {
		return tamanhoAssento;
	}


	public void setTamanhoAssento(int tamanhoAssento) {
		this.tamanhoAssento = tamanhoAssento;
	}

	public String getDescricaoAssento() {
		return descricaoAssento;
	}


	public void setDescricaoAssento(String descricaoAssento) {
		this.descricaoAssento = descricaoAssento;
	}


	public boolean temConforto(double larguraQuadril){
		return (tamanhoAssento - larguraQuadril) < 10;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString(){
		return "Descricao: " + getDescricaoAssento() + " Tamanho: " + getTamanhoAssento();
	}
}
