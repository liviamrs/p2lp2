package exercicios.javabasico;
import java.util.*;
/**
 * Dirlididi Problema ShTvy2kb2
 * @author Livia
 *
 */
public class GastosQuatroSemanas{
	//o total gasto, o maior gasto e o menor gasto
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] valores = new int[7];
		int soma, maior, menor;
		
		for(int j=0; j<4; j++){
			soma = 0;
			maior = Integer.MIN_VALUE;
			menor = Integer.MAX_VALUE;
		
			for(int i=0; i<7; i++){
				valores[i] = sc.nextInt();
				soma += valores[i];
				if(valores[i] > maior){
					maior = valores[i];
				}
				if(valores[i] < menor){
					menor = valores[i];
				}
			}
		
			System.out.println(soma + " " + menor + " " + maior);
		}	
	}
}
