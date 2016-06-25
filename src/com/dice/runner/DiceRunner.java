/**
 * 
 */
package com.dice.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import com.dice.constant.DiceRunnerConstant;

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

		// Roll 5 dice
		List<Integer> diceValues = rollFiveDice();
		
		Integer points = calculatePoints(diceValues);

		System.out.println("Total points :" + points);

		System.out.println("*****End*****");
	}

	/**
	 * This function accepts the rolled dice values in a list as input. After
	 * applying the dice rules, this method returns the total points 5 dice
	 * rolled.
	 * 
	 * @param diceValues
	 * @return total points
	 */
	public static Integer calculatePoints(List<Integer> diceValues) {

		Integer points = null;

		return points;
	}

	/**
	 * This function provides single occurrence of a dice values
	 * 
	 * @param
	 * @return points for single occurrence of a dice value
	 */
	private static int getPointForLessThanThreeOccurance(Entry<Integer, Long> entry, int count) {

		return count * DiceRunnerConstant.SINGLE_OCCURANCE_TO_POINTS_RULE_MAP.get(entry.getKey());
	}

	/**
	 * This function provides 3 occurrence of a dice values
	 * 
	 * @param entry
	 * @return points for 3 occurrence of a dice value
	 */
	private static int getPointForThreeOccurance(Entry<Integer, Long> entry) {

		return DiceRunnerConstant.THREE_OCCURANCE_TO_POINTS_RULE_MAP.get(entry.getKey()).intValue();
	}

	/**
	 * This function provides the dice values of 5 dice rolls.
	 * 
	 * @param
	 * @return list of dice values for 5 dice rolls
	 */
	public static List<Integer> rollFiveDice() {
		List<Integer> diceValues = new ArrayList<Integer>();

		// Roll dice 5 times
		int dice1 = rollDice();
		int dice2 = rollDice();
		int dice3 = rollDice();
		int dice4 = rollDice();
		int dice5 = rollDice();

		// Print dive values
		System.out.println(dice1 + "::" + dice2 + "::" + dice3 + "::" + dice4 + "::" + dice5);

		// Add the dice values
		diceValues.add(dice1);
		diceValues.add(dice2);
		diceValues.add(dice3);
		diceValues.add(dice4);
		diceValues.add(dice5);

		return diceValues;
	}

	/**
	 * This function returns the dice value for a single roll.
	 * 
	 * @return dice value
	 */
	private static int rollDice() {
		return (int) (Math.random() * 6) + 1;
	}
}
