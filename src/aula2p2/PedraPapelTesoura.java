package aula2p2;
/*
 * PedraPapelTesoura.java
 * 
 * Copyright 2022 Livia <Livia@DESKTOP-5P6U5FA> 
 */

import java.util.Scanner;
public class PedraPapelTesoura {
	public static void main(String[] args) {
		//usando arrays
		String[][] jogadas = {{"Empate!", "Jogador2 ganhou!", "Jogador1 ganhou!"},
		{"Jogador1 ganhou!", "Empate!", "Jogador2 ganhou!"},
		{"Jogador2 ganhou!", "Jogador1 ganhou!", "Empate!"}};
		
		Scanner sc = new Scanner(System.in);
		int op;
		int jogador1, jogador2;
		do {
			jogador1 = sc.nextInt();
			jogador2 = sc.nextInt();
			System.out.println(jogadas[jogador1-1][jogador2-1]);
			System.out.println("Deseja continuar? 1-parar");
			op = sc.nextInt();
		}while(op != 1);
		sc.close();
	}
}


