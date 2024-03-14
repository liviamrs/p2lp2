package exercicio.academiaFite;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Exercicio[] exercicios = new Exercicio[10];
		Programa[] programas = new Programa[10];
		
		//adiciona exercicios no sistema
		exercicios[0] = new Exercicio("corrida", 100);
		exercicios[1] = new Exercicio("abdominal", 150);
		exercicios[2] = new Exercicio("agachamento", 100);
		
		System.out.println(Arrays.toString(exercicios));
		
		// buscar gasto calorico de um exercicio
		System.out.println(exercicios[0].gastoCalorico(2));
		
		//mudar a popularidade do exercicio
		exercicios[0].incrementaPopularidade();
		exercicios[0].incrementaPopularidade();
		exercicios[0].incrementaPopularidade();
		System.out.println(exercicios[0].getPopularidade());
		
		// criar programas
		programas[0] = new Programa("aliviar a dor na lombar");
		programas[1] = new Programa("emagrecer");
		System.out.println(Arrays.toString(programas));
		Programa p1 = programas[0];
		p1.adicionaExercicio(exercicios[0]);
		p1.adicionaExercicio(exercicios[2]);
		System.out.println(p1.listarExercicios());
		programas[1].adicionaExercicio(exercicios[0]);
		System.out.println(programas[1].listarExercicios());
		
		System.out.println(exercicios[0].getPopularidade());
	}

}
