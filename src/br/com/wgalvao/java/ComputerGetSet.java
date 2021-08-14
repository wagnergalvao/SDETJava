package br.com.wgalvao.java;

public class ComputerGetSet {

	int RAM;
	String GPU;
	String hadrDisk;
	String motherBoard;
	String processor;
	
	public ComputerGetSet() {
		System.out.println("Constructor is called!");;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public String getGPU() {
		return GPU;
	}

	public void setGPU(String gPU) {
		GPU = gPU;
	}

	public String getHadrDisk() {
		return hadrDisk;
	}

	public void setHadrDisk(String hadrDisk) {
		this.hadrDisk = hadrDisk;
	}

	public String getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(String motherBoard) {
		this.motherBoard = motherBoard;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

}
