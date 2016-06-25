/**
 * 
 */
package com.dice.runner;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.dice.util.DiceRunnerTestHelperUtil;

/**
 * @author naiji
 *
 */
public class DiceRunnerTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculatePointsForNoDiceRolled() {
		List<Integer> diceValues = null;
		Integer points = DiceRunner.calculatePoints(diceValues);
		Assert.assertEquals(null, points);		
	}
	
	@Test
	public void testCalculatePoints_For_11123() {
		List<Integer> diceValues = DiceRunnerTestHelperUtil.rollFiveDice(1, 1,1,2, 2);
		Integer points = DiceRunner.calculatePoints(diceValues);
		Assert.assertEquals(null, points);		
	}
}
