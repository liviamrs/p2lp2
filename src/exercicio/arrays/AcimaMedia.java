package exercicio.arrays;

import java.util.Scanner;
/**
 * Prova de conceitos :)
 * @author liviamrscampos
 *
 */
public class AcimaMedia {
	public static void main(String[] args) {
		int[] valores;
		Scanner sc = new Scanner(System.in);
		int n = leInteiro(sc, "A quantidade de numeros: ");
		valores = new int[n];
		
		preencheArray(valores, sc);
		double media = calculaMedia(valores);
		double percentual = percentualAcimaMedia(valores, media);
		System.out.println("Percentual acima da media: " + percentual);	
	}
	
	private static int leInteiro(Scanner sc, String msg){
		System.out.print(msg);
		return sc.nextInt();
	}
	
	private static void preencheArray(int[] numeros, Scanner sc) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = leInteiro(sc, "Numero: ");
		}
	}
	
	private static double calculaMedia(int[] numeros) {
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		return soma/numeros.length;
	}
	
	private static double percentualAcimaMedia(int[] numeros, double media) {
		int qtdAcimaMedia = 0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > media) {
				qtdAcimaMedia++;
			}
		}
		return ((double)qtdAcimaMedia/numeros.length)*100;
	}

}
