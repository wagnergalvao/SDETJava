package br.com.wgalvao.java;

public class ComputerInterface implements Info {

	private int id = 1;

	public void start() {
		System.out.println("Computer Started");
	}

	public void showInfo() {
		System.out.println("Computer ID is: " + id);
	}
}
