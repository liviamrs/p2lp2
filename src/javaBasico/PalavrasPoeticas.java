
package javaBasico;
import java.util.Scanner;
/*
 * Aula 1 P2 em 25.11.21
 * Dirlididi problema Key: Soz38f6v2
 * Livia Sampaio Campos
*/
public class PalavrasPoeticas{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		String palavra1 = entrada.next();
		String palavra2 = entrada.next();
		int endPalavra1 = palavra1.length()-1;
		int endPalavra2 = palavra2.length()-1;
		
		if(palavra1.charAt(0) == palavra2.charAt(0) && 
		palavra1.charAt(endPalavra1) == palavra2.charAt(endPalavra2)){
			System.out.println("S");
		}else{
			System.out.println("N");
		}
		
	}

}
