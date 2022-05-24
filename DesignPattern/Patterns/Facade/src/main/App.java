package main;

import calculator.Calculator;


public class App {
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		double result = 0;
		
		result = calculator.sum(10, 50.6 ,60.4);
		System.out.println(result);
		
		result = calculator.sub(2.3, 3.4 , 5.3);
		System.out.println(result);
		
		result = calculator.mult(2, 5, 0.1);
		System.out.println(result);
		
		result = calculator.div(2, 2 , 10);
		System.out.println(result);
		
		
	}
}
