package br.com.wgalvao.java;

public class JAVA_02_Arrays {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html

		// declares an array
		System.out.println("declares an array");
		System.out.println(" ");
		int[] anArrayOfInts = null;
		System.out.println("int[] anArrayOfInts : " + anArrayOfInts);
		System.out.println(" ");
		anArrayOfInts = new int[3];
		System.out.println("anArrayOfInts = new int[3]: " + anArrayOfInts);
		System.out.println("anArrayOfInts[0]: " + anArrayOfInts[0]);
		System.out.println("anArrayOfInts[1]: " + anArrayOfInts[1]);
		System.out.println("anArrayOfInts[2]: " + anArrayOfInts[2]);
		System.out.println(" ");
		anArrayOfInts[0] = 10;
		anArrayOfInts[1] = 1;
		anArrayOfInts[2] = 21;
		System.out.println("anArrayOfInts[0] = 10: " + anArrayOfInts[0]);
		System.out.println("anArrayOfInts[1] = 1 : " + anArrayOfInts[1]);
		System.out.println("anArrayOfInts[2] = 21: " + anArrayOfInts[2]);
		System.out.println(" ");
		int[] anArray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
		System.out.println("int[] anArray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 }: " + anArray);
		System.out.println("anArray[0]: " + anArray[0]);
		System.out.println("anArray[9]: " + anArray[9]);
		System.out.println(" ");
		byte[] anArrayOfBytes = {};
		System.out.println("byte[] anArrayOfBytes = {}: " + anArrayOfBytes);
		short[] anArrayOfShorts = {};
		System.out.println("short[] anArrayOfShorts = {}: " + anArrayOfShorts);
		long[] anArrayOfLongs = {};
		System.out.println("long[] anArrayOfLongs = {}: " + anArrayOfLongs);
		float[] anArrayOfFloats = {};
		System.out.println("long[] anArrayOfLongs = {}: " + anArrayOfFloats);
		double[] anArrayOfDoubles = {};
		System.out.println("double[] anArrayOfDoubles = {}: " + anArrayOfDoubles);
		boolean[] anArrayOfBooleans = {};
		System.out.println("boolean[] anArrayOfBooleans = {}: " + anArrayOfBooleans);
		char[] anArrayOfChars = {};
		System.out.println("char[] anArrayOfChars = {}: " + anArrayOfChars);
		String[] anArrayOfStrings = {};
		System.out.println("String[] anArrayOfStrings = {}: " + anArrayOfStrings);
		System.out.println(" ");


		// multidimensional array
		System.out.println("multidimensional array");
		String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "Jones" } };
		System.out.println("String[][] names = { { \"Mr. \", \"Mrs. \", \"Ms. \" }, { \"Smith\", \"Jones\" } }: " + names);
		System.out.println(" ");
		System.out.println("Mr. Smith");
        System.out.println("names[0][0] + names[1][0]): " + names[0][0] + names[1][0]);
		System.out.println(" ");
		System.out.println("Ms. Jones");
        System.out.println("names[0][2] + names[1][1]: " + names[0][2] + names[1][1]);
	}

}
