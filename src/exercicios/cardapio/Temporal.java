package exercicios.cardapio;

import java.util.List;

import exercicios.clubeSerie.FormasVisualizacao;
import exercicios.clubeSerie.Opiniao;

public class Temporal implements FormasVisualizacao{

	//implementação simplificada
	@Override
	public double notaGeral(List<Opiniao> opinioes) {
		return 2;
	}

	@Override
	public String comentarioLegal(List<Opiniao> opinioes) {
		return "legal plus";
	}

}
