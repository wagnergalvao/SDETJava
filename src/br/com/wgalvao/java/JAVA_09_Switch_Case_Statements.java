package br.com.wgalvao.java;

import java.time.LocalDate;

public class JAVA_09_Switch_Case_Statements {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today + " é:");
		int dayOfWeek = today.getDayOfWeek().getValue();
		switch(dayOfWeek) {
		case 0:
			System.out.println("Domingo");
			break;
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Terça-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("Sábado");		
		}
	}
}
