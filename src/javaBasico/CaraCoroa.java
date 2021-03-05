package javaBasico;

/*
 * 1. Vamos gerar um número randômico, se for 0, entao, Cara!; se for 1, entao, Coroa!
 * 2. E se quisermos repetir a brincadeira 5 vezes?
 * 3. E se forem X vezes, onde o usuário informa X?
 * 4. Podemos organizar melhor esse código; vamos modularizar a apresentacao do resultado e a leitura de dados
 */
import java.util.*;
public class CaraCoroa {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe um inteiro: ");
		int limite = s.nextInt();
		jogar(limite);		
		s.close();
	}//fim do main
	
	private static void jogar(int limite2){
		Random r = new Random();
		int resultado;
		for(int i=0; i<limite2; i++){
			resultado = r.nextInt(2);
			System.out.println(resultado == 0? "Cara":"Coroa");
		}
	}
}
