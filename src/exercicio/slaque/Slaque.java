package exercicio.slaque;

import java.util.HashMap;

public class Slaque {

	private HashMap<String, Usuario> usuarios;
	private HashMap<String, Canal> canais;

	public Slaque() {
		this.usuarios = new HashMap<>();
		this.canais = new HashMap<>();
	}
	
	public void cadastrarUsuario(String nome, String email) {
		this.usuarios.put(email, new Usuario(nome, email));
	}

	public void cadastrarCanal(String canal) {
		this.canais.put(canal, new Canal(canal));
	}

	public void entrar(String emailUsuario, String nomeCanal) {
		Usuario usuario = this.usuarios.get(emailUsuario);
		Canal canal = this.canais.get(nomeCanal);
		canal.entrar(usuario);
	}

	public void mandarMensagem(String nomeUsuario, String nomeCanal, String msg) {
		Usuario usuario = this.usuarios.get(nomeUsuario);
		Canal canal = this.canais.get(nomeCanal);
		canal.mandarMensagem(usuario, msg);
	}

	public String exibirCanal(String nomeCanal) {
		Canal canal = this.canais.get(nomeCanal);
		return canal.toString();
	}

	public void sair(String nomeUsuario, String nomeCanal) {
		Usuario usuario = this.usuarios.get(nomeUsuario);
		Canal canal = this.canais.get(nomeCanal);
		canal.sair(usuario);
	}
	
	public String exibirUsuariosCanal(String nomeCanal) {
		Canal canal = this.canais.get(nomeCanal);
		return canal.exibirUsuarios();
	}

}
