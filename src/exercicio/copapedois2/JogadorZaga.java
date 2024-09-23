package exercicio.copapedois2;

public class JogadorZaga extends Jogador {

    private float potenciaCarrinho;

    public JogadorZaga(String nome, int numero, int poderChute, float potenciaCarrinho) {
    	super(nome, numero, poderChute);
    	this.potenciaCarrinho = potenciaCarrinho;
    }

    @Override
    public String toString() {
    	return super.toString() + " Zaga";
    }

    @Override
    public double valorTotal() {
    	return super.getPoderChute() + 2.5 * potenciaCarrinho;
    }

    @Override
    public double valorCompra() {
    	return 0.5 * valorTotal();
    }

}