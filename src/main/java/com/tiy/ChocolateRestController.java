package com.tiy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Brett on 9/22/16.
 */

@RestController
public class ChocolateRestController {

	@RequestMapping(path = "/chocolate.json", method = RequestMethod.GET)
	public ChocolateSolution solveChocolate (int small, int big, int goal) {
		ChocolateSolution solution = new ChocolateSolution();
		ChocolateSolver solver = new ChocolateSolver();
		solution = solver.makeChocolate(small, big, goal);

		return solution;


	}

}
