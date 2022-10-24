package exercicios.bicicleta;

import java.util.Objects;

public class SimuladorBikes {
	private Bicicleta b;

	public SimuladorBikes() {
		b = new Bicicleta(10,"caloi",128,"gel", "atrio");
	}
	
	public void acelerar() {
		b.acelera();
	}
	
	public void desacelerar() {
		b.desacelera();
	}
	
	public void parar() {
		b.para();
	}
	
	public void configuraBicicleta(Bicicleta nova) {
		b = nova;
	}
	
	public String exibirBicicleta() {
		return b.toString();
	}
	
	public Bicicleta getBicicleta() {
		return b;//idealmente, retornar clone de bicicleta
	}
	
	public String statusBicibleta() {
		return "Velocidade maxima: " + b.getVelocidadeMaxima() +
				" velocidade atual: " + b.getVelocidadeAtual();
	}
	
	@Override
	public String toString() {
		return "Simulador Bikes - " + b.getModelo();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(b);
	}
	
	@Override
	public boolean equals(Object outro) {
		if (!(outro instanceof SimuladorBikes)) {
			return false;
		}
		SimuladorBikes novo = (SimuladorBikes) outro;
		return b.equals(novo.getBicicleta());
	}
	public static void main(String[] args) {
		SimuladorBikes sb = new SimuladorBikes();
		System.out.println(sb.exibirBicicleta());
		System.out.println(sb.statusBicibleta());
		sb.acelerar();
		sb.acelerar();
		System.out.println(sb.statusBicibleta());
		sb.desacelerar();
		System.out.println(sb.statusBicibleta());
		sb.configuraBicicleta(new Bicicleta(20, "monark", 120, "gel","atrio"));
		System.out.println(sb.exibirBicicleta());
		System.out.println(sb.statusBicibleta());
		System.out.println(sb.toString());
		System.out.println(sb);
		
//novo simulador
		
	}
}
