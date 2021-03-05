package exercicios.prog2play;

import java.util.Comparator;

public class ComparadorPorVisualizacoes implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		if(p1.getVisualizacoes() == p2.getVisualizacoes()) {
			return 0;
		}else if(p1.getVisualizacoes() > p2.getVisualizacoes()) {
			return 1;
		}else {
			return -1;
		}
		//return p1.getVisualizacoes() - p2.getVisualizacoes();
	}

}
