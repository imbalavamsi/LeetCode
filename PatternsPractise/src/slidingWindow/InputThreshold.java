package slidingWindow;

import java.util.Scanner;

public class InputThreshold {

	public static int getK(Scanner readThreshold) {
		
		System.out.println("Enter the Threshold value");
		int k = readThreshold.nextInt();
		System.out.println("Threshold value is: "+k);
		return k; 
	}
}