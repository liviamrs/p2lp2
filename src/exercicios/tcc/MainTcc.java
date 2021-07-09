package exercicios.tcc;

public class MainTcc {
	public static void main(String[] args) {
		TCC lucas = new TCC("Lucas M.", "Livia Campos");
		lucas.setTema("Automacao de ar condicionado em smartcampus");
		System.out.println(lucas);
		lucas.addAcompanhamento("tema definido", 0);
		lucas.addAcompanhamento("análise com problema", 1);
		lucas.setStatus(0);
		lucas.addAcompanhamento("trabalhando na escrita", 2);
		lucas.setStatus(1);
		lucas.addNota(9, 0);
		lucas.addNota(10, 1);
		lucas.addNota(10, 2);
		System.out.println(lucas);
		lucas.setArquivo("url");
		System.out.println(lucas.leArquivo());
		System.out.println(lucas.getVisualizacoes());
		
		TCC manoela = new TCC("Manoela S.");
	}

}
