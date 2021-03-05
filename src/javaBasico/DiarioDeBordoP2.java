package javaBasico;

import java.util.Scanner;
/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: estruturas básicas de java
 * @author Lívia
 *
 */
public class DiarioDeBordoP2 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		if(args.length > 1){
			System.out.println("Uso incorreto do sistema!");
			System.exit(1);
		}
		final int AULAS = Integer.parseInt(args[0]);
		String[] datas = new String[AULAS];
		String[] textos = new String[AULAS];

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
			op = leInt(MENU);
			switch(op){
			case ANOTAR:
				qtdEntradas = anotar(textos, datas, qtdEntradas);
				break;
			case PESQUISAR:
				int i = leInt("Qual anotacao quer ver: ");
				System.out.println(datas[i] + "-" + " " + textos[i]);
				break;
			case LISTAR:
				for (int j = 0; j < qtdEntradas; j++) {
					System.out.println(datas[j] + "-" + " " + textos[j]);
				}
				break;
			case SAIR:
				break;
			default:
				System.out.println("Opcao invalida!");
			}
		}while(qtdEntradas != textos.length && op != SAIR);
	}//main
	
	private static int anotar(String[] textos, String[] datas, int qtdEntradas) {
		System.out.println("Data: ");
		datas[qtdEntradas] = sc.nextLine();
		System.out.println("Texto: ");
		textos[qtdEntradas++] = sc.nextLine();
		return qtdEntradas;
	}

	private static int leInt(String msg){
		System.out.println(msg);
		int op = sc.nextInt();
		sc.nextLine();
		return op;
	}
}
