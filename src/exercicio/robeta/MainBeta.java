package exercicio.robeta;

/**
 * Classe basica para ilustrar conceitos iniciais
 * de criação de classes e uso de objetos
 * @author Livia
 *
 */
public class MainBeta {
	public static void main(String[] args) {
		
		//nullpointerexception
		//RoBeta a3 = new RoBeta(30, null);
		//System.out.println(a3.exibeRobo());
		
		//a1 e a2 sao do mesmo tipo, mas, independentes
		RoBeta a1 = new RoBeta(50, new String[]{"casa",
				"comida", "roupa lavada"});
		RoBeta a2 = new RoBeta(50, new String[]{"casa",
				"comida", "roupa lavada"});
		
				System.out.println(a1.exibeRobo());
				System.out.println(a2.exibeRobo());
				System.out.println(a1.getBateria());
				a1.setBateria(60);
				System.out.println(a1.exibeRobo());
				System.out.println(a2.exibeRobo());
		/*System.out.println(a2.exibeRobo());
		System.out.println(a1.exibeRobo());
		System.out.println(a1.getBateria());
		a1.setBateria(2);
		System.out.println(a1.exibeRobo());
		System.out.println(a1.falar(1));
		System.out.println(a1.falar(0));
		System.out.println(a1.getBateria());
		System.out.println(a1.falar(0));
		System.out.println(a1.getBateria());
		
		System.out.println(a1.falar());
		*/
		}
}
