/**
 * 
 */
package com.dice.runner;

import java.util.List;

/**
 * @author naiji
 *
 *         DiceRunner class has the logic for getting points while rolling 5
 *         dice together
 *
 */
public class DiceRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("*****Start*****");
		
		Integer points = calculatePoints(null);
		
		System.out.println("Total points :"+points);
		
		System.out.println("*****End*****");
	}
	
	/**
	 * @param diceValues
	 * @return total points
	 */
	public static Integer calculatePoints(List<Integer> diceValues) {
		Integer points = null;

		return points;
	}

}