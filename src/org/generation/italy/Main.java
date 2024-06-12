package org.generation.italy;

import org.generation.italy.model.Animale;
import org.generation.italy.model.Cane;
import org.generation.italy.model.Cuccia;
import org.generation.italy.model.Gatto;

public class Main {

	public static void main(String[] args) {
		Animale a=new Animale("Gino", 4);
		
		Cane c=new Cane("Pino", 3);
		
		Gatto g=new Gatto("Felix",2);
		
		System.out.println(a.toString());
		a.faiVerso();
		
		a.faiVerso(5);		//overload 
		
		System.out.println(c.toString());
		c.faiVerso();		//override
		
		c.faiVerso(3);
		
		c.ringhia();
		
		System.out.println(g.toString());	//prende il toString di Animale (perché non l'ho sovrascritto)
		g.faiVerso();
		
		g.faiVerso(6);		//chiama la versione su Animale (perché in Gatto non c'è l'override di questo metodo)
	
		Cuccia miaCuccia=new Cuccia();
		
		System.out.println(miaCuccia.toString());//prende il toString di Object
		
		Animale altroAnimale;
		
		altroAnimale=new Cane("Bobby",3);		//si può fare? sì (polimorfismo sugli oggetti)
		
		System.out.println(altroAnimale.toString());		//viene chiamato quello della sottoclasse
		
		((Cane) altroAnimale).ringhia();	//il metodo ringhia() è dichiarato solo nella sottoclasse, bisogna fare il casting
	}
	
	
	
	
}
