package exercicios.criptografia;

public class Main {
	public static void main(String[] args) {
		//ilustrar o reuso de tipo
		AlgoritmoCripto a1 = new EXP();
		AlgoritmoCripto a2 = new L33T();
		AlgoritmoCripto a3 = new ROT13();
		//usando o sistema de criptografia
		BiblioCripto b = new BiblioCripto();
		b.criptografar("livia mdmfmdfmdf");
		b.configurarAlgoritmo("L33T");
		
		b.configurarAlgoritmo("ROT13");
		b.criptografar("livia mdmfmdfmdf");
		b.configurarAlgoritmo("L33T");
		b.criptografar("livia mdmfmdfmdf");
	}

}
