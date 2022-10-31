package exercicios.samu;

public class MensagemApoio {
    private String autor;
    private String texto;
    private String urlImagem;
    public MensagemApoio(String texto, String autor) {
    	this.autor = autor;
    	this.texto = texto;
   }

    public MensagemApoio(String autor, String texto, String urlImagem) {

   }

    public String toString(){
    	return texto + " " + autor;
    }

}