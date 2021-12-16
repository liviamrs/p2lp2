package exercicio.diarioBordo;
/* Comecando com objetos: como transformar esse codigo procedural
 * em um codigo Orientado a Objetos?
 * 
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
public class DiarioDeBordo {
	private Anotacao[] anotacoes;
	private int qtdEntradas;
	private String dono;
	private int ano;
	
	public DiarioDeBordo(String dono, int tamanho, int ano) {
		anotacoes = new Anotacao[tamanho];
		this.dono = dono;
		this.ano = ano;
	}
	
	public void anotar(String texto, String data) {
		anotacoes[qtdEntradas++] = new Anotacao(texto, data);
	}
	
	public void anotar(String texto, String data, double avaliacao) {
		anotacoes[qtdEntradas++] = new Anotacao(texto, data, avaliacao);
	}
	public String listar() {
		String resultado = "";
		for (int i = 0; i < qtdEntradas; i++) {
			resultado += anotacoes[i].toString() + System.lineSeparator();
		}
		return resultado;
	}
	public String pesquisar(int index) {
		return anotacoes[index].getTexto();
	}

}
