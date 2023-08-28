package exercicio.bicicleta2;

public class SimuladorBikes {
	private Bicicleta b;
	private int contador;
	
	public SimuladorBikes() {
		this(30, "monark");
	}
	
	public SimuladorBikes(double velocidadeMaxima, String modelo) {
		b = new Bicicleta(velocidadeMaxima, modelo);
		contador++;
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
		//return b.toString();
		return b.getModelo();
	}
	
	public void trocarBicicleta(double velocidaMaxima, String modelo) {
		b = new Bicicleta(velocidaMaxima, modelo);
		contador++;
	}
	
	public int qtdBicicletasSimuladas() {
		return contador;
	}
	@Override
	public String toString() {
		return "Super bike super super #"+this.contador;
	}
}