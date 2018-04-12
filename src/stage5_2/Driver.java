package stage5_2;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		do {
			System.out.println("Please enter the first term");
			int i1 = kb.nextInt();

			System.out.println("Please enter the second term");
			int i2 = kb.nextInt();

			System.out.println("Please enter the operator (+, -, *, /)");
			String op = kb.next();

			Calculator.Operator o = null;
			if (op.equals("+")) {
				o = Calculator.Operator.ADD;
			} else if (op.equals("-")) {
				o = Calculator.Operator.SUBTRACT;
			} else if (op.equals("*")) {
				o = Calculator.Operator.MULTIPLY;
			} else if (op.equals("/")) {
				o = Calculator.Operator.DIVIDE;
			} else {
				System.out.println("Unable to Parse");
				continue;
			}

			Calculator c = new Calculator(i1, i2, o);
			System.out.println("Result = " + c.act());

		} while (true);
		
		
	}
	


}
