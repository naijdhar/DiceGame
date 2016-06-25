/**
 * 
 */
package com.dice.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author naiji
 * This class contains the constants for the DiceGame project
 */
public final class DiceRunnerConstant {

	// This map stores the points for dice value having 3 occurrence
	public static final Map<Integer, Integer> THREE_OCCURANCE_TO_POINTS_RULE_MAP = new HashMap<Integer, Integer>(6);
	static {
		//THREE_OCCURANCE_TO_POINTS_RULE_MAP.put(dice value, points);
		THREE_OCCURANCE_TO_POINTS_RULE_MAP.put(1, 1000);
		THREE_OCCURANCE_TO_POINTS_RULE_MAP.put(2, 200);
		THREE_OCCURANCE_TO_POINTS_RULE_MAP.put(3, 300);
		THREE_OCCURANCE_TO_POINTS_RULE_MAP.put(4, 400);
		THREE_OCCURANCE_TO_POINTS_RULE_MAP.put(5, 500);
		THREE_OCCURANCE_TO_POINTS_RULE_MAP.put(6, 600);
	}

	// This map stores the points for a dice value for single occurrence
	public static final Map<Integer, Integer> SINGLE_OCCURANCE_TO_POINTS_RULE_MAP = new HashMap<Integer, Integer>(2);
	static {
		//SINGLE_OCCURANCE_TO_POINTS_RULE_MAP.put(dice value, points);
		SINGLE_OCCURANCE_TO_POINTS_RULE_MAP.put(1, 100);
		SINGLE_OCCURANCE_TO_POINTS_RULE_MAP.put(4, 40);
	}
}
