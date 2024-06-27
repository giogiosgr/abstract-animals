package org.abstractanimals.java;

public class Aquila extends Animale implements IVolante {
	
	@Override
	public void verso() {
		System.out.println("L'aquila stride");
	}
	
	@Override
	public void mangia() {
		System.out.println("L'aquila mangia varie prede");
	}
	
	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
	}

}
