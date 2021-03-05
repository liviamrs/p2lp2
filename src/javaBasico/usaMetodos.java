package javaBasico;

public class usaMetodos {
	public static void main(String[] args) {
		
		int x = 34;		
		System.out.println(x + " " + isPar(x));		
		int[] inteiros = new int[3];
		mostrarArray(inteiros);
		preencheArray(inteiros);
		mostrarArray(inteiros);
	}
	private static void mostrarArray(int[] inteiros) {
		for (int i = 0; i < inteiros.length; i++) {
			System.out.println(inteiros[i]);		
		}
	}
	private static boolean isPar(int x){
		x = 55;
		return (x % 2) == 0;
	}	
	private static void preencheArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	}
	
	
}
