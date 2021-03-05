package exercicios.pratoCheio;

public class PratoPersonalizado implements PratoInterface{

	private Personalizacao personalizacao;
	private double precoBase;
	private String autor;
	
	public PratoPersonalizado(double precoBase, Personalizacao personalizacao) {
		this(precoBase, personalizacao, "");
	}

	public PratoPersonalizado(double precoBase, Personalizacao personalizacao, String autor) {
		if(precoBase < 0){
			throw new IllegalArgumentException("Preco base nao pode ser negativo.");			
		}
		this.personalizacao = personalizacao;
		this.precoBase = precoBase;
		this.autor = autor;
	}
	public Personalizacao getPersonalizacao() {
		return personalizacao;
	}

	public String getAutor(){
		return autor;
	}
	public void setPersonalizacao(Personalizacao personalizacao) {
		this.personalizacao = personalizacao;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	@Override
	public String toString() {
	
		return "Prato com "+imprimePersonalizacao(personalizacao)+" que custa R$ "+getPrecoBase()+".";
	}
	
	private String imprimePersonalizacao(Personalizacao personalizacao) {
		switch (personalizacao) {
		case ESTAMPA:
			return "Estampa";
			
		case PINTURA:
			return "Pintura";
			
		case FOTO:
			return "Foto";			

		default:
			break;
		}
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((personalizacao == null) ? 0 : personalizacao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof PratoPersonalizado))
			return false;
		PratoPersonalizado other = (PratoPersonalizado) obj;
		if (personalizacao != other.personalizacao)
			return false;
		return true;
	}

	public double calculaPreco() {
		return precoBase;
	}
}
