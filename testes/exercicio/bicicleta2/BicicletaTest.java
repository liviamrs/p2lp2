package exercicio.bicicleta2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BicicletaTest {

	private Bicicleta b1;
	@BeforeEach
	void setUp() throws Exception {
		b1 = new Bicicleta(10, "caloi");
	}

	@Test
	void testBicicleta() {
		fail("Not yet implemented");
	}

	@Test
	void testAcelera() {
		fail("Not yet implemented");
	}

	@Test
	void testDesacelera() {
		fail("Not yet implemented");
	}

	@Test
	void testPara() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testExibirDetalhes() {
		fail("Not yet implemented");
	}

	@Test
	void testEqualsBicicleta() {
		Bicicleta b2 = new Bicicleta(10, "ceci");
		Bicicleta b3 = new Bicicleta(15, "ceci");
		assertEquals(b1, b1);
		assertEquals(b1, b2);
		assertNotEquals(b1, b3);
	}

}
