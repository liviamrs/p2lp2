package exercicio.slaque;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String comando = "";
		Slaque slaque = new Slaque();
		while (!"S".equals(comando)) {
			String linha = sc.nextLine();
			String[] campos = linha.split(" ");
			comando = campos[0];
			if ("USUARIO".equals(comando)) {
				String nome = campos[1];
				String email = campos[2];
				slaque.cadastrarUsuario(nome, email);
			} else if ("CANAL".equals(comando)) {
				String canal = campos[1];
				slaque.cadastrarCanal(canal);
			} else if ("ENTRAR".equals(comando)) {
				String canal = campos[1];
				String usuario = campos[2];
				slaque.entrar(usuario, canal);
			} else if ("MENSAGEM".equals(comando)) {
				String canal = campos[1];
				String usuario = campos[2];
				String msg = campos[3];
				slaque.mandarMensagem(usuario, canal, msg);
			} else if ("IMPRIMIR".equals(comando)) {
				String canal = campos[1];
				System.out.println(slaque.exibirCanal(canal));
			} else if ("SAIR".equals(comando)) {
				String canal = campos[1];
				String usuario = campos[2];
				slaque.sair(usuario, canal);
			}
		}
		
	}
	
}
