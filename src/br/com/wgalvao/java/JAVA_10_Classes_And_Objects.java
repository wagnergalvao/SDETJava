package br.com.wgalvao.java;

public class JAVA_10_Classes_And_Objects {

	public static void main(String[] args) {

		Computer computer1 = new Computer();
		computer1.GPU = "NVIDIA";
		computer1.hadrDisk = "WD";
		computer1.RAM = 1024;
		computer1.motherBoard = "random name";
		computer1.processor = "Intel";

		computer1.showInfo();
		System.out.println(computer1.showSpecs());
		System.out.println(computer1.addItem(3, 4, "O resultado é "));
	}

}
