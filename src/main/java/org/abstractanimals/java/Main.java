package org.abstractanimals.java;

public class Main {

	public static void main(String[] args) {
		// Istanza e utilizzo delle sottoclassi della classe astratta Animale
		Cane jack = new Cane();
		Passerotto ryan = new Passerotto();
		Delfino jacob = new Delfino();
		Aquila smith = new Aquila();
		
	    jack.verso();
	    jack.mangia();
	    jack.dormi();
	    
	    ryan.verso();
	    ryan.mangia();
	    ryan.dormi();
	    
	    jacob.verso();
	    jacob.mangia();
	    jacob.dormi();
	    
	    smith.verso();
	    smith.mangia();
	    smith.dormi();
	    
	    // Utilizzo dei metodi faiVolare e faiNuotare
	    faiNuotare(jack);
	    faiNuotare(jacob);
	    faiVolare(ryan);
	    faiVolare(smith);
	        
	    }
	
	/**
	 * Metodo che ha come parametro un animale che estende l'interfaccia IVolante
	 * 
	 * @param animale, istanza di Animale che implementa il metodo vola
	 */
    public static void faiVolare(IVolante animale) {
    	animale.vola();	
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
