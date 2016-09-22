package com.tiy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Brett on 9/22/16.
 */
public class ChocolateSolverTest {

	MakeChocolateSolver solver;

	@Before
	public void setUp() throws Exception {
		solver = new MakeChocolateSolver();
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testEnoughSmallsNoBigs() throws Exception {
		int numSmalls = solver.makeChocolate(12, 0, 7);
		assertEquals(7, numSmalls);
	}
	@Test
	public void testEnoughBigsNoSmalls() throws Exception {
		int numSmalls = solver.makeChocolate(0, 2, 10);
		assertEquals(0, numSmalls);
	}

	@Test
	public void testNotEnoughSmalls() throws Exception {
		int numSmalls = solver.makeChocolate(8, 0, 10);
		assertEquals(-1, numSmalls);
	}

	@Test
	public void testNotEnoughBigs() throws Exception {
		int numSmalls = solver.makeChocolate(3, 2, 18);
		assertEquals(-1, numSmalls);
	}

	@Test
	public void testNoBigNoSmall() throws Exception {
		int numSmalls = solver.makeChocolate(0, 0, 2);
		assertEquals(-1, numSmalls);
	}

	@Test
	public void testEnoughBigEnoughSmall() throws Exception{
		int numSmalls = solver.makeChocolate(1, 1, 6);
		assertEquals(1, numSmalls);
	}

	@Test
	public void testTooManyBigTooManySmall() throws Exception {
		int numSmalls = solver.makeChocolate(4, 5, 11);
		assertEquals(1, numSmalls);
	}

	@Test
	public void testEnoughSmallTooManyBig() throws Exception{
		int numSmalls = solver.makeChocolate(2, 10, 12);
		assertEquals(2, numSmalls);
	}

	@Test
	public void testTooManySmallEnoughBig() throws Exception {
		int numSmalls = solver.makeChocolate(14, 1, 7);
		assertEquals(2, numSmalls);
	}

	@Test
	public void testNegativeSmall() throws Exception {
		int numSmalls = solver.makeChocolate(-2, 4, 3);
		assertEquals(-1, numSmalls);
	}

	@Test
	public void testNegativeBig() throws Exception {
		int numSmalls = solver.makeChocolate(3, -2, 4);
		assertEquals(-1, numSmalls);
	}

	@Test
	public void testNegativeGoal() throws Exception {
		int numSmalls = solver.makeChocolate(1, 1, -4);
		assertEquals(-1, numSmalls);
	}

	@Test
	public void testTooManyBigMeetsGoal() throws Exception {
		int numSmalls = solver.makeChocolate(4, 10, 16);
		assertEquals(1, numSmalls);
	}

	@Test
	public void testTooManyBigDoesNotMeetGoal() throws Exception {
		int numSmalls = solver.makeChocolate(4, 1, 19);
		assertEquals(-1, numSmalls);
	}

}