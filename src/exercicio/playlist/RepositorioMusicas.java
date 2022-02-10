package exercicio.playlist;

import java.util.ArrayList;

public class RepositorioMusicas {
	private ArrayList<Musica> musicas;
	
	public RepositorioMusicas() {
		musicas = new ArrayList<>();
	}
	
	public void adicionaMusica(String titulo, String artista, int duracao) {
		musicas.add(new Musica(titulo, artista, duracao));
	}
	
	public Musica pegaMusica(int indice) {
		return musicas.get(indice);
	}
	
	public void removeMusica(int indice) {
		musicas.remove(indice);
	}
	
	public boolean contemMusica(Musica m) {
		return musicas.contains(m);
	}
	
	@Override
	public String toString() {
		return musicas.toString();
	}

}
