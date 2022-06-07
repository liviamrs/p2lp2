package heranca;
/**
 * Essa classe faz parte da Bicicleta
 * Conteúdo sobre relacao entre classes
 * @author Livia <br>
 *
 */
public class Assento {

	private int tamanhoAssento;
	private String descricaoAssento;
	
	/**
	 * 
	 * @param tamanho
	 * @param descricaoAssento
	 */
	public Assento(int tamanho, String descricaoAssento){
		tamanhoAssento = tamanho;
		this.descricaoAssento = descricaoAssento;
	}
	
	/**
	 * Acessador de assento
	 * @return O valor do tamanho do assento
	 */
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
