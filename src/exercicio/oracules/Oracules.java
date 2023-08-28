package exercicio.oracules;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Oracules {
	private Map<Integer, OraculoInterface> oraculos;
	private int contador;
	
	public Oracules() {
		oraculos = new HashMap<>();
	}
	
	public void adicionaOraculoDica(String tema, String descricao) {
		oraculos.put(contador, new Dica(tema,contador,descricao));
		contador++;
	}

	public String listarOraculos() {
		return oraculos.toString();
	}
	
	public int calculaImpacto(HashSet<Integer> codigos) {
		int soma = 0;
		for(Integer i:codigos) {
			soma += oraculos.get(i).getPeso();
		}
		return soma;
		
	}
}
