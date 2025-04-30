package assessments;

import java.util.*;
import java.util.stream.*;

public class SquareAndFilter {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(3, 5, 7, 2, 10);

		// TODO:
		// Step 1: Use Stream API to square each number
		// Step 2: Filter the squared numbers greater than 20
		// Step 3: Collect result into a list

		List<Integer> result = nums.stream().map(n -> Math.multiplyExact(n, n)).filter(greater -> greater > 20)
				.collect(Collectors.toList());

		// Expected Output: [25, 49, 100]
		System.out.println("Filtered Squares: " + result);
	}
}
