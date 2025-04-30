package assessments;

import java.util.*;

public class SumByKeyChallenge {

	public static void main(String[] args) {
		List<String> keys = Arrays.asList("A", "B", "A", "C", "B");
		List<Integer> values = Arrays.asList(10, 5, 15, 20, 10);

		Map<String, Integer> sumMap = new HashMap<>();


		// TODO: Loop through keys and values
		for (int i = 0; i < keys.size(); i++) {
			System.out.println("i: " + i + "\tkey: " + keys.get(i) + "\tvalue: " + values.get(i));
			sumMap.putIfAbsent(keys.get(i), values.get(i));
		}
		System.out.println(sumMap);
		// TODO: Use getOrDefault() to add values for duplicate keys

		// TODO: Print final summed result in format: key: totalValue
	}
}
