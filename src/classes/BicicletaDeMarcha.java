package classes;

/* 
 * Heranca
 * 
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
public class BicicletaDeMarcha{
	private double velocidadeAtual;
	private double velocidadeMaxima;
	private String modelo;
	private Assento meuAssento;
	private int numMarchas;
	private int marchaAtual;
	
	public BicicletaDeMarcha(double velocidadeMaxima, String modelo, Assento assento, int numMarchas){
		this.velocidadeMaxima = velocidadeMaxima;
		this.modelo = modelo;
		meuAssento = assento;
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
	
	public String getAssento(){
		if(meuAssento != null){
			return meuAssento.toString();
		}else{
			return "";
		}
	}

	public double getVelocidadeMaxima(){
		return velocidadeMaxima;
	}

	public double getVelocidadeAtual(){
		return velocidadeAtual;
	}

	public String getModelo() {
		return modelo;
	}

	public void acelera() {
		velocidadeAtual = (velocidadeAtual + (marchaAtual/3.0) > getVelocidadeMaxima()) ? getVelocidadeMaxima() : velocidadeAtual + (marchaAtual/3.0);
	}
	
	public void desacelera() {
		velocidadeAtual = (velocidadeAtual - (marchaAtual/3.0) < 0) ? 0 : velocidadeAtual - (marchaAtual/3.0);
	}
	
	public String toString() {
		return "Super bike " + getModelo()
				+ "\nMarcha atual: " + this.marchaAtual
				+ "\nNumero de marchas: " + this.numMarchas;
		
	}
	
	public void para(){
		velocidadeAtual = 0;
	}
	
	public void setAssento(Assento novoAssento) {
		meuAssento = novoAssento;
	}
	
	public boolean temConforto(double larguraQuadril){
		return meuAssento.temConforto(larguraQuadril);
	}

}
