package exercicio.arrays;
/**
 * Prova de conceitos :)
 * @author liviamrscampos
 *
 */
public class CartaMagica {
	public static void main(String[] args) {
		String[] naipes = {"OUROS", "ESPADAS", "COPAS", "PAUS"};
		String[] valores = {"1", "2", "3", "4", "5", 
				"6", "7", "8", "9", "10", "VALETE", "DAMA", "REI"};
		
		int i = (int)(Math.random()*naipes.length);
		int j = (int)(Math.random()*valores.length);
		
		String carta = valores[j] + " de " + naipes[i];
		System.out.println(carta);
	}

}
