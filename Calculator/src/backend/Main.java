package backend;

import frontend.CalculatorWindow;

public class Main {
	
	/**
	 * The Main Method
	 * @author Kerim, Oliver, Robin
	 * @param args
	 */
	public static void main(String[] args) {
		CalculatorWindow window = new CalculatorWindow();
		Log log = new Log(window.getLogPanel(), window.getAusgabeLeeren(), new OutputFile("output"));
		Calculator calculator = new Calculator(window.getCalculatorPanel(),log);

	}

}
