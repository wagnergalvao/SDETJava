package br.com.wgalvao.java;

public class JAVA_05_For_Statement {

	public static void main(String[] args) {

		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html

		System.out.println("The for Statements");
		System.out.println(" ");
		System.out.println("Estrutura: ");
		System.out.println(" ");
		System.out.println("    for (initialization; termination; increment) {");
		System.out.println("        statement(s)");
		System.out.println("    }");
		System.out.println(" initialization: Valor inicial do loop");
		System.out.println(" termination   : Valor final do loop");
		System.out.println(" increment     : Incremento do loop");
		System.out.println(" statement(s)  : comandos que seráo executados");
		System.out.println(" ");
		System.out.println("Exemplos:");
		System.out.println("for(int i=1; i<11; i++){");
		System.out.println("    System.out.println(\"Count is: \" + i);");
		System.out.println("}");
		System.out.println(" ");
		for (int i = 1; i < 11; i++) {
			System.out.println("Count is: " + i);
		}
		System.out.println(" ");

		int[] _numbers = {43, 44, 50, 49, 47, 48, 42, 41, 46, 45}; 
		System.out.println("int[] _numbers = {43, 44, 50, 49, 47, 48, 42, 41, 46, 45}: " + _numbers);
		System.out.println(" ");
		System.out.println("for (int _item : _numbers) {");
		System.out.println("    System.out.println(\"Count is: \" + _item);");
		System.out.println("}");
		System.out.println(" ");
		for (int _item : _numbers) {
            System.out.println("Item is: " + _item);
        }
	}
}
