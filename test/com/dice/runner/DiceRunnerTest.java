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
	public void testCalculatePoints_For_NoDiceRolled_Exception() {
		
		List<Integer> diceValues = null;
		Integer points = DiceRunner.calculatePoints(diceValues);
		Assert.assertEquals(null, points);
	}

	@Test
	public void testCalculatePoints_For_11123() {
		
		List<Integer> diceValues = DiceRunnerTestHelperUtil.rollFiveDice(1, 1, 1, 2, 2);
		Integer points = DiceRunner.calculatePoints(diceValues);
		Assert.assertEquals(1000, points.intValue());
		
		printInput(diceValues);
		printOutput(points);
	}

	@Test
	public void testCalculatePoints_For_12345() {
		
		List<Integer> diceValues = DiceRunnerTestHelperUtil.rollFiveDice(1, 2, 3, 4, 5);
		Integer points = DiceRunner.calculatePoints(diceValues);
		Assert.assertEquals(140, points.intValue());
		
		printInput(diceValues);
		printOutput(points);
	}
	
	@Test
	public void testCalculatePoints_For_11122() {
		
		List<Integer> diceValues = DiceRunnerTestHelperUtil.rollFiveDice(1, 1, 1, 2, 2);
		Integer points = DiceRunner.calculatePoints(diceValues);
		Assert.assertEquals(1000, points.intValue());
		
		printInput(diceValues);
		printOutput(points);
	}
	
	@Test
	public void testCalculatePoints_For_54545() {
		
		List<Integer> diceValues = DiceRunnerTestHelperUtil.rollFiveDice(5, 4, 5, 4, 5);
		Integer points = DiceRunner.calculatePoints(diceValues);
		Assert.assertEquals(580, points.intValue());
		
		printInput(diceValues);
		printOutput(points);
	}
	
	@Test
	public void testCalculatePoints_For_444444() {
		
		List<Integer> diceValues = DiceRunnerTestHelperUtil.rollFiveDice(4, 4, 4, 4, 4);
		Integer points = DiceRunner.calculatePoints(diceValues);
		Assert.assertEquals(480, points.intValue());
		
		printInput(diceValues);
		printOutput(points);
	}
	
	@Test
	public void testCalculatePoints_For_15551() {
		
		List<Integer> diceValues = DiceRunnerTestHelperUtil.rollFiveDice(1, 5, 5, 5, 1);
		Integer points = DiceRunner.calculatePoints(diceValues);
		Assert.assertEquals(700, points.intValue());
		
		printInput(diceValues);
		printOutput(points);
	}
	
	@Test
	public void testRollFiveDice(){
		List<Integer> diceValues = DiceRunner.rollFiveDice();
		Assert.assertNotNull(diceValues);
		Assert.assertTrue(diceValues.size() == 5);
	}
	
	private void printInput(List<Integer> diceValues){
		System.out.println("Dice Values");
		diceValues.stream().forEach( (dice) -> {
			System.out.print(dice+" ");
		}); 		
	}
	
	private void printOutput(Integer points){
		System.out.println("Total points :"+points);
		System.out.println("***Test Done***");
	}
}
