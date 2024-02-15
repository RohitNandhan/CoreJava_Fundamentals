package operator;

import java.lang.annotation.Inherited;

public class Operators {

	// Operator in Java is a symbol that is used to perform operations
}

class UnaryOperator extends Operators {
	/*
	 * require only one operand
	 * 
	 * ◦incrementing/decrementing a value by one ◦ negating an expression ◦
	 * inverting the value of a boolean
	 */
	public UnaryOperator() {
		// TODO Auto-generated constructor stub

		int x = 10;
		System.out.println("x = " + x);
		System.out.println("x++ " + x++); // 10 (11)
		System.out.println("++x " + ++x);// 12
		System.out.println("x--" + x--);// 12 (11)
		System.out.println("--x" + --x);// 10

		int a = 10;
		int b = -10;
		boolean c = true, d = false;

		System.out.println(a++ + ++a);// 10+12=22
		System.out.println(b++ + b++);// 10+11=21

		System.out.println(~b);// 9 (positive of total minus, positive starts from 0)
		System.out.println(!c);// false (opposite of boolean value)
		System.out.println(!d);// true

	}
}

class BinaryOperator extends Operators {
	// require only two operand
	public BinaryOperator() {
		// TODO Auto-generated constructor stub

	}

}

class ArithmeticOperator extends BinaryOperator {
	// basic mathematical operations

	public ArithmeticOperator() {
		// TODO Auto-generated constructor stub
		int a = 10;
		int b = 5;
		System.out.println(a + b);// 15
		System.out.println(a - b);// 5
		System.out.println(a * b);// 50
		System.out.println(a / b);// 2
		System.out.println(a % b);// 0
		System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);
	}
}

class ShiftOperator extends BinaryOperator {
	// For positive number, >> and >>> works same
	// For negative number, >>> changes parity bit (MSB) to 0
	ShiftOperator() {

		System.out.println(20 >>> 2); // 5
		System.out.println(-20 >>> 2); // 1073741819
	}

}

class LeftShiftOperator extends ShiftOperator {
	/*
	 * << is used to shift all of the bits in a value to the left side of a
	 * specified number of times
	 */
	LeftShiftOperator() {

		System.out.println(10 << 2);// 10*2^2=10*4=40
		System.out.println(10 << 3);// 10*2^3=10*8=80
		System.out.println(20 << 2);// 20*2^2=20*4=80
		System.out.println(15 << 4);// 15*2^4=15*16=240

	}
}

class RightShiftOperator extends ShiftOperator {
	/*
	 * >> is used to move the value of the left operand to right by the number of
	 * bits specified by the right operand
	 */
	RightShiftOperator() {
		System.out.println(10 >> 2);// 10/2^2=10/4=2
		System.out.println(20 >> 2);// 20/2^2=20/4=5
		System.out.println(20 >> 3);// 20/2^3=20/8=2

	}
}

class LogicalOperator extends BinaryOperator {
	public LogicalOperator() {
		// TODO Auto-generated constructor stub
		/*
		 * logical operator doesn't check the second condition if the first condition is
		 * false. It checks the second condition only if the first one is true
		 */

		/*
		 * bitwise operator checks both conditions whether first condition is true or
		 * false.
		 */

	}

}

class ANDOperator extends LogicalOperator {
	// @Inherited
	public ANDOperator() {
		// TODO Auto-generated constructor stub

		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a < b && a++ < c);// false && true = false // a=10
		System.out.println(a < b & a++ < c);// false & true = false // a=11
	}
}

class OROperator extends LogicalOperator {
	public OROperator() {
		// TODO Auto-generated constructor stub

		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a > b || a < c);// true || true = true
		System.out.println(a > b | a < c);// true | true = true
		// || vs |
		System.out.println(a > b || a++ < c);// true || true = true
		System.out.println(a);// 10 because second condition is not checked
		System.out.println(a > b | a++ < c);// true | true = true
		System.out.println(a);// 11 because second condition is checked

	}
}

class AssignmentOperator extends BinaryOperator {
	/*
	 * Java assignment operator is one of the most common operators. It is used to
	 * assign the value on its right to the operand on its left.
	 */
	public AssignmentOperator() {
		// TODO Auto-generated constructor stub
		int a = 10;
		int b = 20;
		a += 4;// a=a+4 (a=10+4)
		b -= 4;// b=b-4 (b=20-4)
		System.out.println(a);
		System.out.println(b);

	}

	public void cases() {
		short a = 10;
		short b = 10;
		a += 3;// 10+3
		a -= 4;// 13-4
		a *= 2;// 9*2
		a /= 2;// 18/2
		a = (short) (a + b);// Compile time error because 10+10=20 now int
		System.out.println(a);

	}

}

class TernaryOperator extends Operators {
	/*
	 * //It is the only conditional operator which takes three operands, one is
	 * conditional.
	 */
	public TernaryOperator() {

		int a = 2;
		int b = 5;
		int c = 10;
		int min = (a < b) ? a : b;
		int max = (b > c) ? b : c;
		System.out.println(min);
		System.out.println(max);

		//

	}
}
