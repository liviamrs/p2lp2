
package classes;

/* 
 * Mais objetos
 * 
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
public class Bicicleta{
	private double velocidadeAtual;
	private double velocidadeMaxima;
	private String modelo;
	private Assento meuAssento;
	
	public Bicicleta(double velocidadeMaxima, String modelo, Assento assento){
		this.velocidadeMaxima = velocidadeMaxima;
		this.modelo = modelo;
		meuAssento = assento;
	}
	//Um design melhor seria considerar que se nao for informado o assento, sera
	// considerado um objeto assento padrao, por exemplo, de espuma e largura 120mm
	public Bicicleta(double velocidadeMaxima, String modelo) {
		this(velocidadeMaxima, modelo, null);
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
		velocidadeAtual = (velocidadeAtual + 2 > getVelocidadeMaxima()) ? getVelocidadeMaxima() : velocidadeAtual + 2;
	}
	public void desacelera() {
		velocidadeAtual = (velocidadeAtual - 2 < 0) ? 0 : velocidadeAtual - 2;
	}

	public void para(){
		velocidadeAtual = 0;
	}
	
	@Override
	public String toString() {
		return "Super bike " + getModelo();
	}

	public void setAssento(Assento novoAssento) {
		meuAssento = novoAssento;
	}
	
	public boolean temConforto(double larguraQuadril){
		return meuAssento.temConforto(larguraQuadril);
	}
	

	
	
	
}
