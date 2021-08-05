package exercicio.colecoes;

import java.util.ArrayList;

public class DancaConga {
	private ArrayList<Dancarino> dancarinos;
	public void adicionaDancarino(String nome, String emoji) {
		dancarinos.add(new Dancarino(nome, emoji));
	}
	
	public String listarDancarinos() {
		String resultado = "";
		for(Dancarino d:dancarinos) {
			resultado += d.getNome() + " ";
		}
		return resultado;
	}
	
	public String listarDancarinosEmoji() {
		String resultado = "";
		for(Dancarino d:dancarinos) {
			resultado += d.getEmoji() + " ";
		}
		return resultado;
	}
	
	public int contarDancarinos() {
		return  dancarinos.size();
	}
	
	public String exibirDancarino(int indice) {
		return dancarinos.get(indice).toString();
	}
	
	@Override
	public String toString() {
		return dancarinos.toString();
	}

}
