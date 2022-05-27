package exercicio.diarioBordo2;

public class Anotacao {
	//atributos
	private String texto;
	private String data;
	private String estudante;
	private int nivelCompreensao;
	
	public Anotacao(String texto, String data, String estudante){
		this(texto, data, estudante, 0);
	}
	
	public Anotacao(String texto, String data, String estudante, int nivelCompreensao){
		this.texto = texto;
		this.data = data;
		this.estudante = estudante;
		this.nivelCompreensao = nivelCompreensao;
	}
	
	public String exibeAnotacao() {
		return estudante + " - " + texto + " - " + data;
	}

	public String getTexto() {
		return texto;
	}

	public int getNivelCompreensao() {
		return nivelCompreensao;
	}
	
	public void setNivelCompreensao(int nivelCompreensao) {
		this.nivelCompreensao = nivelCompreensao;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void adicionaTexto(String texto) {
		this.texto += "; " + texto;
	}
	
	public String getData() {
		return data;
	}

	public String getEstudante() {
		return estudante;
	}
	
	
	
	

}
