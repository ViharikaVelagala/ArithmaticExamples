package com.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmaticoperationsTest {
	Arithmaticoperations a1 = new Arithmaticoperations();

	@Test
	public void TestAddition() {
		int x = 10;
		int y = 5;

		int c = a1.Addition(x, y);
		assertEquals(15, c);
	}

	@Test
	public void TestSubtraction() {
		int x = 20;
		int y = 10;
		int c = a1.Subtraction(x, y);
		assertEquals(10, c);

	}

	@Test
	public void TestMultiplication() {
		int x = 10;
		int y = 20;
		int c = a1.Multiplication(x, y);
		assertEquals(200, c);
	}

	@Test
	public void TestDivision() {
		int x = 20;
		int y = 10;
		double c = a1.Division(x, y);
		assertEquals((double) 2, c, 0.0);
	}

}
