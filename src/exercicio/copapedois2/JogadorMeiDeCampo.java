package exercicio.copapedois2;

public class JogadorMeiDeCampo extends Jogador {

    private String subfuncao;

    public JogadorMeiDeCampo(String nome, int numero, int poderChute, String subfuncao) {
    	super(nome, numero, poderChute);
    	this.subfuncao = subfuncao;
    }
    
    @Override
    public String toString() {
    	return super.toString() + " Mei de Campo";
    }

    public double valorTotal() {
    	return 5 * super.getPoderChute();
    }

    public double valorCompra() {
    	return 2 * valorTotal();
    }

}