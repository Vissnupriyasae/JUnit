/**
 * author: Priya
 */
package com.JUnit.Calc;

public class Calc {

	public static long Add(int a, int b) {
		System.out.println("HI");
		return (a + b);
	}

	public static long Sub(int a, int b) {
		System.out.println("HI");
		return (a - b);
	}

	public static long Multiply(int a, int b) {
		System.out.println("HI");
		return (a * b);
	}

	public static long Div(int a, int b) {
		System.out.println("HI");
		return (a / b);
	}

	public static void main(String args[]) {
		// Calc c = new Calc();
		Calc.Add(9, 3);
		Calc.Sub(7, 3);
		Calc.Multiply(2, 3);
		Calc.Div(8, 2);
	}
}
