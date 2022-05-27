package exercicio.diarioBordo2;

public class Main {
	public static void main(String[] args) {
		
		Anotacao a1 = new Anotacao("Começando a estudar classes e objetos", "23/05/2022", "Livia M");
		System.out.println(a1);
		
		System.out.println(a1.exibeAnotacao());
		a1.adicionaTexto("Tambem vimos o uso de referencia null");
		System.out.println(a1.exibeAnotacao());
		System.out.println(a1.getEstudante());
		System.out.println(a1.getTexto());
		System.out.println(a1.getData());
		System.out.println(a1.getNivelCompreensao());
		a1.setNivelCompreensao(7);
		System.out.println(a1.getNivelCompreensao());
		Anotacao a2 = new Anotacao("Minhas impressoes sobre OO", "23/05/2022", "Guilherme");
		System.out.println(a2.exibeAnotacao());

		//mudar a1
		a1.setTexto("Destacando as diferencas entre classe e objeto");
		System.out.println(a1.exibeAnotacao());
		System.out.println(a2.exibeAnotacao());
		
		//nao faca isso :)
		Anotacao a3 = null;
		
		System.out.println(a3.exibeAnotacao());

	}
}
