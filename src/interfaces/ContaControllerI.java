package interfaces;

import java.util.HashMap;

public class ContaControllerI {
	private HashMap<Integer,Contabil> contas;
	private int cont;
	
	public ContaControllerI(){
		contas = new HashMap<>();
	}
	public void cadastrarContaCorrente(String cpf, double chequeEspecial) {
		ContaCorrente c = new ContaCorrente(cpf, cont++, chequeEspecial);
		
	}
	public void cadastrarContaPoupanca(String cpf) {
		
	}
	public void cadastrarContaFamilia(String cpf1, String cpf2) {
		
	}
	public boolean sacar(int numero, double valor) {
		Contabil c = contas.get(numero);
		if(c != null)
			return c.sacar(valor);
		return false;
	}
	
	public void depositar(int numero, double valor) {
		
	}

}
