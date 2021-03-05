package javaBasico;

import java.util.Scanner;
/**
 * Código usado nas aulas de Programação OO - Java Básico
 * 
 * @author Lívia (com modularização)
 *
 */
public class PedraPapelTesouraV3 {
	
public static void main(String[] args) {
	//pedra = 1; papel = 2; tesoura = 3

	Scanner sc = new Scanner(System.in);
	int op;
	int jogador1, jogador2;
	do {
		jogador1 = leInt(sc, "Jogada 1 (1-pedra; 2-papel; 3-tesoura): ");
		jogador2 = leInt(sc, "Jogada 2 (1-pedra; 2-papel; 3-tesoura): ");
		jogar(jogador1, jogador2);
		op = leInt(sc, "Deseja continuar? 0-sim; 1-nao");
	}while(op != 1);
	sc.close();
}
private static int leInt(Scanner sc, String msg) {
	System.out.println(msg);
	return sc.nextInt();
}
private static void jogar(int jogador1, int jogador2) {
	final int PEDRA= 1;
	final int PAPEL = 2;
	final int TESOURA = 3;
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
}
}
