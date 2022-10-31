package exercicios.bicicleta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BicicletaComExcecaoTest {

	private BicicletaComExcecao b1;
	@BeforeEach
	void setUp() throws Exception {
		b1 = new BicicletaComExcecao(20, "monark", 120, "gel","atrio");
	}

	@Test
	void testBicicletaComExcecaoVelocidadeMaxima() {
		try {
			new BicicletaComExcecao(0, "monark", 120, "gel","atrio");
			fail("Nao verificou velocidade maxima!");
		}catch(IllegalArgumentException e) {
			assertEquals("Velocidade maxima deve ser maior do que zero.",e.getMessage());
		}
		try {
			new BicicletaComExcecao(-1, "monark", 120, "gel","atrio");
			fail("Nao verificou velocidade maxima!");
		}catch(IllegalArgumentException e) {
			assertEquals("Velocidade maxima deve ser maior do que zero.",e.getMessage());
		}
	}
}
