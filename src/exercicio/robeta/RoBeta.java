package exercicio.robeta;

import java.util.Arrays;
import java.util.Random;
/**
 * Classe basica para ilustrar conceitos iniciais
 * de criação de classes e uso de objetos
 * @author Livia
 *
 */
public class RoBeta {
	private int bateria;
	private String[] palavras;
	
	public RoBeta(int bateria, String[] palavras){
		checaBateria(bateria);
		if(palavras == null) {
			throw new NullPointerException();
		}
		this.bateria = bateria;
		this.palavras = palavras;
	}
	
	public String exibeRobo() {
		return "RoBeta - " + bateria + " - " + Arrays.toString(palavras);
		
	}
	
	public String falar() {
		Random random = new Random();
		int index = random.nextInt(palavras.length+1);
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
	
	private void checaBateria(int bateria) {
		if(bateria < 0) {
			throw new IllegalArgumentException("Unidades de energia nao pode ser negativo!");
		}
	}
	
	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		checaBateria(bateria);
		this.bateria = bateria;
	}
}
