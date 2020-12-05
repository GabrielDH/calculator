package calculator;

public class magicCalculator extends calculatorClass{
		
	public int squareRoot(int num) {
		return(square(num));
	}
	
	public double sinOf(int num) {
		double doubleNum=num;
		doubleNum=Math.toRadians(doubleNum);
		return(Math.sin(doubleNum));
	}
	
	public double cosOf(int num) {
		double doubleNum=num;
		doubleNum=Math.toRadians(doubleNum);
		return(Math.cos(doubleNum));
	}
	
	public double tngOf(int num) {
		double doubleNum=num;
		doubleNum=Math.toRadians(doubleNum);
		return(Math.tan(doubleNum));
	}
	
	public int factorial(int num) {
		int factNum=1;
		int cont=num;
		while (cont>1) {
			factNum*=num;
			cont-=1;
			num-=1;
		}
		return(factNum);
	}
}