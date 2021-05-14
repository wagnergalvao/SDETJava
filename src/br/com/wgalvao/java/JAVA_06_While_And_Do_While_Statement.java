package br.com.wgalvao.java;

public class JAVA_06_While_And_Do_While_Statement {

	public static void main(String[] args) { 

		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html

		System.out.println("The while Statements");
		System.out.println(" ");
		System.out.println("Estrutura: ");
		System.out.println(" ");
		System.out.println("    while (expression) {");
		System.out.println("        statement(s)");
		System.out.println("    }");
		System.out.println(" expression  : Condição para execução");
		System.out.println(" statement(s): comandos que seráo executados");
		System.out.println(" ");
		System.out.println("Exemplo:");
		System.out.println(" ");
		int _count = 1;
		int _execs = 1;
		System.out.println("int count = 1: " + _count);
        while (_count < 21) {
    		System.out.println("while (count < 21) { " + _count + " < 21 : " + (_count < 21));
            System.out.println("Execução " + _execs + " : Count is: " + _count);
            _count +=2;
            _execs++;
    		System.out.println("count +=2                               : " + _count);
        }
		System.out.println(" ");
		System.out.println("The do-while Statements");
		System.out.println(" ");
		System.out.println("Estrutura: ");
		System.out.println(" ");
		System.out.println("    do {");
		System.out.println("        statement(s)");
		System.out.println("    } while (expression)");
		System.out.println(" statement(s): comandos que seráo executados");
		System.out.println(" expression  : Condição para repetição da execução");
		System.out.println(" ");
		System.out.println("Exemplo:");
		System.out.println(" ");
        _count = 1;
		_execs = 1;
		System.out.println("count = 1 : " + _count);
		System.out.println("do {      : execução incondicional");
        do {
            System.out.println("Execução " + _execs + " : Count is: " + _count);
            _count += 2;
            _execs++;
    		System.out.println("while (count < 21) { " + _count + " < 21 : " + (_count < 21));
        } while (_count < 21);	}
}
