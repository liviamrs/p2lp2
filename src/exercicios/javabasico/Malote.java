package exercicios.javabasico;

import java.util.Scanner;
public class Malote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, op, soma;
		n = 1;
		soma = 0;
		op = sc.nextInt();
		while(op != 0 && n < 100){
			soma = soma + op;
			op = sc.nextInt();
			if(op != 0)
				n++;		
		}
		System.out.println("Soma = " + soma);
		System.out.println("Media = " + soma/n);
	}
}
