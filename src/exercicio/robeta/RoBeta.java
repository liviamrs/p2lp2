package exercicio.robeta;

import java.util.Arrays;
import java.util.Random;
/**
 * Classe basica para ilustrar conceitos iniciais
 * de criação de classes e uso de objetos
 * Prova de conceito
 * @author Livia
 *
 */
public class RoBeta {
	private int bateria;
	private String[] palavras;
	
	
	public RoBeta(int bateria, String[] palavras){
		if(palavras == null) {
			throw new NullPointerException();
		}
		this.bateria = bateria;
		this.palavras = palavras;
	}
	
	public String exibeRobo() {
		return "RoBeta - " + this.bateria + " - " + Arrays.toString(palavras);
		
	}
	
	public String falar() {
		Random random = new Random();
		int index = random.nextInt(palavras.length);
		return falar(index);
	}
	public String falar(int i) {
		if(i < 0 || i >= palavras.length) {
			return "Palavras nao existe";
		}
		if(consomeEnergia()) {
			return palavras[i];
		}else {
			return "Estou sem bateria!";
		}
		
	}
	
	private boolean consomeEnergia() {
		if(bateria >0) {
			bateria--;
			return true;
		}
		return false;
	}
	
	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
}
