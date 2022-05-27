package exercicio.diarioBordo;

import org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService;

/* 
 * Associacao e composição
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
public class Anotacao {
	private String nome;
	private String data;
	private String texto;
	private double autoAvaliacao;
	
	public Anotacao(String texto, String data){
		this.data = data;
		this.texto = texto;
	}
	
	public Anotacao(String texto, String data, double autoAvaliacao){
		this.data = data;
		this.texto = texto;
		this.autoAvaliacao = autoAvaliacao;
	}
	
	public String getData(){
		return data;
	}

	public String getTexto(){
		return texto;
	}
	
	public double getAvaliacao(){
		return autoAvaliacao;
	}
	
	public void setTexto(String novo){
		texto = novo;
	}
	
	public void setAvaliacao(double novo){
		autoAvaliacao = novo;
	}
	
	public String exibeAnotacao() {
		return "Data: " + this.getData() + "\n" +
				"Texto: " + this.texto;
	}
	
	public String situacaoDesempenho(){
		if(autoAvaliacao > 0 && autoAvaliacao <= 5){
			return "REGULAR";
		}else if(autoAvaliacao > 5 && autoAvaliacao <= 7){
			return "BOM";
		}else if(autoAvaliacao > 7 && autoAvaliacao < 9){
			return "MUITO BOM";
		}else if(autoAvaliacao >= 9 && autoAvaliacao <= 10){
			return "EXCELENTE";
		}else{
			return "ATENCAO!";
		}
	}
	
}
