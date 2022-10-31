package exercicio.figurinha;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * 1. criar uma figurinha com peso especifico;
 * verificar se o peso foi o especificado (diferente de 2)
 * 2. criar uma figurinha sem o peso especificado;
 * verificar ser o peso foi 2
 * 3. criar uma figurinha sem o peso especificado e verificar se
 * a qtd é 1
 * 4. criar uma figurinha sem o peso especificado e incrementar
 * quantidade; verificar que a qtd é 2
 * 5. criar uma figurinha sem o peso especificado e decrementar
 * e verificar que a qtd continua 1
 * 6. criar uma figurinha sem o peso especificado e incrementar 
 * e decrementar e verificar que a qtd é 1
 * 
 */
class FigurinhaTeste {

	@Test
	void test() {
		//teste1
		Figurinha f1 = new Figurinha("alisson", "brasil", 3);
		assertEquals(3, f1.getPeso());
		Figurinha f2 = new Figurinha("alisson", "brasil");
		assertEquals(2, f2.getPeso());
		assertEquals(1,f2.getQuantidade());
	}

}
