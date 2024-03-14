package exercicio.copapedois;

public class Atacante implements FuncaoJogador {

    private int poderDrible;

    public Atacante(int poderDrible) {
    	this.poderDrible = poderDrible;
    }

    @Override
    public double valorTotal(int poderChute) {
    	return 10 * poderChute + 2 * poderDrible;
    }

    @Override
    public double valorCompra(int poderChute) {
    	return 4* valorTotal(poderChute);
    }

}