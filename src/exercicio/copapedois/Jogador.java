package exercicio.copapedois;

import java.util.Objects;

public class Jogador {

    private String nome;

    private int numero;

    private int poderChute;

    private FuncaoJogador funcao;

    public Jogador(String nome, int numero, int poderChute) {
    	this.nome = nome;
    	this.numero = numero;
    	this.poderChute = poderChute;
    }

    @Override
    public String toString() {
    	return "nome: " + nome +
    			" numero: " + numero;
    }


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

	public double valorTotal() {
		//checar null para funcao
		return funcao.valorTotal(poderChute);
	}
	
    public double valorCompra() {
    	//checar null para funcao
    	return funcao.valorCompra(poderChute);
    }

    public int getNumero() {
    	return numero;
    }
    public int disputa(Jogador j2) {
    	if(valorTotal() > j2.valorTotal()) {
    		return numero;
    	}else if(valorTotal() < j2.valorTotal()) {
    		return j2.getNumero();
    	}else {
    		return numero;
    	}
    }
    public double getPoderChute() {
    	return poderChute;
    }

    public void setPoderChute(int novo) {
    	poderChute = novo;
    }

    public void setFuncao(FuncaoJogador novo) {
    	funcao = novo;
    }

}