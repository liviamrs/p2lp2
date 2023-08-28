package exercicios.criptografia;

import java.util.ArrayList;

public class BiblioCripto {
	private ArrayList<String> textosOriginais;
	private AlgoritmoCripto alg;
	
	public BiblioCripto() {
		textosOriginais = new ArrayList<String>();
		alg = new ROT13();
	}
	
	public String criptografar(String textoOriginal) {
		textosOriginais.add(textoOriginal);
		return alg.criptografar(textoOriginal);
	}
	
	public ArrayList<String> listarTextosOriginais() {
		return textosOriginais;
	}
	
	public void configurarAlgoritmo(String algoritmo) {
		switch(algoritmo) {
		case "ROT13":
			alg = new ROT13();
			break;
		case "L33T":
			alg = new L33T();
			break;
		case "EXP":
			alg = new EXP();
			break;
		}
	}

}
