package exercicio.slaque;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Canal {

	private String nome;
	private HashSet<Usuario> usuarios;
	private ArrayList<Mensagem> mensagens;

	public Canal(String nome) {
		this.nome = nome;
		this.usuarios = new HashSet<>();
		this.mensagens = new ArrayList<>();
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Canal other = (Canal) obj;
		return Objects.equals(nome, other.nome);
	}


	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Canal other = (Canal) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
*/
	public void entrar(Usuario usuario) {
		this.usuarios.add(usuario);
	}

	public void mandarMensagem(Usuario usuario, String msg) {
		if (this.usuarios.contains(usuario)) {
			this.mensagens.add(new Mensagem(usuario, msg));
		}
	}

	@Override
	public String toString() {
		String repr = this.nome + System.lineSeparator();
		for (Usuario u : this.usuarios) {
			repr += u.toString() + System.lineSeparator();
		}
		for (Mensagem m : this.mensagens) {
			repr += m.toString() + System.lineSeparator();
		}
		return repr;
	}

	public void sair(Usuario usuario) {
		this.usuarios.remove(usuario);
	}
	
	public String exibirUsuarios() {
		return usuarios.toString();
	}
	
	public String exibirHistorico() {
		return mensagens.toString();
	}

}
