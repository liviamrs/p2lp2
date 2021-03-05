package exercicios.pratoCheio;

import java.util.ArrayList;
import java.util.List;

public class PratoCheioController{

	private List<PratoInterface> pratos;
	
	public PratoCheioController(){
		pratos = new ArrayList<>();
	}
	
	public PratoPersonalizado criaPratoRetangular(double precoBase, String personalizacaoStr, double base, double altura, String autor) {
		Personalizacao personalizacao = criarPersonalizacao(personalizacaoStr);
		return new PratoRetangular(precoBase, personalizacao, base, altura, autor);
	}

	public PratoPersonalizado criaPratoTriangular(double precoBase, String personalizacaoStr, double base, double altura, String autor) {
		Personalizacao personalizacao = criarPersonalizacao(personalizacaoStr);
		return new PratoTriangular(precoBase, personalizacao, base, altura, autor);
	}

	public PratoPersonalizado criaPratoCircular(double precoBase, String personalizacaoStr, double raio, String autor) {
		Personalizacao personalizacao = criarPersonalizacao(personalizacaoStr);
		return new PratoCircular(precoBase, personalizacao, raio, autor);
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
		for(PratoInterface prato : pratos){
			lucroTotal += prato.calculaPreco();
		}
		return lucroTotal;
	}

	public String buscarPratoPorPersonalizacao(String personalizacaoStr) {
		Personalizacao base = criarPersonalizacao(personalizacaoStr);
		for(PratoInterface p: pratos) {
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
	
	public void removePrato(int posicao){
		this.pratos.remove(posicao);
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
