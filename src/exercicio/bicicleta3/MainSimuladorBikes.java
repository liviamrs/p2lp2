package exercicio.bicicleta3;

public class MainSimuladorBikes {
	public static void main(String[] args) {
		SimuladorBikes s = new SimuladorBikes();
		System.out.println(s.exibirBicicleta());
		System.out.println(s.qtdBicicletasSimuladas());
		System.out.println(s.toString());
		s.acelerar();
		System.out.println(s.getVelocidadeAtual());
		s.acelerar();
		System.out.println(s.getVelocidadeAtual());
		//criar um simulador com minha propria bicicleta
		s = new SimuladorBikes(50, "caloi");
		s.acelerar();
		System.out.println(s.getVelocidadeAtual());
		System.out.println(s.exibirBicicleta());
		s.trocarBicicleta(70, "cannondale");
		System.out.println(s.exibirBicicleta());
		System.out.println(s.qtdBicicletasSimuladas());
		System.out.println(s);
	}

}
