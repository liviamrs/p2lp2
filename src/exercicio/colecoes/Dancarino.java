package exercicio.colecoes;

import java.util.Objects;

public class Dancarino {
	private String nome;
	private String emoji;
	
	public Dancarino(String nome, String emoji) {
		this.emoji = emoji;
		this.nome = nome;
	}

	public String getEmoji() {
		return emoji;
	}

	public void setEmoji(String emoji) {
		this.emoji = emoji;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " Emoji: " + getEmoji();		
	}

	@Override
	public int hashCode() {
		return Objects.hash(emoji, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dancarino other = (Dancarino) obj;
		return Objects.equals(emoji, other.emoji) && Objects.equals(nome, other.nome);
	}
	
	
	

}
