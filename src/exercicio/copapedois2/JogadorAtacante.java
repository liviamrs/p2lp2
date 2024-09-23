package exercicio.copapedois2;

public class JogadorAtacante extends Jogador {

    private int poderDrible;

    public JogadorAtacante(String nome, int numero, int poderChute, int poderDrible) {
    	super(nome, numero, poderChute);
    	this.poderDrible = poderDrible;
    }

    @Override
    public String toString() {
    	return super.toString() + " Atacante";
    }

    @Override
    public double valorTotal() {
    	return 10 * super.getPoderChute() + 2 * poderDrible;
    }

    @Override
    public double valorCompra() {
    	return 4 * valorTotal();
    }

}