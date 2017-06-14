/**
 * author: Priya
 */
package com.JUnit.Testcase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.JUnit.Calc.*;

public class TestCase {

	@BeforeClass

	public static void setupBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@Before
	public void setup() throws Exception {
		System.out.println("Before");
	}

	@Test
	public void addtest() {
		System.out.println("Addition Testing");
		Assert.assertEquals(12, Calc.Add(9, 3));
	}

	@Test
	public void subtest() {
		System.out.println("Subtraction Testing");
		Assert.assertEquals(4, Calc.Sub(7, 3));
	}

	@Test
	public void multest() {
		System.out.println("Multiply Testing");
		Assert.assertEquals(6, Calc.Multiply(2, 3));
	}

	@Test
	public void divtest() {
		System.out.println("Division Testing");
		Assert.assertEquals(4, Calc.Div(8, 2));
	}

	@After
	public void setupAfter() throws Exception {
		System.out.println("After");
	}

	@AfterClass
	public static void setupAfterClass() throws Exception {
		System.out.println("After Class");
	}
}
