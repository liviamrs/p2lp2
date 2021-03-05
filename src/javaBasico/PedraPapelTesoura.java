package javaBasico;
/**
 * Código usado nas aulas de Programação OO - Java Básico
 * @author Lívia
 *
 */
public class PedraPapelTesoura {
	public static void main(String[] args) {
		//pedra = 1; papel = 2; tesoura = 3
		int jogador1 = 1,jogador2 = 2;
		if(jogador1 == 1){
			if(jogador2 == 3) {
				System.out.println("Jogador1 ganhou!");
			}else if(jogador2 == 2) {
				System.out.println("Jogador2 ganhou!");
			}else {
				System.out.println("Empate!");
			}
		}else if(jogador1 == 2) {
			if(jogador2 == 1) {
				System.out.println("Jogador1 ganhou!");
			}else if(jogador2 == 3) {
				System.out.println("Jogador2 ganhou!");
			}else {
				System.out.println("Empate!");
			}
		}else if(jogador1 == 3) {
			if(jogador2 == 1) {
				System.out.println("Jogador2 ganhou!");
			}else if(jogador2 == 2) {
				System.out.println("Jogador1 ganhou!");
			}else {
				System.out.println("Empate!");
			}
		}		
	}
}
