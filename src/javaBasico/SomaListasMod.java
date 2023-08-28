package javaBasico;
import java.util.Scanner;

public class SomaListasMod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam = sc.nextInt();
		int[] lista1 = new int[tam];
		int[] lista2 = new int[tam];
		
		//lista1
		leLista(lista1, sc);
		
		//lista 2
		leLista(lista2, sc);
		
		//soma
		soma(lista1, lista2);
		
	}
	private static void leLista(int[] lista, Scanner sc){
		for (int i = 0; i < lista.length; i++) {
			lista[i] = sc.nextInt();
		}
	}
	private static void soma(int[] lista1, int[] lista2){
		for (int i = 0; i < lista2.length; i++) {
			System.out.println(lista1[i]+lista2[i]);
		}
		
	}

}
