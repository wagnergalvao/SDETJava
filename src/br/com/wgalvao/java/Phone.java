package br.com.wgalvao.java;

public class Phone extends ComputerPolymorphism {

	@Override
	public void start() {

		System.out.println("Phone started");
		
	}

	@Override
	public void showInfo() {
		
		System.out.println("Phone showInfo() called");
		
	}

}
