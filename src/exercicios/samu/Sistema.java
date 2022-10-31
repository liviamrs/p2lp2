package exercicios.samu;
/*
 * + Samu()


+ criarTema(nome:str,idTema:int):void
+ cadastrarAjudaTema(idTema:int,idAjuda:int):void
+ contarAjudasTema(idTema:int):int
+ exibirTema(idTema:int):str
 */
public class Sistema {
    private int contadorAjudas;
    private int contadorTemas;
    private Ajuda[] ajudas;
    private Tema[] temas;
    
    public Sistema() {
    	ajudas = new Ajuda[100];
    	temas = new Tema[10];
    }
    
    public int criarAjuda(String descricao, String nome){
    	Ajuda a = new Ajuda(descricao, nome, contadorAjudas);
    	ajudas[contadorAjudas] = a;
    	return contadorAjudas++;
    }

    public void apoiarAjuda(int idAjuda){
    	ajudas[idAjuda].incrementaApoio();
    }

    public String exibirAjuda(int idAjuda){
    	return ajudas[idAjuda].toString();
    }

    public void criarMensagemApoio(int idAjuda, String descricao, String autor){
    	ajudas[idAjuda].adicionaMensagem(descricao, autor);
    }
    
    public String listarMensagens(int idAjuda){
    	return ajudas[idAjuda].exibirMensagens();
    }

    public void criarTema(String nome, int id){
    	Tema t = new Tema(nome, id);
    	temas[contadorTemas++] = t;//atencao para gerencia de arraycheio
    }
    
    public void adicionarAjudaTema(int idAjuda, int idTema){
    	Tema t = localizarTema(idTema);
    	if(t == null)//tema nao existe
    		return;
    	
    	Ajuda a = ajudas[idAjuda];
    	t.adicionaAjuda(a);

    }
    public int contarAjudasTema(int idTema) {
    	Tema t = localizarTema(idTema);
    	if(t == null)//tema nao existe;
    		return 0;
    	
    	return t.contarAjudas();
    }
    
    public String exibirTema(int idTema) {
    	Tema t = localizarTema(idTema);
    	if(t == null){//tema nao existe;
    		return "";
    	}
    	return t.toString();
    }
    
    private Tema localizarTema(int idTema) {
    	//poderia tambem retorna o indice do tema no array
    	for(Tema t:temas) {
    		if(t.getId() == idTema) {
    			return t;
    		}
    	}
    	return null;
    }
    public static void main(String[] args) {
		Sistema s = new Sistema();
		System.out.println(s.criarAjuda("cafecafecafe", "prof anonimo"));
		System.out.println(s.criarAjuda("trocar a cor do eclipse", "matheus g"));
		System.out.println(s.exibirAjuda(0));
		s.apoiarAjuda(0);
		System.out.println(s.exibirAjuda(0));
		System.out.println(s.listarMensagens(0));
		s.criarMensagemApoio(0, "vamos la!", "livia");
		System.out.println(s.listarMensagens(0));
		s.criarTema("p2", 42);
		s.adicionarAjudaTema(0,42);
	}

}