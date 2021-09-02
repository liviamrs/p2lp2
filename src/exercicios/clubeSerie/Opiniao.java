package exercicios.clubeSerie;

public class Opiniao {
	private double nota;
	private String comentario;
	private String autor;
	
	public Opiniao(double nota, String comentario, String autor) {
		this.nota = nota;
		this.comentario = comentario;
		this.autor = autor;
	}
	
	public Opiniao(double nota, String comentario) {
		this(nota, comentario, "");
	}
	
	
	public double getNota() {
		return nota;
	}

	public String getComentario() {
		return comentario;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return getNota() + "\n" +
				getComentario() + "\n"+
				getAutor();
	}
	

}
