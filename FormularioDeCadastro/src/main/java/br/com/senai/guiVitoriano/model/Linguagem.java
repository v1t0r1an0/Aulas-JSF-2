package br.com.senai.guiVitoriano.model;

public class Linguagem {
	
	private Integer id;
	private String  nome;
	
	public static final Linguagem[] LINGUAGENS; //Constante -> modificador final cria uma constante - sempre utiliza-se letra mai�scula
	
	//static -> o static inicia na primeira chamada da classe Linguagem
	static {
		
		LINGUAGENS = new Linguagem[5];
		
		LINGUAGENS[0] = new Linguagem(1, "Java");
		LINGUAGENS[1] = new Linguagem(2, "IOS");
		LINGUAGENS[2] = new Linguagem(3, "C++");
		LINGUAGENS[3] = new Linguagem(4, "C#");
		LINGUAGENS[4] = new Linguagem(5, "PHP");
		
	}
	
	public Linguagem(Integer id, String nome) {
		
		this.id = id;
		this.nome = nome;
		
	}
	
}
