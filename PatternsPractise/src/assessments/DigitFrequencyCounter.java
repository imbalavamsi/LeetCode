package assessments;

import java.util.*;

public class DigitFrequencyCounter {

	public static void main(String[] args) {
		String input = "771238920118292";

		Map<Character, Integer> digitCount = new TreeMap<>();

		for (char ch : input.toCharArray()) {
			// TODO
			digitCount.put(ch, digitCount.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : digitCount.entrySet()) {
			// TODO
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
