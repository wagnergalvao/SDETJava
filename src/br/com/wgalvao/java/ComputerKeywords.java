package br.com.wgalvao.java;

public class ComputerKeywords {

	protected int RAM;
	private String GPU;
	private String hadrDisk;
	private String motherBoard;
	private String processor;
	public static String type = "Digital";
	
	public ComputerKeywords() {
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
