//package slidingWindow;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class MaximumSum {
//
//	public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//		ArrayList<Integer> input = InputArray.getInput(scanner);
//		int k = InputThreshold.getK(scanner);
//		scanner.close();
//		
//        if (k > input.size()) {
//            System.out.println("Threshold value exceeds array size.");
//            return;
//        }
//		
//		int maxSum = 0;
//        int windowSum = 0;
//       
//        // Compute the sum of the first 'k' elements
//        for (int i = 0; i < k; i++) {
//            windowSum += input.get(i);
//        }
//        maxSum = windowSum;
//
//		for(int index=0;index <input.size() ;index++)
//		{
//			int sum = input.get(index);
//			for(int nav = index+1; nav < index+k && nav < input.size() ;nav++) 
//				sum=sum+input.get(nav);
//			
//			if(sum>maxSum)
//				maxSum = sum;
//			if(index + k-1 > input.size())
//				break;
//		}
//		System.out.println("Max sum value is "+maxSum);
//	}
//
//}


package slidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumSum {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> input = InputArray.getInput(scanner);
		int k = InputThreshold.getK(scanner);
		scanner.close();
		System.out.println("Max sum value is " + findMaxSum(input, k));
	}

	public static int findMaxSum(ArrayList<Integer> input, int k) {

		if (k > input.size() || input.isEmpty()) {
			return -1; // Error case
		}

		int maxSum = 0;
		int windowSum = 0;

		for (int i = 0; i < k; i++) {
			windowSum += input.get(i);
		}
		maxSum = windowSum;

		for (int i = k; i < input.size(); i++) {
			windowSum += input.get(i) - input.get(i - k);
			maxSum = Math.max(maxSum, windowSum);
		}

		return maxSum;
	}
}

