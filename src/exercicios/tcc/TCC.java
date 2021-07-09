package exercicios.tcc;

import java.text.Format;

/**
 * 08/07/2021
 * @author livia
 * @version 1.0
 */
public class TCC {
	private String orientador;
	private String aluno;
	private String arquivo;
	private int visualizacoes;
	private double notas[];
	private String[] acompanhamento;
	private int status;
	private String tema;
	
	/**
	 * Unico parametro obrigatorio para criar um objeto de TCC
	 * eh o nome do aluno.
	 * @param aluno Nome do aluno.
	 */
	public TCC(String aluno) {
		this(aluno, "");
	}
	
	/**
	 * Tipicamente o objeto TCC eh criado com o nome do aluno e nome
	 * do professor orientador.
	 * Lembrando que o valor inicial do status eh "de boa".
	 * @param aluno Nome do aluno.
	 * @param professor Nome do professor orientador.
	 */
	public TCC(String aluno, String professor) {
		this.aluno = aluno;
		orientador = professor;
		notas = new double[3];
		status = 1;
		tema = "";
		acompanhamento = new String[3];
	}
	
	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	
	/**
	 * Retorna a url de onde o arquivo do tcc pode ser baixado.
	 * @return a url para baixar o tcc do aluno.
	 */
	public String leArquivo() {
		visualizacoes++;
		return arquivo;
	}
	
	public void addNota(double nota, int i) {
		notas[i] = nota;
	}
	
	public double avaliacao() {
		return (notas[0]+notas[1]+notas[2])/3;
	}
	
	public void addAcompanhamento(String msg, int i) {
		acompanhamento[i] = msg;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status == 0?"perigo":"de boa";
	}
	
	public String getOrientador() {
		return orientador;
	}

	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}

	public String getAluno() {
		return aluno;
	}

	public String getTema(){
		return tema;
	}
	public int getVisualizacoes() {
		return visualizacoes;
	}

	@Override
	public String toString() {
		return "Aluno: " + getAluno() +
				"\nOrientador: " + getOrientador() +
				"\nTema: " + getTema() +
				"\nAvaliacao: " + String.format("%,.2f", avaliacao()) +
				"\nVisualizacoes: " + getVisualizacoes();
	}
	

}
