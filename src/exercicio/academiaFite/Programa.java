package exercicio.academiaFite;

import java.util.Arrays;

public class Programa {
	private String objetivo;
	private Exercicio[] exercicios;
	private int prox;
	
	public Programa(String objetivo) {
		this.objetivo = objetivo;
		exercicios = new Exercicio[5];
	}
	@Override
	public String toString() {
		return objetivo;
	}
	
	public String listarExercicios() {
		return Arrays.toString(exercicios);
	}
	
	public void adicionaExercicio(Exercicio e) {
		exercicios[prox++] = e;
		e.incrementaPopularidade();
	}

}
