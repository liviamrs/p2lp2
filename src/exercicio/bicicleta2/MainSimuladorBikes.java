package exercicio.bicicleta2;

import java.util.Scanner;

public class MainSimuladorBikes {
	public static void main(String[] args) {
		final String MENU = "\n O que deseja realizar?\n"+
							"1. Configurar bicicleta \n" +
							"2. Exibir bicicleta \n" +
							"3. Historico simulacoes \n" +
							"4. Acelerar \n" +
							"5. Desacelerar \n" +
							"6. Parar \n" +
							"7. Velocidade atual \n" +
							"8. Sair \n" +
							">> ";
		final int CONFIGURAR = 1;
		final int EXIBIR = 2;
		final int HISTORICO = 3;
		final int ACELERAR = 4;
		final int DESACELERAR = 5;
		final int PARAR = 6;
		final int VELOCIDADE_ATUAL = 7;
		final int SAIR = 8;
		
		SimuladorBikes s = new SimuladorBikes();
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.println(MENU);
			op = sc.nextInt();
			switch(op) {
			case CONFIGURAR:
				configurarBicicleta(sc, s);
				break;
			case EXIBIR:
				exibirBicicleta(s);
				break;
			case HISTORICO:
				historicoSimulacoes(s);
				break;
			case ACELERAR:
				acelerar(s);
				break;
			case DESACELERAR:
				desacelerar(s);
				break;
			case PARAR:
				parar(s);
				break;
			case VELOCIDADE_ATUAL:
				velocidadeAtual(s);
				break;
			case SAIR:
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
		System.out.println("parando...");
	}

	private static void desacelerar(SimuladorBikes s) {
		s.desacelerar();
		System.out.println("desacelerando...");
	}

	private static void acelerar(SimuladorBikes s) {
		s.acelerar();
		System.out.println("acelerando...");
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
