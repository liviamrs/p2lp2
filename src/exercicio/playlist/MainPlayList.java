package exercicio.playlist;

import java.util.ArrayList;

/* Colecoes em Java: listas e Collections
 * 
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
public class MainPlayList {
	public static void main(String[] args) {
		Musica m1 = new Musica("Familia Madrigal", "Encanto sound track", 2);
		Musica m2 = new Musica("Alvejante", "Ze Vaqueiro", 3);
		Musica m4 = new Musica("Alvejante", "Dj Tiel", 3);
		Musica m3 = new Musica("Melhor eu ir", "Menos eh Mais", 2);
		
		ArrayList<Musica> musicas = new ArrayList<>();
		musicas.add(m1);
		musicas.add(m2);
		System.out.println(musicas.get(0));
		System.out.println(musicas.contains(m2));
		System.out.println(musicas.contains(m4));
		
		///usando playlists e repositorio
		RepositorioMusicas repositorioMusicas = new RepositorioMusicas();
		repositorioMusicas.adicionaMusica("Familia Madrigal", "Encanto sound track", 2);
		repositorioMusicas.adicionaMusica("Alvejante", "Dj Tiel", 3);
		repositorioMusicas.adicionaMusica("Melhor eu ir", "Menos eh Mais", 2);
		
		PlayList p1 = new PlayList("P2");
		p1.adiciona(repositorioMusicas.pegaMusica(0));
		p1.adiciona(repositorioMusicas.pegaMusica(1));
		p1.adiciona(repositorioMusicas.pegaMusica(1));
		p1.adiciona(repositorioMusicas.pegaMusica(1));
		System.out.println(p1.tocarPlayList());
		
		PlayList p2 = new PlayList("Curticao");
		p2.adiciona(repositorioMusicas.pegaMusica(1));
		p2.adiciona(repositorioMusicas.pegaMusica(2));
		System.out.println(p2.tocarMusica(0));

		
	}

}
