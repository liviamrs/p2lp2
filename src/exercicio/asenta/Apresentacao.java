package exercicio.asenta;

public abstract class Apresentacao {
	private String codigoString;
	private String dataString;
	private String horaString;
	private String localString;
	private String responsavelString;
	protected int funcionarios;
	private Funcionario funcionario;
	
	public Apresentacao(String codigoString, String dataString, String horaString, String localString, String responsavelString) {
		this.codigoString = codigoString;
		this.dataString = dataString;
		this.horaString = horaString;
		this.responsavelString = responsavelString;
	}
	
	public String getDataString() {
		return dataString;
	}

	public String getHoraString() {
		return horaString;
	}

	public String getLocalString() {
		return localString;
	}

	public String getResponsavelString() {
		return responsavelString;
	}

	public abstract double tempo();
	
	public void alocaFuncionario(Funcionario f) {
	}
	
	public String alocado() {
		if(funcionario != null) {
			return "Sim - " + funcionario.toString();
		}
		return "Nao";
	}
	
	@Override
	public String toString() {
		return getDataString() +" - "+
				getHoraString() +" - "+
				getLocalString() +" - "+
				getResponsavelString();
	}

}
