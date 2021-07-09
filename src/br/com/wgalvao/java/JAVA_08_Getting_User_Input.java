package br.com.wgalvao.java;

import java.util.Scanner;

public class JAVA_08_Getting_User_Input {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("You need to type something: ");
		String stringInput = scanner.nextLine();
		System.out.println("User has typed: " + stringInput);

		System.out.println("You need to type number: ");
		int intInput = scanner.nextInt();
		System.out.println("User has typed: " + intInput);
}
}
