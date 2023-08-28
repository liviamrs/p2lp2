package javaBasico;
import java.util.Iterator;
import java.util.Scanner;
/*
 * Aula 2 P2 em 01.12.21
 * Dirlididi problema Key: ShTvy2kb2
 * Livia Sampaio Campos
*/
public class QuatroSemanas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int soma;
		int maior;
		int menor;
		String valor;
		String[] numeros;
		for (int i = 0; i < 4; i++) {
			maior = Integer.MIN_VALUE;
			menor = Integer.MAX_VALUE;
			soma = 0;
			valor = sc.nextLine();
			numeros = valor.split(" ");
			for(int j=0; j<numeros.length; j++) {
				num = Integer.parseInt(numeros[j]);
				if(num > maior) {
					maior = num;
				}
				if(num < menor) {
					menor = num;
				}
				soma+=num;
			}
			System.out.println(soma + " " + maior + " " + menor);	
		}
	}

}
