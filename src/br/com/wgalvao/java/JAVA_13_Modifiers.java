package br.com.wgalvao.java;

import br.com.wgalvao.java.modifiers.ComputerModifiers;

public class JAVA_13_Modifiers {

	public static void main(String[] args) {

		ComputerGetSet computer1 = new ComputerGetSet();
		computer1.RAM = 1024;
		System.out.println(computer1.getRAM());

		ComputerModifiers computer2 = new ComputerModifiers();
// invalid command
//		computer2.RAM = 1024;
		computer2.setRAM(1024);
		System.out.println(computer2.getRAM());
	}

}
