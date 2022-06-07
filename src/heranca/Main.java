package heranca;

public class Main {
	public static void main(String[] args) {
		BicicletaAbstrato b1 = new Bicicleta(10,"caloi",new Assento(128,"gel"));
		BicicletaAbstrato b2 = new BicicletaDeMarcha(10,"caloi",new Assento(128,"gel"), 3);
		b2.acelera();
		System.out.println(b1.getVelocidadeAtual());
		System.out.println(b2.getVelocidadeAtual());
	}

}
