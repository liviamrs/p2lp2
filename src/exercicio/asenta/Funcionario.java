package exercicio.asenta;

import java.util.Objects;

public class Funcionario {
	private String nomeString;
	private String siapeString;
	
	public Funcionario(String nomeString, String siapeString) {
		this.nomeString = nomeString;
		this.siapeString = siapeString;
	}

	public String getNomeString() {
		return nomeString;
	}

	public String getSiapeString() {
		return siapeString;
	}
	@Override
	public String toString() {
		return getNomeString() + " - " + getSiapeString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(siapeString);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(siapeString, other.siapeString);
	}
	
	

}
