package classes;

public class SimuladorBikes {
	private Bicicleta b;

	public SimuladorBikes() {
		b = new Bicicleta(10,"caloi",new Assento(128,"gel"));
	}
	
	public void acelerar() {
		b.acelera();
	}
	
	public void desacelerar() {
		b.acelera();
	}
	
	public void parar() {
		b.para();
	}
	
	public void configuraBicicleta(Bicicleta nova) {
		b = nova;
	}
	
	public String exibirStatus() {
		return b.toString();
	}
}
