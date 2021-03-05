package exercicios.prog2play;

import java.util.Comparator;

public class ComparadorPorPreco implements Comparator<Produto>{
	@Override
	public int compare(Produto p1, Produto p2) {
		if(p1.getValor() == p2.getValor()) {
			return 0;
		}else if(p1.getValor() > p2.getValor()) {
			return 1;
		}else {
			return -1;
		}
		//return (int)((p1.getValor() - p2.getValor())*1000);
	}
}
