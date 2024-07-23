package exercicio.samu;

import java.util.Arrays;

public class Tema {
    private String nome;
    private int id;
    private Ajuda[] ajudas;
    private int contadorAjudas;
    
    public Tema(String nome, int id) {
    	this.nome = nome;
    	this.id = id;
    	ajudas = new Ajuda[10];
   }

    public int getId() {
    	return id;
    }
    public void adicionaAjuda(Ajuda ajuda){
    	ajudas[contadorAjudas++] = ajuda;//atencao para gerencia de arrays
    }

    public int contarAjudas(){
    	return contadorAjudas;
    }

    public String toString(){
    	return nome + "\n"+
    			Arrays.toString(ajudas);
    }

}