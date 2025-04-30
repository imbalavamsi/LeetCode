package assessments;

import java.util.*;

public class LetterFrequencyCounter {

	public static void main(String[] args) {
		String input = "My name is Bala vamsi. I am a Software Developer";

		Map<Character, Integer> letterCount = new TreeMap<>();

		for (char ch : input.toLowerCase().toCharArray()) {
			// TODO
			if(Character.isLetter(ch)) {
				letterCount.put(ch, letterCount.getOrDefault(ch, 0) + 1);
				
			}
		}

		for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
