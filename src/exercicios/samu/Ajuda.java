package exercicios.samu;

import java.util.Arrays;

public class Ajuda {
    private String descricao;
    private String autor;
    private int apoio;
    private int id;
    private MensagemApoio[] mensagens;
    private int contadorMensagens;
    
    public Ajuda(String descricao, String nome, int id) {
    	this.descricao = descricao;
    	autor = nome;
    	this.id = id;
    	mensagens = new MensagemApoio[5];
   }

    public void incrementaApoio(){
    	apoio++;
    }

    @Override
    public String toString() {
    	return descricao + " - " + autor + " - " + apoio;
    }

    public String exibirMensagens() {
    	return Arrays.toString(mensagens);
    }
    
    public void adicionaMensagem(String descricao, String autor){
    	MensagemApoio m = new MensagemApoio(descricao, autor);
    	mensagens[contadorMensagens++] = m;//atencao para o controle do array
    }

 
}