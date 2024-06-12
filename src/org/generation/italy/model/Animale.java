package org.generation.italy.model;

public class Animale {
	//TODO: aggiungere un'altro attributo
	protected String nome;
	protected int età;
	
	
	public Animale(String nome, int età) {
		super();
		//TODO: controlli di validità 
		this.nome = nome;
		this.età = età;
	}
	
	
	public void faiVerso() {		
		System.out.println("Verso generico");
	}
	

	public void faiVerso(int nrVolte) {
		for (int i=1;i<=nrVolte;i++)
			System.out.println("Verso generico");
	}


	@Override
	public String toString() {
		return "Animale [nome=" + nome + ", età=" + età + "]";
	}
	
	
	
	
}
