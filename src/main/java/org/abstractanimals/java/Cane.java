package org.abstractanimals.java;

public class Cane extends Animale implements AnimaliNuotanti {
	
	public void verso() {
		System.out.println("Il cane abbaia");
	}
	
	public void mangia() {
		System.out.println("Il cane mangia carne e cibo per cani");
	}
	
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}


}
