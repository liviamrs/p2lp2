
package exercicios.bicicleta;

import java.util.Objects;

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
		meuAssento = new Assento(tamanho, descricaoAssento, modeloAssento);
	}

	public Bicicleta(double velocidadeMaxima, String modelo, int tamanho, String modeloAssento) {
		this(velocidadeMaxima, modelo, tamanho, "", modeloAssento);
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
	
	/**
	 * Método básico para retornar representacao textual de objetos.
	 * Nesse exemplo, pode substituir o método exibeBicicleta()
	 */
	@Override
	public String toString() {
		return "Super bike " + getModelo();
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(modelo);
	}
	@Override
	public boolean equals(Object outro) {
		if (!(outro instanceof Bicicleta)) {
			return false;
		}
		Bicicleta novo = (Bicicleta) outro;
		return this.modelo.equals(novo.getModelo());
	}
	
	public static void main(String[] args) {
		Bicicleta b1 = new Bicicleta(20, "monark", 120, "gel","atrio");
		Bicicleta b2 = new Bicicleta(30, "monark", 120, "gel","atrio");
		Bicicleta b3 = new Bicicleta(30, "caloi", 120, "espuma","atrio");
		
		//usando toString()
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3);//equivalente a b3.toString()
		
		//usando o equals
		if(b1.equals(b2)) {
			//deve imprimir aqui
			System.out.println("Bicicletas sao iguais, tem o mesmo modelo!");
		}else {
			System.out.println("Bicicletas diferentes, nao tem o mesmo modelo!");
		}
		
		if(b1.equals(b3)) {
			System.out.println("Bicicletas sao iguais, tem o mesmo modelo!");
		}else {
			//deve imprimir aqui
			System.out.println("Bicicletas diferentes, nao tem o mesmo modelo!");
		}
	}
}
