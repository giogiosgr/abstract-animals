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
	    
	    // Utilizzo dei metodi faiVolare e faiNuotare
	    faiNuotare(doge);
	    faiNuotare(curioso);
	    faiVolare(birb);
	    faiVolare(usa);
	        
	    }
	
	/**
	 * Metodo che ha come parametro un animale che estende l'interfaccia IVolante
	 * 
	 * @param animale, istanza di Animale che implementa il metodo vola
	 */
    public static void faiVolare(Animale animale) {
    	animale.dormi();	
    }
    
    /**
	 * Metodo che ha come parametro un animale che estende l'interfaccia INuotante
	 * 
	 * @param animale, istanza di Animale che implementa il metodo nuota
	 */ 
    public static void faiNuotare(INuotante animale) {
    	animale.nuota();	
    }

}
