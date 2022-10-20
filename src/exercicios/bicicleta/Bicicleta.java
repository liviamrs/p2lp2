
package exercicios.bicicleta;

/* 
 * Relacoes entre classes
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
	
	public Bicicleta(double velocidadeMaxima, String modelo, int tamanho, String descricaoAssento, String modeloAssento){
		this.velocidadeMaxima = velocidadeMaxima;
		this.modelo = modelo;
		this.meuAssento = new Assento(tamanho, descricaoAssento,modeloAssento);
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
	
	
	public static void main(String[] args) {
		Bicicleta b1 = new Bicicleta(20, "monark", 120, "gel","atrio");
		Bicicleta b2 = new Bicicleta(30, "monark", 120, "gel","atrio");
		Bicicleta b3 = new Bicicleta(30, "caloi", 120, "espuma","atrio");
		
		b1.acelera();
		b1.acelera();

		for (int i = 0; i < 30; i++) {
			b2.acelera();
		}
		b2.acelera();
		System.out.println(b1.exibeBicicleta());
		System.out.println(b2.exibeBicicleta());
		System.out.println(b3.exibeBicicleta());
		
		System.out.println(b1.getVelocidadeAtual());
		System.out.println(b2.getVelocidadeAtual());
		System.out.println(b3.getVelocidadeAtual());
		
		b2.para();
		System.out.println(b2.getVelocidadeAtual());	}
}
