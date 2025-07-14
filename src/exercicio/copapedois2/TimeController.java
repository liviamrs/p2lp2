package exercicio.copapedois2;

import java.util.HashMap;
import java.util.Map;

public class TimeController {

    private Map<Integer, JogadorInterface> jogadores;

    public TimeController() {
    	jogadores = new HashMap<>();
    }
    public void cadastraAtacante(String nome, int numero, int poderChute, int poderDrible) {
    	jogadores.put((Integer)numero, new JogadorAtacante(nome, numero, poderChute, poderDrible));
    }

    public void cadastraZaga(String nome, int numero, int poderChute, float potenciaCarrinho) {
    	jogadores.put((Integer)numero, new JogadorZaga(nome, numero, poderChute, potenciaCarrinho));
    }

    public void cadastraMeiDeCampo(String nome, int numero, int poderChute, String subfuncao) {
    	jogadores.put((Integer)numero, new JogadorMeiDeCampo(nome, numero, poderChute, subfuncao));
    }

    public int disputa(int numeroJ1, int numeroJ2) {
    	JogadorInterface j1 = jogadores.get(numeroJ1);
    	JogadorInterface j2 = jogadores.get(numeroJ2);
    	/*
    	melhor forma eh encapsular em Jogador
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
    	JogadorInterface j = jogadores.get(numeroJ1);
    	j.setPoderChute(poderChute);
    }

    public double valorTotalJogador(int numeroJ1) {
    	JogadorInterface j = jogadores.get(numeroJ1);
    	return j.valorTotal();
    }

    public double valorCompraJogador(int numeroJ1) {
    	JogadorInterface j = jogadores.get(numeroJ1);
    	return j.valorCompra();
    }
    
    public String listarTime() {
    	return jogadores.toString();
    }
    
    public int listarPoderChute(int numeroJ1) {
    	//forma mais direta de usar os objetos no mapa
    	for(Integer numero: jogadores.keySet()) {
    		JogadorInterface j = jogadores.get(numero);
    		System.out.println(j);
    	}
    	return jogadores.get(numeroJ1).getPoderChute();
    }


}