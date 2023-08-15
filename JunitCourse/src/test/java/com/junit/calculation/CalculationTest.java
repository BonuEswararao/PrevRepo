package com.junit.calculation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CalculationTest {

	private Calculation calculation;

	@BeforeEach
	public void setUp() {
		calculation = new Calculation();
	}

	@AfterEach
	public void tearDown() {
		System.out.println("Execute after Test");
	}

	@BeforeAll
	public static void beforeAll() {
		System.out.println("Execute Before All the Tests");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("Execute After All the Tests");
	}

	@Test
	@DisplayName("Multiplication of Two Values - Test1")
	public void test1() {
		assertEquals(15, calculation.multiply(5, 3));
	}

	@Test
	@DisplayName("Multiplication of Two Values - Test2")
	public void test2() {
		assertEquals(9, calculation.multiply(3, 3), "Multiplication should work");
	}

	@Test
	@DisplayName("Multiplication with Zero")
	@RepeatedTest(2)
	public void multiplywithZero() {
		assertEquals(0, calculation.multiply(8, 0));
	}

	@Test
	@DisplayName("Failure of Multiplication")
	@Disabled("Multiplication will fail")
	public void multiply() {
		assertEquals(0, calculation.multiply(8, 9));
	}

}
