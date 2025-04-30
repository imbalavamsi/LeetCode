package assessments;

import java.util.*;

public class GroupByFirstLetter {

	public static void main(String[] args) {
		String[] names = { "Alice", "Arun", "Bob", "Bala", "Charlie" };

		Map<Character, List<String>> group = new HashMap<>();

		for (String name : names) {
			char key = name.charAt(0);
			// TODO: Use getOrDefault() to fetch list or create new list

//			List<String> currentList = group.getOrDefault(key, new ArrayList<>());
//			currentList.add(name);
//			group.put(key, currentList);
			group.computeIfAbsent(key, k -> new ArrayList<>()).add(name);

			// TODO: Add current name to the list and put it back
		}

		// TODO: Print grouped names like A: [Alice, Arun]
		for (Map.Entry<Character, List<String>> entry : group.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
