package assessments;

import java.util.*;
import java.util.stream.*;

public class FilterEvenNumbers {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

		// TODO: Use Stream API to filter even numbers from the list
		List<Integer> evenNums = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		// Expected Output: [2, 4, 6]
		System.out.println("Even Numbers: " + evenNums);
	}
}
