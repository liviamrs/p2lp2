package exercicio.slaque;

public class Mensagem {

	private Usuario usuario;
	private String msg;

	public Mensagem(Usuario usuario, String msg) {
		this.usuario = usuario;
		this.msg = msg;
	}
	@Override
	public String toString() {
		return msg + " " + usuario.getNome();
	}

}
