package exercicio.clubeSerie;

import java.util.Comparator;

public class ComparadorPorImdb implements Comparator<Serie>{

	@Override
	public int compare(Serie o1, Serie o2) {
		if(o1.getImdb() > o2.getImdb()) {
			return 1;
		}else if(o1.getImdb() < o2.getImdb()) {
			return -1;
		}else {
			return 0;
		}
	}

}
