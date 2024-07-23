package exercicio.cardapio;
public class Main {
	public static void main(String[] args) {
		Cardapio c = new Cardapio("Zequinha Rest");
		System.out.println(c);//c.toString()
		c.adicionaItem("arroz branco", 100);
		c.adicionaItem("arroz branco", 200);
		c.adicionaItem("macarrao", 200);
		c.adicionaItem("feijoada", 150);
		c.adicionaItem("frango assado", 90);
		System.out.println(c.listaCardapio());
		System.out.println(c);//c.toString()
		String[] refeicao = {"arroz branco", "feijoada"};
		System.out.println(c.calcularCaloriasRefeicao(refeicao, "padrao"));
		
		
	}

}
