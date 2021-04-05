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
	
	/**
	 * @author Robin
	 * @return the sign of this operation
	 */
	public String getSign() {
		return sign;
	}
	
	/**
	 * Provides the ability to process two input numbers into one output number using the operation this instance of the {@link Operations} Enum describes
	 * @param num1 first input number
	 * @param num2 second input number
	 * @return the result of the operation.
	 * @author Robin
	 */
	public abstract double calculate(double num1, double num2);
}