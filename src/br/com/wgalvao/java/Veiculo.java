package br.com.wgalvao.java;

public abstract class Veiculo {

	private int id;
	private final String marca = "Audi";

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public abstract void dirigir();

	public final String cor() {
		return "azul";
	}
}
