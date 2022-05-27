package exercios.televisao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicios.televisao.TelevisaoPlus;

class TelevisaoPlusTest2 {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testTelevisaoPlus() {
		try {
			new TelevisaoPlus(-1, 10);
		}catch(IllegalArgumentException e) {
			assertEquals("Volume ou totais de canais nao podem ser negativos!", e.getMessage());
		}
	}

	
	@Test
	void testTelevisaoPlus2() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> new TelevisaoPlus(-1, 10));
		assertEquals("Volume ou totais de canais nao podem ser negativos!", exception.getMessage());
	}
	@Test
	void testAumentaVolume() {
		fail("Not yet implemented");
	}

	@Test
	void testDiminuiVolume() {
		fail("Not yet implemented");
	}

	@Test
	void testMute() {
		fail("Not yet implemented");
	}

	@Test
	void testProximoCanal() {
		fail("Not yet implemented");
	}

	@Test
	void testMudaCanal() {
		fail("Not yet implemented");
	}

}
