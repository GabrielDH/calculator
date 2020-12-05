package calculator;

import java.util.Scanner;

public class calculator {
	
	
	public static void main(String[] args) {
				
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter integer 1 to calculate Square root and Factorial(!)");
		String stringInt1=userInput.nextLine();
		int num1=Integer.parseInt(stringInt1);
		magicCalculator localCalc=new magicCalculator();
		//Calculating Square root
		System.out.println("Your Square root:");
		System.out.println("/// Sqrt("+num1+")="+localCalc.squareRoot(num1));
		System.out.println("Your Factorial:");
		System.out.println("/// "+num1+"!="+localCalc.factorial(num1));
		System.out.println("Please enter number to find sin(), cos(), and tng()");
		String stringTrigon=userInput.nextLine();
		int trigon=Integer.parseInt(stringTrigon);
		System.out.println("/// Sin("+trigon+")="+localCalc.sinOf(trigon));
		System.out.println("/// Cos("+trigon+")="+localCalc.cosOf(trigon));
		System.out.println("/// Tng("+trigon+")="+localCalc.tngOf(trigon));
		
		
		
	}


}
