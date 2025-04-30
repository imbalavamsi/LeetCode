package assessments;

import java.util.*;

public class VoteCounter {

	public static void main(String[] args) {
		String[] votes = { "Tom", "Jerry", "Tom", "Spike", "Jerry", "Tom" };

		Map<String, Integer> voteCount = new HashMap<>();

		for (String name : votes) {
			voteCount.put(name, voteCount.getOrDefault(name, 0) + 1);
		}

		Map<String, Integer> sortedByVoteCount = sortByValueDescending(voteCount);

		for (Map.Entry<String, Integer> entry : sortedByVoteCount.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	private static Map<String, Integer> sortByValueDescending(Map<String, Integer> voteCount) {
		List<Map.Entry<String, Integer>> list = new ArrayList<>(voteCount.entrySet());

		// Sort list by value (descending)
		list.sort((a, b) -> a.getValue().compareTo(b.getValue()));

		// Maintain sorted order using LinkedHashMap
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}
}
