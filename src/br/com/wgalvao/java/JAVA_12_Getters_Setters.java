package br.com.wgalvao.java;

public class JAVA_12_Getters_Setters {

	public static void main(String[] args) {

		ComputerGetSet computer1 = new ComputerGetSet();
		computer1.setRAM(1024);
		System.out.println(computer1.getRAM());
		System.out.println(computer1.getGPU());
		computer1.processor = "Intel";
		System.out.println(computer1.getProcessor());
	}

}
