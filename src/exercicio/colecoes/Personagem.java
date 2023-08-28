package exercicio.colecoes;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: colecoes
 * @author Lívia
 *
 */
public class Personagem {
	private int anoNascimento;
	private String nome;

	public Personagem(String nome, int anoNascimento){
		this.anoNascimento = anoNascimento;
		this.nome = nome;
	}
	
	public double idade(){
		LocalDate hoje = LocalDate.now();
		return hoje.getYear() - anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}


	@Override
	public String toString() {
		return "nome: " + getNome() + " " + idade();
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personagem other = (Personagem) obj;
		return Objects.equals(nome, other.nome);
	}
	
}
