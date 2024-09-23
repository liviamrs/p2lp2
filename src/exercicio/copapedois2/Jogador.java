package exercicio.copapedois2;

import java.util.Objects;

public abstract class Jogador implements JogadorInterface{

    private String nome;

    private int numero;

    private int poderChute;

    public Jogador(String nome, int numero, int poderChute) {
    	this.nome = nome;
    	this.numero = numero;
    	this.poderChute = poderChute;
    }

    @Override
    public String toString() {
    	return nome + " " + numero;
    }
    
    // poderiam ser suprimidos por conta da implementação da interface
    public abstract double valorTotal();
    public abstract double valorCompra();
    
    @Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		return numero == other.numero;
	}

    public int getPoderChute() {
    	return poderChute;
    }

    public void setPoderChute(int novo) {
    	this.poderChute = novo;
    }

    public int getNumero() {
    	return numero;
    }
    public int disputa(JogadorInterface j) {
    	if(valorTotal() >= j.valorTotal()) {
    		return numero;
    	}else {
    		return j.getNumero();
    	}
    }

}