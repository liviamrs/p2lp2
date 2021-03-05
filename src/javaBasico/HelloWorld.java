package javaBasico;

public class HelloWorld {
	public static void main(String[] args) {
		String s = "So para um: alimetacao saudavel para quem mora "
				+ "sozinho, Rita Lobo - Senac Sao Paulo";
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s.replace("a", "@"));
		System.out.println(s.substring(0,31));
		int tam = s.length();
		System.out.println(tam + " caracteres");
		System.out.println(s.startsWith("b"));
		
	}

}
