package exercicios.criptografia;

import java.util.ArrayList;
import java.util.List;

public class BiblioCripto {
	private List<String> textosOriginais;
	private AlgoritmoCripto algoritmo;
	
	public BiblioCripto() {
		textosOriginais = new ArrayList<String>();
		algoritmo = new ROT13();
	}
	
	public String criptografar(String textoOriginal) {
		textosOriginais.add(textoOriginal);
		return algoritmo.criptografar(textoOriginal);
	}
	
	public List<String> listarTextosOriginais() {
		return textosOriginais;
	}
	
	public void configurarAlgoritmo(String algoritmo) {
		switch(algoritmo){
			case "ROT13":
				this.algoritmo = new ROT13();
				break;
			case "L33T":
				this.algoritmo = new L33T();
				break;
			case "EXP":
				this.algoritmo = new EXP();
		}
	}

}
