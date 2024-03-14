package exercicio.copapedois;

public class MeiDeCampo implements FuncaoJogador {

    private String subfuncao;

    public MeiDeCampo(String subfuncao) {
    	this.subfuncao = subfuncao;;
    }

    @Override
    public double valorTotal(int poderChute) {
    	return 5 * poderChute;
    }

    @Override
    public double valorCompra(int poderChute) {
    	return 2* valorTotal(poderChute);
    }

}