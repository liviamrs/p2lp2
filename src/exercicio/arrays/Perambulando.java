package exercicio.arrays;

/**
 * Prova de conceitos :)
 * @author liviamrscampos
 *
 */
public class Perambulando {
	public static void main(String[] args) {
		final int DIREITA = 1;
		final int ESQUERDA = 2;
		final int CIMA = 3;
		final int BAIXO = 4;
		String[][] sala = {{"x", "x", "x"}, 
				{"x", "x", "x"}, 
				{"x", "x", "x"}};
		int lin = 0;
		int col = 0;
		String pessoa = ":)";
		sala[lin][col] = pessoa;
		System.out.println("Sala");
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala.length; j++) {
				System.out.print(sala[i][j]);
			}
			System.out.println();
		}
		int movimento = DIREITA;// ler do teclado!
		int linAntiga = lin;
		int colAntiga = col;
		switch(movimento) {
		case DIREITA:
			col += 1;
			break;
		case ESQUERDA:
			col -= 1;
			break;
		case CIMA:
			lin -= 1;
			break;
		case BAIXO:
			lin += 1;
			break;
		default:
			System.out.println("Posicao incorreta!");
		}
		// checa validade da nova posição
		if(lin < 0 || lin > sala.length || col < 0 || col > sala[0].length) {
			System.out.println("Impossivel mover!");
			System.exit(1);
		}
		sala[linAntiga][colAntiga] = "x";
		sala[lin][col] = pessoa;
		linAntiga = lin;
		colAntiga = col;
		System.out.println("Sala");
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala.length; j++) {
				System.out.print(sala[i][j]);
			}
			System.out.println();
		}
		// que tal um laço para introduzir vários movimentos?
	}

}
