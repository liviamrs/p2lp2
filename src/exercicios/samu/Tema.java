package exercicios.samu;

public class Tema {
    private String nome;
    private int id;
    private Ajuda[] ajudas;
    
    public Tema(String nome, int id) {
    	this.nome = nome;
    	this.id = id;

   }

    public int getId() {
    	return id;
    }
    public void adicionaAjuda(Ajuda ajuda){
    	ajudas[0] = ajuda;
    }

    public int contarAjudas(){
    	return 0;
    }

    public String toString(){
    	return "";
    }

}