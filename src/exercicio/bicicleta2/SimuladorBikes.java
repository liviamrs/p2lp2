package exercicio.bicicleta2;

import java.time.LocalDate;

public class SimuladorBikes {
	private Bicicleta b;
	private int contador;
	String[] historico;
	
	public SimuladorBikes() {
		b = new Bicicleta(30, "monark");
		historico = new String[20];
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
	
	public double getVelocidadeAtual() {
		return b.getVelocidadeAtual();
	}
	
	public String exibirBicicleta() {
		return b.toString();
	}
	
	public String exibirHistorico() {
		String resultado = "####\n";
		for(String s: historico) {
			if(s == null) {
				break;
			}
			resultado += s + " ; ";
		}
		return resultado.trim();
	}
	
	public void configurarBicicleta(double velocidaMaxima, String modelo) {
		b = new Bicicleta(velocidaMaxima, modelo);
		LocalDate hoje = LocalDate.now();
		historico[contador++] = hoje + " - " + modelo;
	}
	
	public int qtdBicicletasSimuladas() {
		return contador;
	}
	@Override
	public String toString() {
		return "Simulador bike super super #"+this.contador;
	}
}