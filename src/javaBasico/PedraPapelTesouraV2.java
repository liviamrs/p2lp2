package javaBasico;
import java.util.Scanner;
/**
 * Código usado nas aulas de Programação OO - Java Básico
 * 
 * @author Lívia (com colaboração da turma de 2019.1)
 *
 */
public class PedraPapelTesouraV2 {
public static void main(String[] args) {
	//pedra = 1; papel = 2; tesoura = 3
	final int PEDRA= 1;
	final int PAPEL = 2;
	final int TESOURA = 3;
	//Incluindo melhorias sugeridas pelos alunos
	Scanner sc = new Scanner(System.in);
	int op;
	int jogador1, jogador2;
	do {
		System.out.println("Jogada 1 (1-pedra; 2-papel; 3-tesoura): ");
		jogador1 = sc.nextInt();
		System.out.println("Jogada 2 (1-pedra; 2-papel; 3-tesoura): ");
		jogador2 = sc.nextInt();
		if(jogador1 == jogador2) {
			System.out.println("Empate!");
		}else if(jogador1 == PEDRA && jogador2 == TESOURA) {
			System.out.println("Jogador1 ganhou!");
		}else if(jogador1 == PEDRA && jogador2 == PAPEL) {
			System.out.println("Jogador2 ganhou!");
		}else if(jogador1 == PAPEL && jogador2 == PEDRA) {
			System.out.println("Jogador1 ganhou!");
		}else if(jogador1 == PAPEL && jogador2 == TESOURA) {
			System.out.println("Jogador2 ganhou!");
		}else if(jogador1 == TESOURA && jogador2 == PEDRA) {
			System.out.println("Jogador2 ganhou!");
		}else if(jogador1 == TESOURA && jogador2 == PAPEL) {
			System.out.println("Jogador1 ganhou!");
		}		
		System.out.println("Deseja continuar? 0-sim; 1-nao");
		op = sc.nextInt();
	}while(op != 1);
	sc.close();
}
}
