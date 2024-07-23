package exercicio.bicicleta;

/* 
 * Um pouco sobre exceções em tempo de execução.
 * 
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
public class BicicletaComExcecao{
	private double velocidadeAtual;
	private double velocidadeMaxima;
	private String modelo;
	private Assento meuAssento;
	
	public BicicletaComExcecao(double velocidadeMaxima, String modelo, int tamanho, String descricaoAssento, String modeloAssento){
		if(velocidadeMaxima <= 0) {
			throw new IllegalArgumentException("Velocidade maxima deve ser maior do que zero.");
		}
		if(modelo == null) {
			throw new NullPointerException();
		}
		this.velocidadeMaxima = velocidadeMaxima;
		this.modelo = modelo;
		meuAssento = new Assento(tamanho, descricaoAssento, modeloAssento);
	}
	
	public String getAssento(){
		return meuAssento.exibeAssento();
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

	public void setAssento(Assento novoAssento) {
		meuAssento = novoAssento;
	}
	
	public boolean temConforto(double larguraQuadril){
		return meuAssento.temConforto(larguraQuadril);
	}
	
	public String exibeBicicleta() {
		return "Super bike " + getModelo();
	}
}
