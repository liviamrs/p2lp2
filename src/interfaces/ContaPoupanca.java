package interfaces;

public class ContaPoupanca implements Contabil{
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
	@Override
	public boolean sacar(double valor) {
		return false;
	}
	@Override
	public void depositar(double valor) {
		
	}

}
