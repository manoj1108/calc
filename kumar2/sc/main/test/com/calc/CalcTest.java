package com.calc;

import org.junit.Assert;
import org.junit.Before;


public class CalcTest {

	Calc calc = null;

	@Before
	public void init() {
		calc = new Calc();
	}

	public void add() {

		int a = 12;
		int b = 12;

		calc = new Calc();

		int actual = (int) calc.add(a, b);

		Assert.assertEquals(25, actual);

	}

}
