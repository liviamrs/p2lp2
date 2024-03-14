package exercicio.copapedois;

import java.util.HashMap;

public class TimeController {

    public HashMap<Integer, Jogador> jogadores;

    public TimeController() {
    	jogadores = new HashMap<>();
    }
    public void cadastraJogador(String nome, int numero, int poderChute) {
    	jogadores.put(numero, new Jogador(nome, numero, poderChute));
    }

    public void setFuncaoAtacante(int numeroJ1, int poderDrible) {
    	Jogador j = jogadores.get(numeroJ1);
    	j.setFuncao(new Atacante(poderDrible));
    }

    public void setFuncaoZaga(int numeroJ1, float potenciaCarrinho) {
    	Jogador j = jogadores.get(numeroJ1);
    	j.setFuncao(new Zaga(potenciaCarrinho));
    }

    public void setFuncaoMeiDeCampo(int numeroJ1, String subfuncao) {
    	Jogador j = jogadores.get(numeroJ1);
    	j.setFuncao(new MeiDeCampo(subfuncao));
    }

    public int disputa(int numeroJ1, int numeroJ2) {
    	Jogador j1 = jogadores.get(numeroJ1);
    	Jogador j2 = jogadores.get(numeroJ2);
    	/*
    	if(j1.valorTotal() > j2.valorTotal()) {
    		return numeroJ1;
    	}else if(j1.valorTotal() < j2.valorTotal()) {
    		return numeroJ2;
    	}else {
    		return numeroJ1;
    	}*/
    	return j1.disputa(j2);
    }

    public void mudaPoderChute(int numeroJ1, int poderChute) {
    	Jogador j = jogadores.get(numeroJ1);
    	j.setPoderChute(poderChute);
    }

    public double valorTotalJogador(int numeroJ1) {
    	Jogador j = jogadores.get(numeroJ1);
    	return j.valorTotal();
    }

    public double valorCompraJogador(int numeroJ1) {
    	Jogador j = jogadores.get(numeroJ1);
    	return j.valorCompra();
    }

}