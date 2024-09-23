package exercicio.copapedois2;

public interface JogadorInterface {
	public double valorTotal();
	public double valorCompra();
	public int disputa(JogadorInterface j);
	public int getNumero();
	public void setPoderChute(int novo);
	public int getPoderChute();
}
