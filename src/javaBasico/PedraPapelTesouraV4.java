package javaBasico;
/**
 * Código usado nas aulas de Programação OO - Java Básico
 * 
 * @author Lívia (com colaboração da turma de 2019.1)
 *
 */
import java.util.Scanner;
public class PedraPapelTesouraV4 {
	public static void main(String[] args) {
		//usando arrays
		String[][] jogadas = {{"Empate!", "Jogador2 ganhou!", "Jogador1 ganhou!"},
		{"Jogador1 ganhou!", "Empate!", "Jogador2 ganhou!"},
		{"Jogador2 ganhou!", "Jogador1 ganhou!", "Empate!"}};
		
		String[] nomeJogada = {"PEDRA", "PAPEL", "TESOURA"};
		Scanner sc = new Scanner(System.in);
		int op;
		int jogador1, jogador2;
		do {
			System.out.println("Jogada 1 (1-pedra; 2-papel; 3-tesoura): ");
			jogador1 = sc.nextInt();
			System.out.println("Jogada 2 (1-pedra; 2-papel; 3-tesoura): ");
			jogador2 = sc.nextInt();
			System.out.println(nomeJogada[jogador1-1] + " - " + nomeJogada[jogador2-1]);
			System.out.println(jogadas[jogador1-1][jogador2-1]);
			System.out.println("Deseja continuar? 0-sim; 1-nao");
			op = sc.nextInt();
		}while(op != 1);
		sc.close();

	}

}
