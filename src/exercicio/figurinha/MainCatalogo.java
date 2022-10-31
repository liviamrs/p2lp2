package exercicio.figurinha;

public class MainCatalogo {
	public static void main(String[] args) {
		Catalogo c = new Catalogo();
		c.adicionarFigura("alisson", "brasil");
		c.adicionarFigura("alex sandro", "brasil");
		c.adicionarFigura("fred", "brasil");
		c.adicionarFigura("danilo", "brasil");
		c.adicionarFigura("casemiro", "brasil");
		
		System.out.println(c.exibirCatalogo());
		System.out.println(c.exibirFigura(0));
		
		c.adicionarFigura("alisson", "brasil");
		System.out.println(c.exibirCatalogo());
		System.out.println(c.exibirFigura(0));
		c.adicionarFigura("alisson", "brasil");
		System.out.println(c.exibirFigura(0));
		
		Figurinha f1 = new Figurinha("alisson", "brasil");
		Figurinha f2 = new Figurinha("alisson", "brasil");
		String s = new String("livia");
		if(f1.equals(f2)) {
			System.out.println("Sao iguais");
		}else {
			System.out.println("Sao diferentes");
		}
		
	
		
	}

}
