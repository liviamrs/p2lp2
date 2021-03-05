package interfaces;

public class ContaCorrente implements Contabil{
	private String cpf;
	private double saldo;
	private int numero;
	private double chequeEspecial;
	
	public ContaCorrente(String cpf, int numero, double chequeEspecial) {
		this.cpf = cpf;
		this.numero = numero;
		saldo = 0;
	}
	@Override
	public boolean sacar(double valor) {
		if(valor < (saldo + chequeEspecial)){
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	  @Override public void depositar(double valor) { saldo += valor; }
	 

}
