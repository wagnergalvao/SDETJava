package br.com.wgalvao.java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JAVA_04_If_Then_Else_Statement {

	public static void main(String[] args) {

		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html

		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		String _horaFormatada = formatterHora.format(agora);
		int _hora = agora.getHour();
		System.out.println("The if-then and if-then-else Statements");
		System.out.println(" ");
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
