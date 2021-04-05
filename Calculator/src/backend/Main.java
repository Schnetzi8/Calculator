package backend;

import frontend.CalculatorWindow;

public class Main {

	public static void main(String[] args) {
		CalculatorWindow window = new CalculatorWindow();
		Log log = new Log();
		Calculator calculator = new Calculator(window.getCalculatorPanel(),log);

	}

}
