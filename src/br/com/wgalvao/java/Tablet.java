package br.com.wgalvao.java;

public class Tablet extends ComputerPolymorphism {

	@Override
	public void start() {

		System.out.println("Tablet started");
		
	}

	@Override
	public void showInfo() {
		
		System.out.println("ShowInfo() for tablet is called");
		
	}

}
