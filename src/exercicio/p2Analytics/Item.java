package exercicio.p2Analytics;

public class Item {
	private String nomeClasse;
	private String nomeClassePacote;
	private int contador;
	
	public Item(String nomeClasse, String nomeClassePacote) {
		this.nomeClasse = nomeClasse;
		this.nomeClassePacote = nomeClassePacote;
	}
	
	public void atualizaContator() {
		contador++;
	}
	
	public int getContador() {
		return contador;
	}
	
	public String getNomeClasse() {
		return nomeClasse;
	}

	public String getNomeClassePacote() {
		return nomeClassePacote;
	}

	@Override
	public String toString() {
		return getNomeClassePacote() + " - " + getContador();
	}

}
