package exercicio.asenta;

import java.util.HashMap;
import java.util.Map;

public class Asenta {
	private Map<String, Apresentacao> apresentacoes;
	private Map<String, Funcionario> funcionarios;
	
	public Asenta() {
		apresentacoes = new HashMap<>();
		funcionarios = new HashMap<>();
	}
	public void cadastraExpositiva(String codigoString, String dataString, String horaString, String localString, String responsavelString, int qtdCadeiras, String projetor) {
		boolean hasProjetor = projetor.equals("Sim")?true:false;
		Expositiva e = new Expositiva(codigoString, dataString, horaString, localString, responsavelString, qtdCadeiras, hasProjetor);
		apresentacoes.put(codigoString, e);
	}
	
	public void cadastraPratica(String codigoString, String dataString, String horaString, String localString, String responsavelString) {
		//fazer depois
	}
	public void cadastraDialogica(String codigoString, String dataString, String horaString, String localString, String responsavelString) {
		//fazer depois
	}
	
	public String exibirApresentacao(String codigo) {
		return apresentacoes.get(codigo).toString();
	}

	public boolean consultarApresentacao(String codigo) {
		return apresentacoes.get(codigo) != null?true:false;
	}
	
	public double tempoApresentacao(String codigo) {
		return apresentacoes.get(codigo).tempo();
	}
	public void cadastraFuncionario(String nomeString, String siape) {
		
	}
	public void alocaFuncionario(String codigo, String siape) {
		Funcionario funcionario = funcionarios.get(siape);
		apresentacoes.get(codigo).alocaFuncionario(funcionario);
	}
	public String alocado(String codigo) {
		return "Nao";
	}
	

}
