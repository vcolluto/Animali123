package org.generation.italy.model;

public class Cane extends Animale {
	private boolean museruola;

	public Cane(String nome, int età) {
		super(nome, età);
		museruola=false;
	}

	//Override: stesso nome, stessa firma, classi diverse
	//versione personalizzata del metodo faiVerso sulla classe Cane
	//Sovrascrive il faiVerso() della classe Animale 
	@Override
	public void faiVerso() {		
		System.out.println("BAU!");
	}

	//Sovrascrive il faiVerso(int nrVolte) della classe Animale 
	@Override
	public void faiVerso(int nrVolte) {
		for (int i=1;i<=nrVolte;i++)
			System.out.println("BAU!");
	}

	//sovrascrive il toString() di animale
	@Override
	public String toString() {
		return "Cane [museruola=" + museruola + ", nome=" + nome + ", età=" + età + "]";
	}
	
	public void ringhia() {
		System.out.println("GRRRRR!");
	}
	
	
}
