package br.com.wgalvao.java;

public class JAVA_15_AbstractClass {

	public static void main(String[] args) {
		
//		Veiculo veiculo = new Veiculo();     Cannot instantiate the type Veiculo

		Carro carro = new Carro();
		carro.setId(1);
		System.out.println("carro.setId(1)");
		System.out.println("System.out.println(carro.getId()) = " + carro.getId());
		
		Moto moto = new Moto();
		System.out.println("System.out.println(moto.getId()) = " + moto.getId());
		moto.setId(2);
		System.out.println("moto.setId(2)");
		System.out.println("System.out.println(moto.getId()) = " + moto.getId());

		System.out.println("carro.dirigir()");
		carro.dirigir();

		System.out.println("moto.dirigir()");
		moto.dirigir();

	}

}
