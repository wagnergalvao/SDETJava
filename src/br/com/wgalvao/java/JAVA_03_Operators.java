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
		System.out.println(" ");

		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html
		System.out.println("The Equality and Relational Operators");
		System.out.println(" ");
		System.out.println("_left : " + _left);
		System.out.println("_right: " + _right);
		System.out.println(" ");
		boolean _comparison = (_left == _right);
		System.out.println("boolean _comparison = (_left == _right): " + _comparison);
		_comparison = (_left != _right);
		System.out.println("_comparison = (_left != _right)        : " + _comparison);
		_comparison = (_left > _right);
		System.out.println("_comparison = (_left > _right)         : " + _comparison);
		_comparison = (_left >= _right);
		System.out.println("_comparison = (_left >= _right)        : " + _comparison);
		_comparison = (_left < _right);
		System.out.println("_comparison = (_left < _right)         : " + _comparison);
		_comparison = (_left <= _right);
		System.out.println("_comparison = (_left <= _right)        : " + _comparison);

		System.out.println("The Conditional Operators");
		System.out.println(" ");
		System.out.println("_left : " + _left);
		System.out.println("_right: " + _right);
		System.out.println(" ");
		System.out.println("&& Conditional-AND");
		_comparison = (_left == 5) && (_left < _right);
		System.out.println("_comparison = (_left == 5) && (_left < _right): " + _comparison);
		_comparison = (_left == 6) && (_left < _right);
		System.out.println("_comparison = (_left == 6) && (_left < _right): " + _comparison);
		System.out.println(" ");
		System.out.println("|| Conditional-OR");
		_comparison = (_left > 5) || (_right > 5);
		System.out.println("_comparison = (_left > 5) || (_right > 5): " + _comparison);
		_comparison = (_left > 6) || (_right > 6);
		System.out.println("_comparison = (_left > 6) || (_right > 6): " + _comparison);
		System.out.println(" ");
		System.out.println("ternary operator: ? Conditional-true : Conditional-false");
		boolean _useLeft = true;
		System.out.println("boolean _useLeft = true              : " + _useLeft);
		int _used = _useLeft ? _left : _right;
		System.out.println("int _used = _useLeft ? _left : _right: " + _used);
		_useLeft = false;
		System.out.println("_useLeft = true                      : " + _useLeft);
		_used = _useLeft ? _left : _right;
		System.out.println("_used = _useLeft ? _left : _right    : " + _used);
		System.out.println(" ");

		System.out.println("The Type Comparison Operator instanceof");
		System.out.println(" ");
		Parent obj1 = new Parent();
		Parent obj2 = new Child();

		System.out.println("Parent obj1 = new Parent()");
		System.out.println("Parent obj2 = new Child()");
		System.out.println(" ");
		System.out.println("obj1 instanceof Parent     : " + (obj1 instanceof Parent));
		System.out.println("obj1 instanceof Child      : " + (obj1 instanceof Child));
		System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface));
		System.out.println("obj2 instanceof Parent     : " + (obj2 instanceof Parent));
		System.out.println("obj2 instanceof Child      : " + (obj2 instanceof Child));
		System.out.println("obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface));
	}

}
