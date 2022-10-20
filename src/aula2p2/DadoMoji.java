package aula2p2;
/*
 * DadoMoji.java
 * 
 * Copyright 2022 Livia <Livia@DESKTOP-5P6U5FA>
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class DadoMoji {
	public static void main(String[] args) {
		String[] dado = {":)", ":*", ":0", "|o", ";)", ":|"};
		int op, index;
		Scanner sc = new Scanner(System.in);
		Random r = new Random(); 
		do {
			index = r.nextInt(5);
			System.out.println(dado[index]);
			System.out.println("Girar novamente? 1-parar");
			op = sc.nextInt();
		}while(op == 1);	
	}
}
