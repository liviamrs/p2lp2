package aula1p2;
import java.util.Scanner;
/*
 * Aula 1 P2 em 25.11.21
 * Dirlididi problema Key: PmZq7rg1I
 * Livia Sampaio Campos
*/
public class JogoAdivinhacao{
	public static void main(String[] args){
		int alvo;
		int tentativa;
		Scanner entrada = new Scanner(System.in);
		
		alvo = entrada.nextInt();
		boolean flag = false;
		
		do{
			tentativa = entrada.nextInt();
			if(tentativa > alvo){
				System.out.println("MAIOR");
			}else if(tentativa < alvo){
				System.out.println("MENOR");
			}else{
				System.out.println("ACERTOU");
				flag = true;
			}
		}while(!flag);
	}

}
