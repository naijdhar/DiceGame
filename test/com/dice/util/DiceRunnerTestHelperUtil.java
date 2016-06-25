/**
 * 
 */
package com.dice.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author naiji
 *
 */
public class DiceRunnerTestHelperUtil {
	
	/**
	 * This function populates the output of 5 dice values in a list.
	 * @param firstDice
	 * @param secondDice
	 * @param thirdDice
	 * @param fourthDice
	 * @param fifthDice
	 * @return  Five dice output in a list
	 */
	public static List<Integer> rollFiveDice(int firstDice, int secondDice, int thirdDice, int fourthDice, int fifthDice) {
		List<Integer> diceOutput = new ArrayList<Integer>();
		diceOutput.add(firstDice);
		diceOutput.add(secondDice);
		diceOutput.add(thirdDice);
		diceOutput.add(fourthDice);
		diceOutput.add(fifthDice);
		
		return diceOutput;
	}

}
