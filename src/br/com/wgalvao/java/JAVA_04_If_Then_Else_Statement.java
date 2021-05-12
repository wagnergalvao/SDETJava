package br.com.wgalvao.java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class JAVA_04_If_Then_Else_Statement {

	public static void main(String[] args) {

		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html

		System.out.println("The if-then Statements");
		System.out.println(" ");
		String _message = "Fracassou";
		boolean _comparison = true;
		System.out.println("String _message = \"Fracassou\": " + _message);
		System.out.println("boolean _comparison = true     : " + _comparison);
		System.out.println("Sendo if (_comparison)         : " + _comparison);
		if (_comparison) {
			_message = "obteve Sucesso";
			System.out.println("_message = \"obteve Sucesso\"  : " + _message);
		}
		System.out.println("Você " + _message);
		System.out.println(" ");

		_message = "Fracassou";
		_comparison = false;
		System.out.println("String _message = \"Fracassou\": " + _message);
		System.out.println("boolean _comparison = false     : " + _comparison);
		System.out.println("Não sendo if (_comparison)      : " + _comparison);
		if (_comparison) {
			_message = "obteve Sucesso";
			System.out.println("_message = \"obteve Sucesso\"  : " + _message);
		}
		System.out.println("Você " + _message);
		System.out.println(" ");

		System.out.println("The if-then-else Statements");
		System.out.println(" ");
		Random gerador = new Random();
		int _number = gerador.nextInt(100);
		String _start = (_number%2 == 0) ? "Sendo" : "Não sendo";
		System.out.println("_number: " + _number);
		System.out.println(_start + " if (_number%2 == 0)            : " + (_number%2 == 0));
		if (_number%2 == 0) {
			_message = " par";
			System.out.println("Executa _message = \" par\" do bloco then: " + _message);
		} else {
			_message = " ímpar";
			System.out.println("Executa _message = \" ímpar\" do bloco else: " + _message);
		}
		System.out.println(" ");

		_number++;
		System.out.println("O número " + _number + " é" + _message);
		_start = (_number%2 == 0) ? "Sendo" : "Não sendo";
		System.out.println("_number: " + _number);
		System.out.println(_start + " if (_number%2 == 0)            : " + (_number%2 == 0));
		if (_number%2 == 0) {
			_message = " par";
			System.out.println("Executa _message = \" par\" do bloco then: " + _message);
		} else {
			_message = " ímpar";
			System.out.println("Executa _message = \" ímpar\" do bloco else: " + _message);
		}
		System.out.println("O número " + _number + " é" + _message);
        System.out.println(" ");
		System.out.println("The if-then-else if-else Statements");
		System.out.println(" ");
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		String _horaFormatada = formatterHora.format(agora);
		int _hora = agora.getHour();
		System.out.println("Agora são " + _horaFormatada);
		String _saudacao;

		if (_hora < 12) {
			_saudacao = "Bom dia";
			System.out.println("if(_hora < 12)         : " + (_hora < 12));
			System.out.println("_saudacao = \"Bom dia\": " + _saudacao);
		} else if (_hora < 18) {
			_saudacao = "Boa tarde";
			System.out.println("if(_hora < 12)           : " + (_hora < 12));
			System.out.println("if(_hora < 18)           : " + (_hora < 18));
			System.out.println("_saudacao = \"Boa tarde\": " + _saudacao);
		} else {
			_saudacao = "Boa noite";
			System.out.println("if(_hora < 12)           : " + (_hora < 12));
			System.out.println("if(_hora < 18)           : " + (_hora < 18));
			System.out.println("_saudacao = \"Boa noite\": " + _saudacao);
		}

	}

}
