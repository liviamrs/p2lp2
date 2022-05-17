package exercicios.javabasico;
/**
 * Dirlididi problema  PoFnkEzvk
 */
import java.util.*;
public class AcimaMedia{
	public static void main(String[] args){
		String[] numeros;
		String entrada;
		Scanner sc = new Scanner(System.in);
		int num;
		int soma = 0;
		entrada = sc.nextLine();
		numeros = entrada.split(" ");
		
		for(int j=0; j<numeros.length; j++) {
			num = Integer.parseInt(numeros[j]);
			soma+=num;
		}
		int media = soma/numeros.length;
		
		for(int j=0; j<numeros.length; j++) {
			num = Integer.parseInt(numeros[j]);
			if(num > media){
				System.out.print(num + " ");
			}
		}	
	}
}
