package exercicio.copapedois2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    	TimeController tc = new TimeController();
    	tc.cadastraAtacante("Neymar", 10, 99, 10);
    	tc.cadastraMeiDeCampo("Paqueta", 7, 80, "ala");
    	tc.cadastraZaga("Thiago Silva", 2, 12, 10);
    	
    	System.out.println(tc.listarTime());
    	
    	System.out.println(tc.listarPoderChute(10));
    	tc.mudaPoderChute(10, 85);
    	System.out.println(tc.listarPoderChute(10));
    	
    	System.out.println(tc.valorCompraJogador(10));
    	System.out.println(tc.valorTotalJogador(10));
    	System.out.println(tc.disputa(10, 2));
    	

    }

}