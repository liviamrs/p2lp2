package exercicio.copapedois;

public class Zaga implements FuncaoJogador {

    private float potenciaCarrinho;

    public Zaga(float potenciaCarrinho) {
    	this.potenciaCarrinho = potenciaCarrinho;
    }

    @Override
    public double valorTotal(int poderChute) {
    	return poderChute + (2.5 * potenciaCarrinho);
    }

    @Override
    public double valorCompra(int poderChute) {
    	return 0.5* valorTotal(poderChute);
    }

}