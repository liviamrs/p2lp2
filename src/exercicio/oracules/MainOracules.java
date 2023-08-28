package exercicio.oracules;

import java.util.Map;
import java.util.TreeMap;

public class MainOracules {
	public static void main(String[] args) {
		//uso direto
		Oraculo o1 = new Dica("coracao", 1, "nao comer muito sal");
		System.out.println(o1);
		System.out.println(o1.getPeso());
		
		//uso Oracules
		Oracules o2 = new Oracules();
		o2.adicionaOraculoDica("coracao", "nao comer muito sal");
		System.out.println(o2.listarOraculos());
		o2.adicionaOraculoDica("coracao", "nao comer muito sal");
		System.out.println(o2.listarOraculos());
	}

}
