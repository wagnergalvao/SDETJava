package br.com.wgalvao.java;

public class Computer {
	int RAM;
	String GPU;
	String hadrDisk;
	String motherBoard;
	String processor;

	void showInfo() {
		System.out.println(
				"Este computador possui esta quantidade de RAM: " + RAM + " e o seguinte processador:" + processor);
	}

	String showSpecs() {
		return "Este computador possui esta quantidade de RAM: " + RAM + " e o seguinte processador:" + processor;
	}

	String addItem(int firstNumber, int secondNumber, String description) {
		return description + (firstNumber + secondNumber);
	}

}
