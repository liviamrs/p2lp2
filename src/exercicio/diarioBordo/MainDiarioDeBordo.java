package exercicio.diarioBordo;

/* 
 * Associacao e composição
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
import java.util.Scanner;

public class MainDiarioDeBordo {

	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("Uso correto: MainDiarioDeBordo <tam_diario>");
			System.exit(1);
		}
		int entrada = Integer.parseInt(args[0]);
		Scanner sc = new Scanner(System.in);
		final String MENU = "1- adicionar anotacao;\n"+
							"2- pesquisar i-esima anotacao;\n"+
							"3- listar anotacoes;\n"+
							"4- mediaAvaliacoes; \n"+
							"5- sair";
		final int ANOTAR = 1;
		final int PESQUISAR = 2;
		final int LISTAR = 3;
		final int AVALIACOES = 4;
		final int SAIR = 5;
		
		int op;
		int qtdEntradas = 0;
		//cria Diario
		DiarioDeBordo diarioDeBordo = new DiarioDeBordo("Livia", entrada, 2021);
		//DiarioDeBordo diarioDeBordo = new DiarioDeBordo("Livia", 2021);
		
		//manipular diario
		do{
			op = leInt(MENU, sc);
			switch(op){
			case ANOTAR:
				anotar(sc, diarioDeBordo);
				break;
			case PESQUISAR:
				pesquisar(sc, diarioDeBordo);
				break;
			case LISTAR:
				listar(diarioDeBordo);
				break;
			case AVALIACOES:
				mediaAvaliacoes(diarioDeBordo);
				break;
			case SAIR:
				break;
			default:
				System.out.println("Opcao invalida!");
			}
		}while(qtdEntradas++ != entrada && op != SAIR);
		sc.close();	
	}//main
	
	private static void mediaAvaliacoes(DiarioDeBordo diario) {
		System.out.println(diario.mediaCompreensao());
		
	}

	private static void pesquisar(Scanner sc, DiarioDeBordo diario) {
		int index = leInt("Qual o index? ", sc);
		System.out.println(diario.pesquisar(index));
		
	}

	private static void listar(DiarioDeBordo diario) {
		System.out.println(diario.listar());
	}
	private static void anotar(Scanner sc, DiarioDeBordo diario) {
		String texto = leLinha("Qual o texto? ", sc);
		String data = leLinha("Qual a data? ", sc);
		String avaliacao = leLinha("Qual a sua autoavaliacao? ", sc);

		if(avaliacao.equals("")) {
			diario.anotar(texto, data);
		}else {
			diario.anotar(texto, data, Double.parseDouble(avaliacao));
		}
		
	}

	private static String leLinha(String msg, Scanner input){
		System.out.println(msg);
		return input.nextLine();
	}

	private static double leDouble(String msg, Scanner input){
		System.out.println(msg);
		double valor = input.nextDouble();
		input.nextLine();
		return valor;
	}
	private static int leInt(String msg, Scanner input){
		System.out.println(msg);
		int op = input.nextInt();
		input.nextLine();
		return op;
	}


}
