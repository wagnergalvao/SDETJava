package br.com.wgalvao.java;

public class JAVA_01_Primitive_Data_Types {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

		// Numeric primitives
		System.out.println("Numeric primitives");
		System.out.println(" ");
		int integerNumber = 1;
		Integer integerNumberRef = 1;
		System.out.println("int integerNumber = 1       : " + integerNumber);
		System.out.println("Integer integerNumberRef = 1: " + integerNumberRef);
		System.out.println(" ");
		short shortNumber = 32767;
		Short shortNumberRef = 32767;
		System.out.println("short shortNumber = 32767   : " + shortNumber);
		System.out.println("Short shortNumberRef = 32767: " + shortNumberRef);
		System.out.println(" ");
		long longNumber = 373923;
		Long longNumberRef = 3713923L;
		System.out.println("long longNumber = 373923     : " + longNumber);
		System.out.println("Long longNumberRef = 3713923L: " + longNumberRef);
		System.out.println(" ");
		double doubleNumber = 2.7;
		Double doubleNumberRef = 2.7;
		System.out.println("double doubleNumber = 2.7   : " + doubleNumber);
		System.out.println("Double doubleNumberRef = 2.7: " + doubleNumberRef);
		System.out.println(" ");
		float floatNumber = 52.3f;
		Float floatNumberRef = 52.3f;
		System.out.println("float floatNumber = 52.3f   : " + floatNumber);
		System.out.println("Float floatNumberRef = 52.3f: " + floatNumberRef);
		System.out.println(" ");

		// Other primitives
		System.out.println("Other primitives");
		System.out.println(" ");
		char character = 'a';
		Character characterRef = 'a';
		System.out.println("char character = 'a'        : " + character);
		System.out.println("Character characterRef = 'a': " + characterRef);
		System.out.println(" ");
		boolean booleanValue = false;
		Boolean booleanValueRef = false;
		System.out.println("booleanValue = false           : " + booleanValue);
		System.out.println("Boolean booleanValueRef = false: " + booleanValueRef);
		System.out.println(" ");
		byte myByte = 120;
		Byte myByteRef = 120;
		System.out.println("byte myByte = 120   : " + myByte);
		System.out.println("Byte myByteRef = 120: " + myByteRef);
		System.out.println(" ");

		// use the underscore in numeric literals

		System.out.println("Underscore in numeric literals");
		System.out.println(" ");
		long creditCardNumber = 1234_5678_9012_3456L;
		System.out.println("long creditCardNumber = 1234_5678_9012_3456L: " + creditCardNumber);
		long socialSecurityNumber = 999_99_9999L;
		System.out.println("long socialSecurityNumber = 999_99_9999L: " + socialSecurityNumber);
		float pi = 3.14_15F;
		System.out.println("float pi = 3.14_15F: " + pi);
		long hexBytes = 0xFF_EC_DE_5E;
		System.out.println("long hexBytes = 0xFF_EC_DE_5E: " + hexBytes);
		long hexWords = 0xCAFE_BABE;
		System.out.println("long hexWords = 0xCAFE_BABE: " + hexWords);
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		System.out.println("long maxLong = 0x7fff_ffff_ffff_ffffL: " + maxLong);
		byte nybbles = 0b0010_0101;
		System.out.println("byte nybbles = 0b0010_0101: " + nybbles);
		long bytes = 0b11010010_01101001_10010100_10010010;
		System.out.println("long bytes = 0b11010010_01101001_10010100_10010010: " + bytes);

	}

}
