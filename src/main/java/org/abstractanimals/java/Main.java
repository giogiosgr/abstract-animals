package org.abstractanimals.java;

public class Main {

	public static void main(String[] args) {
		// Istanza e utilizzo delle sottoclassi della classe astratta Animale
		Cane doge = new Cane();
		Passerotto birb = new Passerotto();
		Delfino curioso = new Delfino();
		Aquila usa = new Aquila();
		
	    doge.verso();
	    doge.mangia();
	    doge.dormi();
	    
	    birb.verso();
	    birb.mangia();
	    birb.dormi();
	    
	    curioso.verso();
	    curioso.mangia();
	    curioso.dormi();
	    
	    usa.verso();
	    usa.mangia();
	    usa.dormi();
	    
	}

}
