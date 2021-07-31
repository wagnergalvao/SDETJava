package br.com.wgalvao.java;

public class ComputerConstructors {

	int RAM;
	String GPU;
	String hadrDisk;
	String motherBoard;
	String processor;
	
	public ComputerConstructors() {
		System.out.println("Constructor is called!");;
	}

	public ComputerConstructors(String processorName) {
		processor = processorName;
		System.out.println("processador: " + processor);
	}

	public ComputerConstructors(int RAMAmmount) {
		RAM = RAMAmmount;
		System.out.println("RAM: " + RAM);
	}
}
