package org.abstractanimals.java;

public class Passerotto extends Animale implements IVolante {

	public void verso() {
		System.out.println("Il passerotto cinguetta");
	}
	
	public void mangia() {
		System.out.println("Il passerotto mangia insetti e vegetali");
	}
	
	public void vola() {
		System.out.println("Sto volando!!!");
	}

}
