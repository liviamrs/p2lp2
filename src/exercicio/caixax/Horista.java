package exercicio.caixax;
/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: reuso de código
 * @author Lívia
 *
 */
public class Horista extends Funcionario{
	private String especialidade;
	private int horasTrabalhadas;
	
	public Horista(String nome, String cpf, double salarioBase, int horasTrabalhadas, String especialidade) {
		super(nome, cpf, salarioBase);
		this.especialidade = especialidade;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	@Override
	public double salarioFinal() {
		return super.getSalarioBase() * getHorasTrabalhadas();
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + 
				getEspecialidade() + ", " + 
				super.getSalarioBase() + ", " +
				getHorasTrabalhadas() + ", " +
				salarioFinal();
	}

}
