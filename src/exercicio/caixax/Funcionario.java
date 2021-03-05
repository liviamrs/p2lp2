package exercicio.caixax;
/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: reuso de código
 * @author Lívia
 *
 */
public abstract class Funcionario implements Pagavel{

	private double salarioBase;
	private String nome, cpf;
	
	public Funcionario(String nome, String cpf, double salarioBase) {
		this.nome = nome;
		this.cpf = cpf;
		this.salarioBase = salarioBase;
	}
	
	@Override
	public abstract double salarioFinal();
	
	public double getSalarioBase() {
		return salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public void setSalarioBase(double novoSalario) {
		salarioBase = novoSalario;
	}
	
	@Override
	public String toString() {
		return getNome() + ", " + getCpf() + ", ";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
	
	

}
