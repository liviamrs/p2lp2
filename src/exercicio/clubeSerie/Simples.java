package exercicio.clubeSerie;

import java.util.List;

public class Simples implements FormasVisualizacao{

	//implementa��o simplificada...
	@Override
	public double notaGeral(List<Opiniao> opinioes) {
		return 1;
	}

	@Override
	public String comentarioLegal(List<Opiniao> opinioes) {
		return "legal";
	}

}
