package exercicio.asenta;

public class Expositiva extends Apresentacao{
	private int qtdCadeiras;
	private boolean hasProjetor;
	
	public Expositiva(String codigoString, String dataString, String horaString, String localString, String responsavelString, int qtdCadeiras, boolean hasProjetor){
		super(codigoString, dataString, horaString, localString, responsavelString);
		this.qtdCadeiras = qtdCadeiras;
		this.hasProjetor = hasProjetor;
		funcionarios = hasProjetor?1:0;
	}
	
	
	public int getQtdCadeiras() {
		return qtdCadeiras;
	}


	public String isHasProjetor() {
		return hasProjetor?"Sim":"Nao";
	}


	@Override
	public String toString() {
		return super.toString() +" - "+
				getQtdCadeiras()+" - "+
				isHasProjetor();
	}


	@Override
	public double tempo() {
		return Math.pow(qtdCadeiras, 2);
	}
}
