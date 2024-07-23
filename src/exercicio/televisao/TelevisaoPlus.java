package exercicio.televisao;

import java.util.Objects;

/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg Usado como prova de
 * conceito, podendo ser melhorado. Assuntos: criação de classes
 * 
 * @author Raquel Lopes (emprestado :))
 *
 */
public class TelevisaoPlus {
	public static final int VOLUME_MINIMO = 0;
	public static final int CANAL_ZERO = 0;
	public static final int VOLUME_ZERO = 0;
	private int canalAtual;
	private final int totalDeCanais;
	private final int volumeMaximo;
	private int volumeAtual;
	private boolean mute;

	public TelevisaoPlus(int tc, int vm) {
		totalDeCanais = tc;
		volumeMaximo = vm;
		mute = false;
		canalAtual = CANAL_ZERO;
		volumeAtual = volumeMaximo;
	}

	public int aumentaVolume() {
		if (volumeAtual < volumeMaximo)
			return ++volumeAtual;
		return volumeAtual;
	}

	public int diminuiVolume() {
		if (volumeAtual > VOLUME_MINIMO)
			return --volumeAtual;
		return volumeAtual;
	}

	public boolean mute() {
		mute = !mute;
		return mute;
	}

	private boolean verificaSeCanalEhValido(int canal) {
		return canal >= CANAL_ZERO || canal <= totalDeCanais;
	}

	public int proximoCanal() {
		if (canalAtual == totalDeCanais)
			canalAtual = CANAL_ZERO;
		else
			canalAtual++;
		return canalAtual;
	}

	public int mudaCanal(int canal) {
		if (verificaSeCanalEhValido(canal))
			canalAtual = canal;
		return canalAtual;
	}

	public int getCanalAtual() {
		return canalAtual;
	}

	public int getTotalDeCanais() {
		return totalDeCanais;
	}

	public int getVolumeMaximo() {
		return volumeMaximo;
	}

	public int getVolumeAtual() {
		if (mute)
			return VOLUME_ZERO;
		return volumeAtual;
	}

	
	/*
	 * @Override public boolean equals(Object outra) { if(!(outra instanceof
	 * TelevisaoPlus)){ return false; } TelevisaoPlus objPlus =
	 * (TelevisaoPlus)outra;
	 * 
	 * if(this.getTotalDeCanais() == objPlus.getTotalDeCanais()) { return true;
	 * }else { return false; }
	 * 
	 * return this.getTotalDeCanais() == objPlus.getTotalDeCanais(); }
	 */

	@Override
	public int hashCode() {
		return Objects.hash(totalDeCanais);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TelevisaoPlus other = (TelevisaoPlus) obj;
		return totalDeCanais == other.totalDeCanais;
	}

	@Override
	public String toString() {
		return "Televisao [canalAtual=" + canalAtual + ", totalDeCanais=" + totalDeCanais + ", volumeMaximo="
				+ volumeMaximo + ", volumeAtual=" + volumeAtual + "]";
	}

	public static void main(String[] args) {
		TelevisaoPlus tvPlus = new TelevisaoPlus(5, 5);
		Object obj = tvPlus;
		TelevisaoPlus tv3 = (TelevisaoPlus) obj;
		TelevisaoPlus tvPlus2 = new TelevisaoPlus(5, 5);
		System.out.println(tvPlus);
		System.out.println(tvPlus.toString());
		System.out.println(tvPlus.equals(tvPlus2));
		System.out.println(tvPlus.equals(tvPlus));
		String s = new String("liia");
		System.out.println(tvPlus.equals(s));

	}
}
