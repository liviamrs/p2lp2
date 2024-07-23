package exercicio.pratoCheio;

import java.util.HashMap;
import java.util.Map;

public class PratoCheioController{

	private Map<Integer, PratoInterface> pratos;
	private int contadorId;
	
	public PratoCheioController(){
		pratos = new HashMap<>();
	}
	
	public int criaPratoRetangular(double precoBase, String personalizacaoStr, double base, double altura, String autor) {
		Personalizacao personalizacao = criarPersonalizacao(personalizacaoStr);
		pratos.put(contadorId, new PratoRetangular(precoBase, personalizacao, base, altura, autor));
		return contadorId++;
	}

	public int criaPratoTriangular(double precoBase, String personalizacaoStr, double base, double altura, String autor) {
		Personalizacao personalizacao = criarPersonalizacao(personalizacaoStr);
		pratos.put(contadorId, new PratoTriangular(precoBase, personalizacao, base, altura, autor));
		return contadorId++;
	}

	public int criaPratoCircular(double precoBase, String personalizacaoStr, double raio, String autor) {
		Personalizacao personalizacao = criarPersonalizacao(personalizacaoStr);
		pratos.put(contadorId, new PratoCircular(precoBase, personalizacao, raio, autor));
		return contadorId++;
	}

	private Personalizacao criarPersonalizacao(String personalizacaoStr)  {
		Personalizacao personalizacao;
		if(personalizacaoStr.equals("Estampa")){
			personalizacao = Personalizacao.ESTAMPA;
		}else if(personalizacaoStr.equals("Pintura")){
			personalizacao = Personalizacao.PINTURA;
		}else if(personalizacaoStr.equals("Foto")){
			personalizacao = Personalizacao.FOTO;
		}else{
			throw new IllegalArgumentException("Personalizacao invalid. Por favor, escolha outra opcao.");
		}
		return personalizacao;
	}

	public double calculaLucroTotal() {
		double lucroTotal = 0.0;
		for(PratoInterface prato : pratos.values()){
			lucroTotal += prato.calculaPreco();
		}
		return lucroTotal;
	}

	public String buscarPratoPorPersonalizacao(String personalizacaoStr) {
		Personalizacao base = criarPersonalizacao(personalizacaoStr);
		for(PratoInterface p: pratos.values()) {
			if(p.getPersonalizacao().equals(base)) {
				return p.toString(); 
			}
		}
		throw new IllegalArgumentException("Personalizacao invalida.");
	}
	
	public String listar() {
		return pratos.toString();
	}

	public int getQtdPratos() {
		return this.pratos.size();
	}
	
	public void removePrato(int id){
		this.pratos.remove(id);
	}

	@Override
	public String toString() {
		return pratos.toString();
	}
	
	public static void main(String[] args) {
		PratoCheioController e = new PratoCheioController();
		e.criaPratoCircular(6, "Estampa", 4, "Yuri");
		e.criaPratoCircular(3, "Foto", 2, "Zeta");
		e.criaPratoCircular(5, "Pintura", 3, "Audrea");
		System.out.println(e.listar());
	}
}
