package exercicios.bicicleta;
/**
 * Essa classe faz parte da Bicicleta
 * Conte�do sobre relacao entre classes
 * @author Livia <br>
 *
 */
public class Assento {

	private int tamanhoAssento;
	private String descricaoAssento;
	private String modelo;
	
	/**
	 * Cria um assento com todas as informacoes.
	 * @param tamanho
	 * @param descricaoAssento
	 */
	public Assento(int tamanho, String descricaoAssento, String modelo){
		tamanhoAssento = tamanho;
		this.descricaoAssento = descricaoAssento;
		this.modelo = modelo;
	}
	
	/**
	 * Acessador de assento
	 * @return O valor do tamanho do assento
	 */
	public int getTamanho() {
		return tamanhoAssento;
	}

	public String getModelo() {
		return modelo;
	}

	public String getDescricaoAssento() {
		return descricaoAssento;
	}

	/**
	 * Define se um assento � ou n�o confort�vel para o usuario,
	 * usando como criterio a largura do quadril.
	 * @param larguraQuadril
	 * @return
	 */
	public boolean temConforto(double larguraQuadril){
		return (tamanhoAssento - larguraQuadril) < 10;
	}
	
	public String exibeAssento() {
		return modelo + " - " + tamanhoAssento;
	}
}
