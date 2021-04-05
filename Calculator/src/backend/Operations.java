package backend;

/**
 * This Enum contains all possible operations a {@link Calculator} can do and provides the methods to do so.
 * @author Robin
 *
 */
public enum Operations {
	PLUS("+"){
		@Override
		public double calculate(double num1, double num2) {
			return num1 + num2;
		}
	}, 
	MINUS("-"){
		@Override
		public double calculate(double num1, double num2) {
			return num1 - num2;
		}
	}, 
	MAL("*"){
		@Override
		public double calculate(double num1, double num2) {
			return num1 * num2;
		}
	}, 
	DURCH("/"){
		@Override
		public double calculate(double num1, double num2) {
			return num1 / num2;
		}
	};	
	
	private String sign;
	private double num1;
	private double num2;
	
	private Operations(String sign) {
		this.sign = sign;
	}
	
	public abstract double calculate(double num1, double num2);
}