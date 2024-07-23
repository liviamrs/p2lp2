package exercicio.javabasico;
/**
 * Dirlididi problema  PoFnkEzvk
 * Modularizando...
 */
import java.util.*;
public class AcimaMediaModular{
	public static void main(String[] args){
		String[] numeros;
		String entrada;
		Scanner sc = new Scanner(System.in);
		int num;
		entrada = sc.nextLine();
		numeros = entrada.split(" ");
		
		int media = media(numeros);
		imprimeAcimaMedia(numeros, media);	
	}
	
	private static void imprimeAcimaMedia(String[] numeros, int media){
		int num;
		for(int j=0; j<numeros.length; j++) {
			num = Integer.parseInt(numeros[j]);
			if(num > media){
				System.out.print(num + " ");
			}
		}	
	}
	private static int media(String[] numeros){
		int soma = 0;
		int num;
		for(int j=0; j<numeros.length; j++) {
			num = Integer.parseInt(numeros[j]);
			soma+=num;
		}
		return soma/numeros.length;
	}
}
