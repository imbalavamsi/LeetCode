package assessments;

import java.util.*;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String input = "Teeter";

		Map<Character, Integer> freq = new LinkedHashMap<>();

		for (char ch : input.toLowerCase().toCharArray()) {
			// TODO: Count frequency using getOrDefault
			freq.put(ch, freq.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				return;
			}
		}
		System.out.println("None");
		// TODO: If none found, print "None"
	}
}
