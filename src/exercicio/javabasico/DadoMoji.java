package exercicio.javabasico;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import exercicio.clubeSerie.Opiniao;

public class DadoMoji {
	public static void main(String[] args) {
		String[] dado = {":)", ":*", ":0", "|o", ";)", ":|"};
		int op, index;
		Scanner sc = new Scanner(System.in);
		Random r = new Random(); 
		do {
			index = r.nextInt(5);
			System.out.println(dado[index]);
			System.out.println("Girar novamente [0,1]?");
			op = sc.nextInt();
		}while(op == 1);	
	}
}
