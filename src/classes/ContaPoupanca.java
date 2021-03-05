package classes;


public class ContaPoupanca{
	private String cpf;
	private double saldo;
	private double percentualRendimentos;
	private int numero;
	
	public ContaPoupanca(String cpf, int numero) {
		this.cpf = cpf;
		this.numero = numero;
		this.saldo = 0;
		percentualRendimentos = 0.02;
	}
	
	public boolean sacar(double valor) {
		return false;
	}
	
	public void depositar(double valor) {
		
	}

}
