package br.com.wgalvao.java;

public class JAVA_18_Polymorpism {

	public static void main(String[] args) {

		ComputerPolymorphism computer1 = new Phone();
		ComputerPolymorphism computer2 = new Laptop();
		ComputerPolymorphism computer3 = new Tablet();
		computer1.start();
		computer1.showInfo();
		computer2.start();
		computer2.showInfo();
		computer3.start();
		computer3.showInfo();
	}

}
