
package exercicio.bicicleta;

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
	
	/**
	 * 
	 * @param velocidadeMaxima
	 * @param modelo
	 * @param tamanho
	 * @param descricaoAssento
	 * @param modeloAssento
	 * @throws NullPointerException
	 */
	public Bicicleta(double velocidadeMaxima, String modelo, int tamanho, String descricaoAssento, String modeloAssento) throws NullPointerException{
		if(modelo == null) {
			throw new NullPointerException("String nula invalida");
		}
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
	
	
	/*@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Bicicleta)) {
			return false;
		}
		Bicicleta outro = (Bicicleta) obj;
		
		return getModelo().equals(outro.getModelo());
	}*/
	
	@Override
	public String toString() {
		return "Super bike " + getModelo();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bicicleta other = (Bicicleta) obj;
		return Objects.equals(modelo, other.modelo);
	}

	public String exibeBicicleta() {
		return "Super bike " + getModelo();
	}
	
	
	public static void main(String[] args) {
		Bicicleta b0 = new Bicicleta(20, null, 120, "gel","atrio");
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
		System.out.println(b2.getVelocidadeAtual());
		System.out.println(b2);
		if(b1.equals(b2)) {
			System.out.println("B1 e B2 sao iguais");
		}else {
			System.out.println("B1 e B2 sao diferentes");
		}
		
		Assento a = new Assento(120, "gel","atrio");
		System.out.println(a);
		String s1 = new String("livia");
		String s2 = new String("maria");
		s1.equals(s2);
		
		System.out.println(b1.equals(s2));
		}
}
