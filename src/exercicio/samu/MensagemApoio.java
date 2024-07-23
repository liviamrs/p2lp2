package exercicio.samu;

public class MensagemApoio {
    private String autor;
    private String texto;
    private String urlImagem;
    
    public MensagemApoio(String texto, String autor) {
    	this(autor, texto, "");
   }

    public MensagemApoio(String autor, String texto, String urlImagem) {
    	this.autor = autor;
    	this.texto = texto;
    	this.urlImagem = urlImagem;
   }

    
    public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public String getAutor() {
		return autor;
	}

	public String getTexto() {
		return texto;
	}

	public String toString(){
    	return texto + " " + autor;
    }

}