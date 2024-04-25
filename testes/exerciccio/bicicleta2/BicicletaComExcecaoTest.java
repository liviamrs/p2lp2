package exerciccio.bicicleta2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import exercicio.bicicleta2.BicicletaComExcecao;

public class BicicletaComExcecaoTest {
	@Test
	public void teste1() {
        String messageError = "Velocidade maxima fora da faixa 0..200km/h";
        String message = assertThrows(IllegalArgumentException.class, () -> {
            new BicicletaComExcecao(240, "caloi");
        }).getMessage();
        assertEquals(messageError, message);
	}
	
	@Test
	public void teste2() {
        try {
        	new BicicletaComExcecao(40, null);
        	fail("Deveria ter falhado com modelo de bicicleta null");
        }catch(NullPointerException e) {
        	String messageError = "Modelo null";
        	assertEquals(messageError, e.getMessage());
        }
        try {
        	new BicicletaComExcecao(240, "caloi");
        	fail("Deveria ter falhado com velocidade maxima fora da faixa");
        }catch(IllegalArgumentException e) {
        	String messageError = "Velocidade maxima fora da faixa 0.." + BicicletaComExcecao.LIMITE+"km/h";
        	assertEquals(messageError, e.getMessage());
        }
	}

}
