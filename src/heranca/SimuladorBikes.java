package heranca;

import classes.Assento;
public class SimuladorBikes {
	private BicicletaInterface b;

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
	
	public void configuraBicicleta(BicicletaInterface nova) {
		b = nova;
	}
	
	public String exibirStatus() {
		return b.toString();
	}
}
