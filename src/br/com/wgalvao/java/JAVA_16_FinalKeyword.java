package br.com.wgalvao.java;

public class JAVA_16_FinalKeyword {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.setId(1);
		System.out.println("carro.setId(1)");
		System.out.println("System.out.println(carro.getId()) = " + carro.getId());
		System.out.println("System.out.println(carro.getmarca()) = " + carro.getMarca());
		
		Moto moto = new Moto();
		System.out.println("System.out.println(moto.getId()) = " + moto.getId());
		System.out.println("System.out.println(moto.getMarca()) = " + moto.getMarca());

		System.out.println("carro.dirigir()");
		carro.dirigir();
		System.out.println("System.out.println(carro.cor()) = " + carro.cor());

		System.out.println("moto.dirigir()");
		moto.dirigir();
		System.out.println("System.out.println(moto.cor()) = " + moto.cor());

	}

}
