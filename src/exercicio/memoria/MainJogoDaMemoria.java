package exercicio.memoria;

import java.util.Scanner;

public class MainJogoDaMemoria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CartaOlimpica[] tabuleiro=null;
		//preencher tabuleiro
		preencheTabuleiro(8, tabuleiro, sc);
		jogar(tabuleiro, sc);
	}

	private static void jogar(CartaOlimpica[] tabuleiro, Scanner sc) {
		int contReveladas = 0;
		int op;
		int totalCartas = tabuleiro.length;
		CartaOlimpica c1, c2;
		do {
			//mostraTabuleiro();
			System.out.println("Qual primeira carta a revelar? 1-"+totalCartas);
			op = sc.nextInt();
			c1 = tabuleiro[op-1];
			System.out.println(c1);
			System.out.println("Qual segunda carta a revelar? 1-"+totalCartas);
			op = sc.nextInt();
			c2 = tabuleiro[op-1];
			System.out.println(c2);
			if(c1.equals(c2)) {
				System.out.println("Acertou!");
				contReveladas++;
				c1.setRevelada();
				c2.setRevelada();
			}else {
				System.out.println("Errou!");
			}
			
		}while(contReveladas < totalCartas);
	}

	private static void preencheTabuleiro(int tamanho, CartaOlimpica[] tabuleiro, Scanner sc) {
		tabuleiro = new CartaOlimpica[tamanho];
		for(int i=0; i<tabuleiro.length; i++) {
			System.out.println("Informe a carta: (nomeAtleta nomeEsporte numero)");
			String linha = sc.nextLine();
			String[] linhaArray = linha.split(" ");
			CartaOlimpica c = new CartaOlimpica(linhaArray[0], linhaArray[1], Integer.parseInt(linhaArray[2]));
			tabuleiro[i] = c;
		}
	}
	
}
