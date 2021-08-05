

package exercicio.colecoes;
/* Aulas sobre o modulo de Colecoes em Java
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
public class UsaColecoes {
	public static void main(String[] args) throws Exception{
		//saudadesArray();
		
		usaArrayListObject();
		//usaArrayListGenerics();
		//usaHashSet();
		//usaHashMap();
		
	}
	
	private static void saudadesArray(){
		Personagem[] cad1 = new Personagem[3];
		// pode encher
		cad1[0] = new Personagem("Sansa Stark", 2006);
		cad1[1] = new Personagem("Joffrey Baratheon", 2005);
		cad1[2] = new Personagem("Ned Stark", 1982);
		// iria gerar uma excecao
		//cad1[3] = new Personagem("Daenerys Targaryen", 2003);
		
		//tem que gerenciar as posicoes livres
		Personagem[] cad2 = new Personagem[3];
		int i = 0;
		cad2[i++] = new Personagem("Sansa Stark", 2006);
		System.out.println("cad2");
		for (int j = 0; j < i; j++) {
			System.out.println(cad2[j].getNome());
		}
		
		//muito indicado para acessos posicionais
		System.out.println("Qual o elemento 2 em cad1?");
		System.out.println(cad1[1]);
		
		//algumas operacoes sao demoradas, como remoção
		System.out.println("cad1");
		System.out.println(Arrays.toString(cad1));//veja essa impressao que mostra todo o array
		System.out.println("removendo o elemento da posicao 1 de cad1");
		cad1[1] = null;
		int posicaoLivre = 3; //esta cheio
		for (int j = 1; j < posicaoLivre; j++) {
			if(j+1 < posicaoLivre){
				cad1[j] = cad1[j+1];
			}
		}
		posicaoLivre--;
		for (int k = 0; k < posicaoLivre; k++) {
			System.out.println(cad1[k]);
		}
	}
	
	private static void usaArrayListObject(){
		System.out.println("\nUsando arraylist com Object");
		
		//povoa a lista
		ArrayList cad2 = new ArrayList();
		cad2.add(new Personagem("Sansa Stark", 2006));
		cad2.add(new String("livia"));
		
		//imprime lista com get
		for (int i = 0; i < cad2.size(); i++) {
			Object o = cad2.get(i);
			System.out.println(o);
		}
		
		//vejam esse erro de compilacao
		//System.out.println(cad2.get(0).getNome());
		
		//assim daria certo
		Personagem p = (Personagem) cad2.get(0);
		System.out.println(p.getNome());
		
		//aqui nao daria certo; tempo de execucao
		Personagem p2 = (Personagem) cad2.get(1);
		System.out.println(p2.getNome());
	}
	
	private static void usaArrayListGenerics(){
		System.out.println("\nUsando arraylist com generics");
		//povoa lista
		ArrayList<Personagem> cad1 = new ArrayList<Personagem>();
		cad1.add(new Personagem("Sansa Stark", 2006));
		cad1.add(new Personagem("Joffrey Baratheon", 2005));
		cad1.add(new Personagem("Ned Stark", 1982));
		cad1.add(new Personagem("Daenerys Targaryen", 2003));
		cad1.add(new Personagem("Daenerys Targaryen", 2003));
		cad1.add(2, new Personagem("livia", 2000));
		//cad1.add(new String()); Nao eh valido!
		
		//imprime lista com iterator
		Iterator<Personagem> it = cad1.iterator();
		System.out.println("Iterator");
		while (it.hasNext()) {
			System.out.println(it.next());		
		}
		
		//imprime lista com for-each
		System.out.println("for-each");
		for(Personagem p: cad1){
			System.out.println(p);
		}
		System.out.println();
		//imprime lista com list-iterator
		ListIterator<Personagem> it2 = cad1.listIterator(cad1.size());
		System.out.println("List iterator");
		while(it2.hasPrevious()) {
			System.out.println(it2.previous());
		}
		
	}
	private static void usaHashMap(){
		
		
		HashMap<Personagem, String> missao = new HashMap<>();
		missao.put(new Personagem("livia", 1975), "paz mundial");
		missao.put(new Personagem("aurora", 2000), "proteger o castelo");
		missao.put(new Personagem("branca de neve", 1911), "derrotar a rainha ma");
		missao.put(new Personagem("rapunzel", 1920), "cuidar da cabeleira");
		missao.put(new Personagem("sofia", 2002), "ajudar os amiguinhos");
		missao.put(new Personagem("livia", 1976), "paz mundial 2"); //observe que será feita a substituicao do valor
		missao.put(new Personagem("ariel", 1950), "lealdade ao mar");
		
		for (Personagem pessoa : missao.keySet()) {
			System.out.println(pessoa + " " + missao.get(pessoa));
		}
		
		//imprimir o mapa inteiro
		System.out.println("Mapa inteiro\n" + missao);
	}
	
	private static void usaHashSet(){
		System.out.println("\nUsando conjuntos");
		//povoa conjunto HashSet
		HashSet<Personagem> cad1 = new HashSet<Personagem>();
		cad1.add(new Personagem("peppa pig", 2010));
		cad1.add(new Personagem("george pig", 2014));
		cad1.add(new Personagem("pedro ponei", 2010));
		cad1.add(new Personagem("suzy ovelha", 2011));
		cad1.add(new Personagem("peppa pig", 2012));
		
		//imprime conjunto direto
		Iterator<Personagem> it = cad1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());		
		}
	}
}