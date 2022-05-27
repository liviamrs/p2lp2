package exercicio.diarioBordo2;

/* Comecando com objetos: como transformar esse codigo procedural
 * em um codigo Orientado a Objetos?
 * 
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
import java.util.Scanner;
public class DiarioDeBordoOO {
	public static void main(String[] args) {
		//Nao estamos fazendo nenhum tratamento de erros neste codigo!
		if(args.length != 1){
			System.out.println("Uso correto: DiarioDeBordoP2 <tam_diario>");
			System.exit(1);
		}
		int entrada = Integer.parseInt(args[0]);
		Anotacao[] anotacoes = new Anotacao[entrada];
		Scanner sc = new Scanner(System.in);
		final String MENU = "1- adicionar anotacao;\n"+
							"2- pesquisar i-esima anotacao;\n"+
							"3- listar anotacoes;\n"+
							"4- sair";
		final int ANOTAR = 1;
		final int PESQUISAR = 2;
		final int LISTAR = 3;
		final int SAIR = 4;
		
		int op;
		int qtdEntradas = 0;
		//manipular diario
		do{
			op = leInt(MENU, sc);
			switch(op){
			case ANOTAR:
				qtdEntradas = anotar(anotacoes, qtdEntradas, sc);
				break;
			case PESQUISAR:
				pesquisar(sc, anotacoes);
				break;
			case LISTAR:
				listar(qtdEntradas, anotacoes);
				break;
			case SAIR:
				break;
			default:
				System.out.println("Opcao invalida!");
			}
		}while(qtdEntradas != anotacoes.length && op != SAIR);
		sc.close();	
	}//main

	private static void pesquisar(Scanner sc, Anotacao[] anotacoes) {
		int i = leInt("Qual anotacao quer ver: ", sc);
		System.out.println(anotacoes[i].getData() + "- " + anotacoes[i].getTexto());
	}

	private static int anotar(Anotacao[] anotacoes, int qtdEntradas, Scanner sc) {
		System.out.println("Data: ");
		String data = sc.nextLine();
		System.out.println("Texto: ");
		String texto = sc.nextLine();
		System.out.println("Estudante: ");
		String estudante = sc.nextLine();
		Anotacao a = new Anotacao(texto, data,estudante);
		anotacoes[qtdEntradas++] = a;
		return qtdEntradas;
	}

	private static void listar(int qtdEntradas, Anotacao[] anotacoes) {
		for (int j = 0; j < qtdEntradas; j++) {
			System.out.println(anotacoes[j]);
		}
	}
	private static int leInt(String msg, Scanner input){
		System.out.println(msg);
		int op = input.nextInt();
		input.nextLine();
		return op;
	}


}
