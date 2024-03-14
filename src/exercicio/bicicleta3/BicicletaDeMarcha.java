package exercicio.bicicleta3;

public class BicicletaDeMarcha extends Bicicleta{
	private int numMarchas;
	private int marchaAtual;
	
	public BicicletaDeMarcha(double velocidadeMaxima, String modelo, int numMarchas) {
		super(velocidadeMaxima, modelo);
		this.numMarchas = numMarchas;
		marchaAtual = 1;
	}
	
	@Override
	public void acelera() {
		super.velocidadeAtual = (super.velocidadeAtual + (marchaAtual/3.0) > super.getVelocidadeMaxima()) ? super.getVelocidadeMaxima() : super.velocidadeAtual + (marchaAtual/3.0);
	}
	
	@Override
	public void desacelera() {
		super.velocidadeAtual = (super.velocidadeAtual - (marchaAtual/3.0) < 0) ? 0 : super.velocidadeAtual - (marchaAtual/3.0);
	}
	
	@Override
	public String toString() {
		return super.toString() + " marchas: " + numMarchas;
	}
	public static void main(String[] args) {
		BicicletaDeMarcha b1 = new BicicletaDeMarcha(10, "caloi", 3);
		System.out.println(b1);
		System.out.println(b1.getVelocidadeMaxima());
		System.out.println(b1.getVelocidadeAtual());
		b1.acelera();
		System.out.println(b1.getVelocidadeAtual());
		b1.acelera();
		System.out.println(b1.getVelocidadeAtual());
		b1.para();
		System.out.println(b1.getVelocidadeAtual());
		
	}

}
