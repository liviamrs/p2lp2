package exercicio.cardapio;

import java.util.List;

import exercicio.clubeSerie.FormasVisualizacao;
import exercicio.clubeSerie.Opiniao;

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
