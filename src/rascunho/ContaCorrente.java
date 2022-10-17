package rascunho;


public class ContaCorrente{
	private String cpf;
	private double saldo;
	private int numero;
	private double chequeEspecial;
	
	public ContaCorrente(String cpf, int numero, double chequeEspecial) {
		this.cpf = cpf;
		this.numero = numero;
		saldo = 0;
	}
	
	public boolean sacar(double valor) {
		if(valor < (saldo + chequeEspecial)){
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}

}
