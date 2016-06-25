/**
 * 
 */
package com.dice.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.dice.constant.DiceRunnerConstant;

/**
 * @author naiji
 *
 *         DiceRunner class has the logic for getting points while rolling 5
 *         dice together
 *
 */
public class DiceRunnerMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("*****Start*****");

		// Roll 5 dice
		List<Integer> diceValues = rollFiveDice();

		// Calculate total points 
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

		Integer totalPoints = null;
		List<Integer> tempPointsList = new ArrayList<Integer>(5);
		
		try{
			
			// Populate a map with key as dice value and number of occurrence as the value
			Map<Integer, Long> diceValueToOccuranceMap = (Map<Integer, Long>) diceValues.stream()
					.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
			
			// Iterate the map and find the points 
			diceValueToOccuranceMap.entrySet().stream().filter((entry) -> entry.getValue() > 0).forEach((entry) -> {
				
				if (entry.getValue() >= 3) {					
					// If 3 occurrence, get the points 
					tempPointsList.add(getPointForThreeOccurance(entry));
					
					//If more than 3 exists for 1 & 4, get the points.
					int count = (int) (entry.getValue() % DiceRunnerConstant.DICE_THREE_OCCURRENCE);
					if (count > 0 && DiceRunnerConstant.SINGLE_OCCURANCE_TO_POINTS_RULE_MAP.containsKey(entry.getKey())) {
						
						tempPointsList.add(getPointForLessThanThreeOccurance(entry, count));
					}
					
				}else if (DiceRunnerConstant.SINGLE_OCCURANCE_TO_POINTS_RULE_MAP.containsKey(entry.getKey())) {
	
					//If single entry exists for 1 & 4, get the points
					tempPointsList.add(getPointForLessThanThreeOccurance(entry, entry.getValue().intValue()));
				}
			});
			
			// get the total points
			totalPoints = getTotalPoints(tempPointsList);
			
		}catch(Exception e){
			System.out.println("No Dice Rolled. There wont be any points "+e.getMessage());	
			// If the exception occurs, totalPoints will be returned as null. 
		}
		
		return totalPoints;
	}

	/**
	 * This function finds the total points for the dice
	 * @param tempPointsList
	 * @return total points
	 */
	private static int getTotalPoints(List<Integer> tempPointsList) {
		return tempPointsList.stream().mapToInt(Integer::intValue).sum();
	}

	/**
	 * This function provides single occurrence of a dice values
	 * 
	 * @param entry
	 * @param count
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
	 * @return list of dice values for 5 dice rolls
	 */
	public static List<Integer> rollFiveDice() {
		List<Integer> diceValues = new ArrayList<Integer>(5);

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
		
		return (int) (Math.random() * DiceRunnerConstant.DICE_MAX_VALUE) 
				+ DiceRunnerConstant.DICE_MIN_VALUE;
	}
}
