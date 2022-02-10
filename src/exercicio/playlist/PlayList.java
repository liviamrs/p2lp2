package exercicio.playlist;
/* Colecoes em Java: listas e Collections
 * 
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 * ADICIONAR
 * REMOVER
 * LISTAR PLAYLIST
 * LISTAR UMA MUSICA
 * TOCAR MUSICA
 * TOCAR PLAYLIST
 */

import java.util.ArrayList;

public class PlayList {
	private String titulo;
	private ArrayList<Musica> minhasMusicas;
	
	public PlayList(String titulo) {
		this.titulo = titulo;
		minhasMusicas = new ArrayList<>();
	}
	
	public void adiciona(Musica m) {
		minhasMusicas.add(m);
	}
	
	public void remove(int indice) {
		minhasMusicas.remove(indice);
	}
	
	public String exibir(int indice) {
		//poderia tambem retornar uma copia do objeto
		return minhasMusicas.get(indice).toString();
	}
	
	public String tocarMusica(int indice) {
		return "\nTocando ...\n" +
				minhasMusicas.get(indice).toString();
	}
	
	public String tocarPlayList() {
		String resultadoString = "";
		for(int i=0; i<minhasMusicas.size(); i++) {
			resultadoString += tocarMusica(i);
		}
		return resultadoString;
	}
	
	public String getTitulo() {
		return titulo;
	}
	@Override
		public String toString() {
			
			return getTitulo() +"\n"+
			minhasMusicas.toString();
		}
	

}
