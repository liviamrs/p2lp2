package exercicios.javabasico;

import java.util.Scanner;
/**
 * Dirlididi problema Key: SVBLB6mH2
 * @author Livia
 *
 */
public class MaiorMenor5 {
public static void main(String[] args) {
	String palavra;
	
	Scanner sc = new Scanner(System.in);
	
	palavra = sc.next();
	String maior = palavra;
	String menor = palavra;
	
	for(int i=0; i < 4; i++){
		palavra = sc.next();
		if(palavra.length() > maior.length()){
			maior = palavra;
		}else if(palavra.length() < menor.length()){
			menor = palavra;
		}
	}
	System.out.println(maior);
	
	System.out.println(menor);	
}
}
