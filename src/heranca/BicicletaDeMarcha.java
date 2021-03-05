package heranca;

/* 
 * Heranca
 * 
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
import classes.Assento;
public class BicicletaDeMarcha extends BicicletaAbstrato{
	private int numMarchas;
	private int marchaAtual;
	
	public BicicletaDeMarcha(double velocidadeMaxima, String modelo, Assento assento, int numMarchas){
		super(velocidadeMaxima, modelo, assento);
		this.numMarchas = numMarchas;
		marchaAtual = 1;
	}
	
	public int getNumMarchas(){
		return numMarchas;
	}
	public int getMarchaAtual(){
		return marchaAtual;
	}
	public void setMarcha(int nova){
		marchaAtual = nova;//checar o maximo (numMarchas) e o minimo (0); 
	}

	@Override
	public void acelera() {
		super.velocidadeAtual = (super.getVelocidadeAtual() + (marchaAtual/3.0) > super.getVelocidadeMaxima()) ? super.getVelocidadeMaxima() : super.getVelocidadeAtual() + (marchaAtual/3.0);
	}
	@Override
	public void desacelera() {
		super.velocidadeAtual = (super.getVelocidadeAtual() - (marchaAtual/3.0) < 0) ? 0 : super.getVelocidadeAtual() - (marchaAtual/3.0);
	}
	
	public String toString() {
		return super.toString()
				+ "\nMarcha atual: " + this.marchaAtual
				+ "\nNumero de marchas: " + this.numMarchas;
		
	}

}
