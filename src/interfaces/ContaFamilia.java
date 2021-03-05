package interfaces;

public class ContaFamilia implements Contabil{
	private ContaCorrente c1, c2;
	private int numero;
	
	public ContaFamilia(int numero, ContaCorrente c1, ContaCorrente c2) {
		this.c1 = c1;
		this.c2 = c2;
		this.numero = numero;
	}
	@Override
	public boolean sacar(double valor) {
		return false;
	}
	@Override
	public void depositar(double valor) {
		
	}

}
