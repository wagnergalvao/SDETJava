package br.com.wgalvao.java;

public class JAVA_03_Operators {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html

		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
		System.out.println("The Simple Assignment Operator");
		System.out.println(" ");
		int _age = 0;
		System.out.println("int age = 0: " + _age);
		boolean _presence = true;
		System.out.println("boolean presence = true: " + _presence);
		char _letter = 'a';
		System.out.println("char _letter = 'a': " + _letter);
		String _text = "The Simple Assignment Operator";
		System.out.println("String _text = \"The Simple Assignment Operator\": " + _text);
		System.out.println(" ");

		System.out.println("The Arithmetic Operator");
		System.out.println(" ");
        int _left = 5;
		System.out.println("int _left = 5: " + _left);
        int _right = 6;
		System.out.println("int _right = 6: " + _right);
		System.out.println(" ");

        System.out.println("Addition       (_left + _right): " + (_left + _right));
        System.out.println("Substraction   (_left - _right): " + (_left - _right));
        System.out.println("Multiplication (_left * _right): " + (_left * _right));
        System.out.println("Division       (_left / _right): " + (_left / _right));
        System.out.println("Modulo         (_left % _right): " + (_left % _right));
        System.out.println("Modulo         (_right % _left): " + (_right % _left));
		System.out.println(" ");

		System.out.println("The + operator used for concatenating (joining) two strings");
		System.out.println(" ");
		String _firstString = "This is";
		System.out.println("String firstString = \"This is\": " + _firstString);
        String _secondString = " a concatenated string.";
		System.out.println("String _secondString = \" a concatenated string.\": " + _secondString);
        String _thirdString = _firstString + _secondString;
		System.out.println("String _thirdString = _firstString + _secondString: " + _thirdString);
		System.out.println(" ");

		System.out.println("The Unary Operators");
		System.out.println(" ");
        int _result = +_left;
		System.out.println("int _result = +_left: " + _result);
        _result = -_right;
		System.out.println("_result = -_right: " + _result);
		_left++;
        System.out.println("Post Increment _left++  : " + _left);
        _right--;
        System.out.println("Post Decrement _right-- : " + _right);
        ++_right;
        System.out.println("Pre Increment ++_right  : " + _right);
        --_left;
        System.out.println("Pre Decrement --_left   : " + _left);
	}

}
