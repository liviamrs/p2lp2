package exercicios.televisao;
/**
 * author: prof. Raquel Lopes (2014.2)
 * Para voce modelar e implementar a classe Televisao
 */
import java.util.Scanner;

 public class PaiEFilhoBrigandoNaFrenteDaTV {
	private static Scanner sc = new Scanner(System.in);
	private static Televisao tv;
	private static boolean paiFeliz = false;
	private static boolean filhoFeliz = false;

	public static void main(String[] args) throws Exception {
		final int numCanais = 10;
		
		tv = new Televisao(numCanais, new String[] { "cnn",
				"Discovery Kids", Televisao.ID_CANAL_NAO_SINTONIZADO,
				"Disney XD", "ESPN2", "TC Pipoca", "Globo News",
				Televisao.ID_CANAL_NAO_SINTONIZADO, "TC Cult", "Warner"});
			
		do {
			tv.mudaCanal(recebeNovoCanal());
			if(tv.canalAtualToString().equals(Televisao.ID_CANAL_NAO_SINTONIZADO)){
				paiFeliz = false;
				filhoFeliz = false;
			} else if (tv.canalAtualToString().equals("Warner")) {
				paiFeliz = true;
				filhoFeliz = true;
			} else if ((tv.getCanalAtual() - 1) % 2 == 0) {
				paiFeliz = true;
				filhoFeliz = false;
			} else {
				paiFeliz = false;
				filhoFeliz = true;
			}

			System.out.println("Pai " + felicidade(paiFeliz) + 
                               " e filho " + felicidade(filhoFeliz));
		} while (!paiFeliz || !filhoFeliz);
		sc.close();
	}

	private static String felicidade(boolean estado) {
		return estado ? "feliz" : "triste";
	}

	private static int recebeNovoCanal() {
		System.out.println("Escolha o novo canal");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Escolha numero positivo maior que zero e menor ou igual a "	+ 
			Televisao.NUMERO_MAXIMO_DE_CANAIS);
		}
		int novoCanal = sc.nextInt();
		if (novoCanal <= 0 || novoCanal > tv.getTotalDeCanais())
			return recebeNovoCanal();
		return novoCanal;
	}
 }
