package exercicios.clubeSerie;

import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ClubeDaSerie clube = new ClubeDaSerie();
		clube.cadastrarSerie("Lucifer", "Crime", "2016", 8.1);
		clube.cadastrarSerie("Grey's Anatomy", "Drama", "2005", 7.5);
		clube.cadastrarSerie("Once Upon a Time", "Fantasy", "2011", 7.7);
		clube.cadastrarSerie("You", "Crime", "2018", 7.7);
		clube.cadastrarSerie("Virgin River", "Romance", "2019", 7.4);
		
		System.out.println(clube.listarSeries());
		System.out.println(clube.listarSeries(new ComparadorPorImdb()));
	}

}
