package exercicio.samu;

public class Main {
	public static void main(String[] args) {
		Sistema meuSistema = new Sistema();
		meuSistema.criarAjuda("referencia para arrays em java", "livia");
		System.out.println(meuSistema.exibirAjuda(0));
		meuSistema.apoiarAjuda(0);
		meuSistema.apoiarAjuda(0);
		meuSistema.apoiarAjuda(0);
		System.out.println(meuSistema.exibirAjuda(0));
	}

}
