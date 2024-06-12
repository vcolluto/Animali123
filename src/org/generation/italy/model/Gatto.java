package org.generation.italy.model;

public class Gatto extends Animale {

	public Gatto(String nome, int età) {
		super(nome, età);
	}
	
	//Override: stesso nome, stessa firma, classi diverse
	//versione personalizzata del metodo faiVerso sulla classe Gatto
	//Sovrascrive il faiVerso() della classe Animale 
	@Override
	public void faiVerso() {
		System.out.println("MIAO!!");
	}
	
	//il faiVerso(int nrVolte) della classe Animale non è sovrascritto, quindi eredito quello della superclasse

}
