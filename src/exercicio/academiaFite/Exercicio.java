package exercicio.academiaFite;

public class Exercicio {
	private String nome;
	private int gastoCalorico;
	private int popularidade;
	
	public Exercicio(String nome, int gastoCalorico) {
		this.nome = nome;
		this.gastoCalorico = gastoCalorico;
	}
	
	public int gastoCalorico(int horas) {
		return gastoCalorico * horas;
	}
	
	public void incrementaPopularidade() {
		popularidade++;
	}
	
	public int getPopularidade() {
		return popularidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return nome + " - " + gastoCalorico;
	}

}
