package exercicio.clubeSerie;

import java.util.List;

public class Temporal implements FormasVisualizacao{

	@Override
	public double notaGeral(List<Opiniao> opinioes) {
		return 2;
	}

	@Override
	public String comentarioLegal(List<Opiniao> opinioes) {
		return "legal plus";
	}

}
