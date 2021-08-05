package exercicio.colecoes;

import java.time.LocalDate;

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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
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
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	/*@Override
	public boolean equals(Object arg0) {
		if(arg0 instanceof Personagem){
			Personagem novo = (Personagem) arg0;
			return getNome().equals(novo.getNome());
		}
		return false;
	}*/
	
	
}
