package com.getmaximumArray.getArray;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GetMaximumArrayTest {

	private GetmaximumArray maxarray;

	@Before
	public void setUp() throws Exception {
		maxarray = new GetmaximumArray();

	}

	@After
	public void tearDown() throws Exception {
		maxarray = null;

	}

	@Test
	public void testMaxArray() {

		assertEquals(125, maxarray.getMaximum(new int[] { 5, 8, 9, 15, 24, 99, 3 }));
	}
}
