package exercicio.playlist;

import java.util.Objects;

/* Colecoes em Java: listas e Collections
 * 
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
public class Musica {
	private int duracao;
	private String titulo;
	private String artista;
	private boolean ispreLancamento;
	
	public Musica(String titulo, String artista, int duracao) {
		this.titulo = titulo;
		this.artista = artista;
		this.duracao = duracao;
		ispreLancamento = true;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setPreLancamento() {
		this.ispreLancamento = false;
	}
	public String getTitulo() {
		return titulo;
	}

	public String getArtista() {
		return artista;
	}
	
	public String exibirDetalhes() {
		String tag = "";
		if(ispreLancamento) {
			tag = "[PreLancamento]";
		}
		return tag + getTitulo() +"; " +getArtista() +"; " + getDuracao()+ "min";
	}
	@Override
	public String toString() {
		return getTitulo() +"; " +getArtista();
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Musica other = (Musica) obj;
		return Objects.equals(titulo, other.titulo);
	}
	

}
