package exercicio.caixax;
/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: reuso de código
 * @author Lívia
 *
 */
import java.util.HashMap;
import java.util.Map;

public class CaixaXControlador {
	private Map<String, Pagavel> funcionarios;
	
	public CaixaXControlador() {
		this.funcionarios = new HashMap<>();
	}
	
	public void cadastrarHorista(String nome, String cpf, double salarioBase, int horasTrabalhadas, String especialidade) {
		funcionarios.put(cpf, new Horista(nome, cpf, salarioBase,horasTrabalhadas, especialidade));
	}
	
	public void cadastrarMensalista(String nome, String cpf, double salarioBase, int numeroFaltas, int horasExtras) {
		funcionarios.put(cpf, new Mensalista(nome, cpf, salarioBase,numeroFaltas,horasExtras));
	}
	
	public String listarFuncionarios() {
		return funcionarios.toString();
	}
	
	public double pagamentoTotal() {
		double total = 0;
		for(Pagavel p: funcionarios.values()) {
			total += p.salarioFinal();
		}
		return total;
	}
	
	public void setSalarioBase(String cpf, double novoSalario) {
		funcionarios.get(cpf).setSalarioBase(novoSalario);
	}
}
