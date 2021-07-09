package br.com.wgalvao.java;

public class JAVA_07_String_Object {

	public static void main(String[] args) {

		// https://www.w3schools.com/java/java_ref_string.asp
		System.out.println("The String Object");
		System.out.println(" ");
		String emptyText = new String();
		System.out.println("String emptyText = new String();: " + emptyText);
		String text = "texto";
		System.out.println("String text = \"texto\";: " + text);
		Integer number = 26;
		System.out.println("Integer number = 26;: " + number);
		text = number.toString();
		System.out.println("text = number.toString();: " + text);
		System.out.println(" ");
		System.out.println("String Methods");
		System.out.println(" ");
		String text1 = "Olá ";
		String text2 = "mundo!";
		System.out.println("String text1 = \"Olá \";: " + text1);
		System.out.println("String text2 = \"mundo!\";: " + text2);
		System.out.println(" ");
		System.out.println("String Results");
		text = text1 + text2;
		System.out.println("text = text1 + text2;: " + text);
		String stringResult = text1.concat(text2);
		System.out.println("stringResult = text1.concat(text2);: " + stringResult);
		stringResult = number.toString();
		System.out.println("stringResult = number.toString();: " + stringResult);
		stringResult = text1.toLowerCase();
		System.out.println("stringResult = text1.toLowerCase();: " + stringResult);
		stringResult = text2.toUpperCase();
		System.out.println("stringResult = text2.toUpperCase();: " + stringResult);
		System.out.println(" ");
		System.out.println("Boolean Results");
		boolean booleanResult = text.equals(text1 + text2);
		System.out.println("boolean booleanResult = text.equals(text1 + text2);: " + booleanResult);
		booleanResult = text.equals(text2 + text1);
		System.out.println("booleanResult = text.equals(text2 + text1);: " + booleanResult);
		booleanResult = text.equals(text1.concat(text2));
		System.out.println("booleanResult = text.equals(text1.concat(text2));: " + booleanResult);
		booleanResult = text.equalsIgnoreCase(text1.toLowerCase() + text2.toUpperCase());
		System.out.println(
				"booleanResult = text.equalsIgnoreCase(text1.toLowerCase() + text2.toUpperCase());: " + booleanResult);
		System.out.println(" ");
		booleanResult = text.contains(text1);
		System.out.println("booleanResult = text.contains(text1);: " + booleanResult);
		booleanResult = text.contains(number.toString());
		System.out.println("booleanResult = text.contains(number.toString());: " + booleanResult);
		System.out.println(" ");
		booleanResult = emptyText.isEmpty();
		System.out.println("booleanResult = emptyText.isEmpty();: " + booleanResult);
		booleanResult = text.isEmpty();
		System.out.println("booleanResult = text.isEmpty();: " + booleanResult);
		System.out.println(" ");
		booleanResult = text.startsWith(text1);
		System.out.println("booleanResult = text.startsWith(text1);: " + booleanResult);
		booleanResult = text.startsWith(text2);
		System.out.println("booleanResult = text.startsWith(text2);: " + booleanResult);
		System.out.println(" ");
		booleanResult = text.endsWith(text2);
		System.out.println("booleanResult = text.endsWith(text2);: " + booleanResult);
		booleanResult = text.endsWith(text1);
		System.out.println("booleanResult = text.endsWith(text1);: " + booleanResult);
	}

}
