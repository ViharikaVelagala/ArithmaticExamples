package com.examples;

public class Arithmaticoperations {

	public int Addition(int x, int y) {
		return x + y;
	}

	public int Subtraction(int x, int y) {
		return x - y;
	}

	public int Multiplication(int x, int y) {
		return x * y;
	}

	public double Division(int x, int y) {
		return (double) x / y;
	}

	public static void main(String args[]) {
		Arithmaticoperations a1 = new Arithmaticoperations();
		int a = 20;
		int b = 2;
		System.out.println("Addition of two numbers" + a1.Addition(a, b));
		System.out.println("Subtraction of two numbers" + a1.Subtraction(a, b));
		System.out.println("Multiplication of two numbers" + a1.Multiplication(a, b));
		System.out.println("Division of two numbers" + a1.Division(a, b));

	}
}
