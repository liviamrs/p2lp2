package exercicio.bicicleta3;

import java.util.Scanner;

public class MainBicicleta {
public static void main(String[] args) {
		
		Bicicleta b1 = new Bicicleta(30, "caloi");
		System.out.println(b1);
		System.out.println(b1.exibirDetalhes());
		b1.acelera();
		System.out.println(b1.getVelocidadeAtual());

		for (int i = 0; i < 30; i++) {
			b1.acelera();
		}
				
		System.out.println(b1.getVelocidadeAtual());
		
		b1.para();
		System.out.println(b1.getVelocidadeAtual());
		System.out.println(b1.toString());
		
		Bicicleta b2 = new Bicicleta(30, "caloi");
		if(b1.equals(b1)) {
			System.out.println("bicicletas iguais");
		}else {
			System.out.println("bicicletas diferentes");
		}
		System.out.println(b1.equals("livia"));
		b1.equals(b2);
		b1.equals(b2);
		b1.equals(new Scanner(System.in));
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		Bicicleta b3 = new Bicicleta(30, "monark");
		System.out.println(b3.hashCode());
		}
	

}
