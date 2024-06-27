package org.abstractanimals.java;

public class Delfino extends Animale implements INuotante {
	
	@Override
	public void verso() {
		System.out.println("Il delfino fa vari versi");
	}
	
	@Override
	public void mangia() {
		System.out.println("Il delfino mangia varie prede");
	}
	
	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}

}
