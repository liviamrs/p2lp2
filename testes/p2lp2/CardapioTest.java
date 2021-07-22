package p2lp2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicios.cardapio.Cardapio;

class CardapioTest {

	private Cardapio cardapio;
	@BeforeEach
	void setUp() throws Exception {
		cardapio = new Cardapio("Zequinha Rest");
		cardapio.adicionaItem("arroz branco", 100);
		cardapio.adicionaItem("arroz grega", 200);
		cardapio.adicionaItem("macarrao", 200);
		cardapio.adicionaItem("feijoada", 150);
		cardapio.adicionaItem("frango assado", 90);
	}

	@Test
	void testCardapioStringInt() {
		cardapio = new Cardapio("Zequinha Rest", 3);
		String esperado = "Zequinha Rest\n"+"[null, null, null]";
		assertEquals(esperado, cardapio.toString());
	}

	@Test
	void testCardapioString() {
		cardapio = new Cardapio("Zequinha Rest");
		String esperado = "Zequinha Rest\n"+"[null, null, null, null, null]";
		assertEquals(esperado, cardapio.toString());
	}

	@Test
	void testGetNome() {//poderia ser suprimido
		assertEquals("Zequinha Rest", cardapio.getNome());
		//vejam que aqui eu estou usando o cardapio iniciado
		// no @BeforeEach
	}

	@Test
	void testAdicionaItemTrue() {
		cardapio = new Cardapio("Zequinha Rest");
		assertTrue(cardapio.adicionaItem("arroz branco", 100));
		assertTrue(cardapio.adicionaItem("arroz grega", 200));
		assertTrue(cardapio.adicionaItem("macarrao", 200));
		assertTrue(cardapio.adicionaItem("feijoada", 150));
		assertTrue(cardapio.adicionaItem("frango assado", 90));
	}

	@Test
	void testAdicionaItemFalseDuplicado() {
		cardapio = new Cardapio("Zequinha Rest");
		assertTrue(cardapio.adicionaItem("arroz branco", 100));
		assertFalse(cardapio.adicionaItem("arroz branco", 100));
	}
	
	@Test
	void testAdicionaItemFalseTamanhoExcedido() {
		cardapio = new Cardapio("Zequinha Rest");
		assertTrue(cardapio.adicionaItem("arroz branco", 100));
		assertTrue(cardapio.adicionaItem("arroz grega", 200));
		assertTrue(cardapio.adicionaItem("macarrao", 200));
		assertTrue(cardapio.adicionaItem("feijoada", 150));
		assertTrue(cardapio.adicionaItem("frango assado", 90));
		assertFalse(cardapio.adicionaItem("vinagrete", 0));

	}
	@Test
	void testListaCardapio() {
		//fail("Not yet implemented");
	}

	@Test
	void testCalcularCaloriasRefeicao() {
		String[] refeicao = {"arroz branco", "feijoada"};
		assertEquals(250, cardapio.calcularCaloriasRefeicao(refeicao, "padrao"));
		assertEquals(500, cardapio.calcularCaloriasRefeicao(refeicao, "grande"));
		assertEquals(750, cardapio.calcularCaloriasRefeicao(refeicao, "mega"));

	}

	@Test
	void testCalcularCaloriasRefeicaoTamanhoInvalido() {
		String[] refeicao = {"arroz branco", "feijoada"};
		try {
			cardapio.calcularCaloriasRefeicao(refeicao, "gg");
			fail("Nao deveria aceitar tamanho de refeicao invalido!");
		}catch(IllegalArgumentException e) {
			assertEquals("Tamanho de refeicao invalido!", e.getMessage());
		}
	}
	
	@Test
	void testCalcularCaloriasRefeicaoItemInvalido() {
		String[] refeicao = {"arroz branco", "rabada"};
		try {
			cardapio.calcularCaloriasRefeicao(refeicao, "padrao");
			fail("Nao deveria aceitar nome de item de refeicao invalido!");
		}catch(IllegalArgumentException e) {
			assertEquals("Item de cardapio invalido!", e.getMessage());
		}
	}
	
	@Test
	void testToString() {
		//fail("Not yet implemented");
	}

}
