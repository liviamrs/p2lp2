package exercicio.caixax;
/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: reuso de código
 * @author Lívia
 *
 */
public class Mensalista extends Funcionario{
	private int numeroFaltas, horasExtras;
	
	public Mensalista(String nome, String cpf, double salarioBase, int numeroFaltas, int horasExtras) {
		super(nome, cpf, salarioBase);
		this.numeroFaltas = numeroFaltas;
		this.horasExtras = horasExtras;
	}

	public int getNumeroFaltas() {
		return numeroFaltas;
	}
	
	public int getHorasExtras() {
		return horasExtras;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " +
				super.getSalarioBase() + ", " +
				getNumeroFaltas() + ", " +
				getHorasExtras() + ", " +
				salarioFinal();
	}
	
	@Override
	public double salarioFinal() {
		return super.getSalarioBase() - (0.02*super.getSalarioBase()*getNumeroFaltas()) + (getHorasExtras()*super.getSalarioBase()/194);
	}

}
