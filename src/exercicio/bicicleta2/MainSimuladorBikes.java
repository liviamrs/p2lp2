package exercicio.bicicleta2;

import java.util.Scanner;

public class MainSimuladorBikes {
	public static void main(String[] args) {
		final String MENU = "1. Configurar bicicleta \n" +
							"2. Exibir bicicleta \n" +
							"3. Historico simulacoes \n" +
							"4. Acelerar \n" +
							"5. Desacelerar \n" +
							"6. Parar \n" +
							"7. Velocidade atual \n" +
							"8. Sair \n" +
							">> ";
		SimuladorBikes s = new SimuladorBikes();
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.println(MENU);
			op = sc.nextInt();
			switch(op) {
			case 1:
				configurarBicicleta(sc, s);
				break;
			case 2:
				exibirBicicleta(s);
				break;
			case 3:
				historicoSimulacoes(s);
				break;
			case 4:
				acelerar(s);
				break;
			case 5:
				desacelerar(s);
				break;
			case 6:
				parar(s);
				break;
			case 7:
				velocidadeAtual(s);
				break;
			case 8:
				System.out.println("Sistema sera finalizado!");
				break;
			default:
				System.out.println("Opcao invalida");
			}
			
			
		}while(op != 8);
							
	}
	
	private static void velocidadeAtual(SimuladorBikes s) {
		System.out.println(s.getVelocidadeAtual());
		
	}

	private static void parar(SimuladorBikes s) {
		s.parar();	
	}

	private static void desacelerar(SimuladorBikes s) {
		s.desacelerar();
		
	}

	private static void acelerar(SimuladorBikes s) {
		s.acelerar();
	}

	private static void historicoSimulacoes(SimuladorBikes s) {
		System.out.println(s.exibirHistorico());
	}

	private static void exibirBicicleta(SimuladorBikes s) {
		System.out.println(s.exibirBicicleta());
		
	}

	private static void configurarBicicleta(Scanner sc, SimuladorBikes s) {
		System.out.print("Velocidade maxima: ");
		double velo = sc.nextDouble();
		sc.nextLine(); //limpa o buffer do teclado
		System.out.print("Modelo: ");
		String modelo = sc.nextLine();
		s.configurarBicicleta(velo, modelo);
	}

}
