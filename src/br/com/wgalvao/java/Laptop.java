package br.com.wgalvao.java;

public class Laptop extends ComputerPolymorphism {

	@Override
	public void start() {

		System.out.println("Laptop started");
		
	}

	@Override
	public void showInfo() {
		
		System.out.println("Laptop showInfo() called");
		
	}

}
