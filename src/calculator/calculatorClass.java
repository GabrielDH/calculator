package calculator;
import java.lang.Math;


public class calculatorClass {

	public int add(int num1,int num2) {
		return(num1+num2);
	}
	
	public int substract(int num1,int num2) {
		return(num1-num2);
	}
	
	public int multiply(int num1,int num2) {
		return(num1*num2);
	}
	
	public int divide(int num1,int num2) {
		return(num1/num2);
	}
	
	public int square(int num1) {
		double num1Double=num1;
		return((int)Math.sqrt(num1Double));
	}
}

