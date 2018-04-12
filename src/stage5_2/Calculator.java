package stage5_2;

public class Calculator {

	public enum Operator {
		ADD, SUBTRACT, MULTIPLY, DIVIDE
	};

	private int term1;
	private int term2;
	private Operator operator;

	public Calculator(int term1, int term2, Operator operator) {
		setTerm1(term1);
		setTerm2(term2);
		setOperator(operator);

	}

	public int act() {
		switch (operator) {
		case ADD:
			return term1 + term2;
		case SUBTRACT:
			return term1 - term2;
		case MULTIPLY:
			return term1 * term2;
		case DIVIDE:
			return term1 / term2;
		}
		System.out.println("Unexpected Operation in the operation area");
		return 0;
	}

	private void setTerm1(int term1) {
		if (term1 < 0 || term1 > 99) {
			throw new IllegalArgumentException("Term 1 must be between 0 and 99");
		}
		this.term1 = term1;
	}

	private void setTerm2(int term2) {
		if (term2 < 0 || term2 > 99) {
			throw new IllegalArgumentException("Term 2 must be between 0 and 99");
		}
		if (term2 == 0 && ((operator != null) && operator.equals(Operator.DIVIDE))) {
			throw new IllegalArgumentException("Term 2 must not be 0 to Divide");
		}
		this.term2 = term2;
	}

	public void setOperator(Operator operator) {
		if (term2 == 0 && operator.equals(Operator.DIVIDE)) {
			throw new IllegalArgumentException("Term 2 must not be 0 to Divide");
		}
		this.operator = operator;
	}

}
