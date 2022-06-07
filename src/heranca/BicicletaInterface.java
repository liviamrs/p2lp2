package heranca;

public interface BicicletaInterface {

	public double getVelocidadeMaxima();
	public double getVelocidadeAtual();
	public String getModelo();
	public String getAssento();
	public void acelera();
	public void desacelera();
	public void para();
	public void setAssento(Assento novoAssento);
	public boolean temConforto(double larguraQuadril);
}
