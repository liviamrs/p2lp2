package aula2p2;
import java.util.Scanner;
/*
 * Aula 2 P2 em 01.12.21
 * Dirlididi problema Key: NEvQySfxo
 * Livia Sampaio Campos
*/
public class Senhas {
	public static void main(String[] args) {
		String[] palavras = new String[4];
		int[] numeros = new int[4];
		Scanner sc = new Scanner(System.in);
		
		//ler numeros
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(sc.nextLine());
		}
		
		//ler palavras
		for (int i = 0; i < palavras.length; i++) {
			palavras[i] = sc.nextLine();
		}
		String senha = "";
		for (int i = 0; i < 4; i++) {
			senha += String.valueOf(palavras[i].charAt(numeros[i]));
		}
				/*String.valueOf(palavras[0].charAt(numeros[0]))+
				String.valueOf(palavras[1].charAt(numeros[1])) +
				String.valueOf(palavras[2].charAt(numeros[2])) +
				String.valueOf(palavras[3].charAt(numeros[3]));*/
		System.out.println(senha);
	}

}
