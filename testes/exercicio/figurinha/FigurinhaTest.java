package exercicio.figurinha;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe de testes para a classe Figurinha.
 * Observe a modularizacao dos testes. Queremos um metodo de teste
 * para cada metodo da classe. Alem disso, separar os testes de excecao.
 * @author Livia
 *
 */
class FigurinhaTest {

	private Figurinha f1, f2;
	@BeforeEach
	void setUp() {
		f1 = new Figurinha("alisson", "brasil", 4);
		f2 = new Figurinha("alisson", "brasil");
	}

	@Test
	void testFigurinhaStringStringInt() {
		assertEquals(4, f1.getPeso());
	}

	@Test
	void testFigurinhaStringString() {
		assertEquals(4, f1.getPeso());
	}

	@Test
	void testFigurinhaStringStringInt_Exception() {
		try {
			new Figurinha("alisson", "brasil", 0);
			fail("Deveria ter lancado excecao de peso invalido.");
		}catch(IllegalArgumentException e) {
			assertEquals("Peso deve ser maior ou igual a 2", e.getMessage());
		}
	}
	@Test
	void testIncrementaQtd() {
		assertEquals(1, f1.getQuantidade());
		assertEquals(1, f2.getQuantidade());
		f1.incrementaQtd();
		assertEquals(2, f1.getQuantidade());
		
	}

	@Test
	void testDecrementaQtd() {
		f1.incrementaQtd();
		f1.incrementaQtd();
		f1.incrementaQtd();
		assertEquals(4, f1.getQuantidade());
		f1.decrementaQtd();
		assertEquals(3, f1.getQuantidade());
		f1.decrementaQtd();
		f1.decrementaQtd();
		assertEquals(1, f1.getQuantidade());
		f1.decrementaQtd();
		assertEquals(1, f1.getQuantidade());
	}

	@Test
	void testSetPeso() {
		assertEquals(2, f2.getPeso());
		f2.setPeso(4);
		assertEquals(4, f2.getPeso());
	}
	
	@Test
	void testSetPeso_Exception() {
		try {
			f2.setPeso(1);
			fail("Deveria ter lancado excecao de peso invalido.");
		}catch(IllegalArgumentException e) {
			assertEquals("Peso deve ser maior ou igual a 2", e.getMessage());
		}
	}

	@Test
	void testExibirDetalhes() {
		String esperado = "alisson - brasil * 4 # 1";
		assertEquals(esperado, f1.exibirDetalhes());
		esperado = "alisson - brasil * 2 # 1";
		assertEquals(esperado, f2.exibirDetalhes());
		f2.incrementaQtd();
		esperado = "alisson - brasil * 2 # 2";
		assertEquals(esperado, f2.exibirDetalhes());
	}

	@Test
	void testToString() {
		String esperado = "alisson - brasil * 4";
		assertEquals(esperado, f1.toString());
		esperado = "alisson - brasil * 2";
		assertEquals(esperado, f2.toString());
	}

}
