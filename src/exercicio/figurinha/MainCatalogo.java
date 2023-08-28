package exercicio.figurinha;

public class MainCatalogo {
	public static void main(String[] args) {
		Catalogo c = new Catalogo();
		c.adicionarFigura("Igor Rayan", "treze fc");
		c.adicionarFigura("Fernando Pileggi", "treze fc");
		c.adicionarFigura("Saulo", "treze fc");
		c.adicionarFigura("Geninho", "treze fc");
		c.adicionarFigura("Vitao", "treze fc");
		
		System.out.println(c.exibirCatalogo());
		System.out.println(c.exibirFigura(0));
		
		c.adicionarFigura("Vitao", "treze fc");
		System.out.println(c.exibirCatalogo());
		System.out.println(c.exibirFigura(0));
		c.adicionarFigura("Vitao", "treze fc");
		System.out.println(c.exibirFigura(0));
		
		Figurinha f1 = new Figurinha("Vitao", "treze fc");
		Figurinha f2 = new Figurinha("Vitao", "treze fc");
		if(f1.equals(f2)) {
			System.out.println("Sao iguais");
		}else {
			System.out.println("Sao diferentes");
		}	
	}
}
