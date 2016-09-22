package com.tiy;

/**
 * Created by Brett on 9/22/16.
 */
public class MakeChocolateSolver {

	public int makeChocolate(int small, int big, int goal) {

		while (goal >= 5 && big > 0) {
			goal -= 5;
			big--;
		}
		if(goal < 0) {
			return -1;
		}else if (goal <= small){
			return goal;
		}else {
			return -1;
		}


	}


}
