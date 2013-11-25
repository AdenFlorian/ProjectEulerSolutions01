import java.util.*;

public class FindLargestPalindrome3Digit {

	public static void main(String[] args) {

		//List<int> palinArrayList = new List<int>();
		int[] palinArray = new int[5064];

		int factor1, factor2, numOfPalins = 0, highest = 0;

		for (factor1 = 1; factor1 < 1000; factor1++) {
			for (factor2 = 1; factor2 < 1000; factor2++) {
				if (isPalindrome(factor1 * factor2)) {
					System.out.println(factor1 * factor2);
					palinArray[factor1 - 1] = factor1 * factor2;
					numOfPalins++;
				}
			}

		}

		for (int i : palinArray) {
			if (i > highest) {
				highest = i;
			}
		}

		System.out.println("the highest is " + highest);

	}

	private static boolean isPalindrome(int num) {
		String numStr = Integer.toString(num);
		boolean isPalindrome = true;
		int count = numStr.length() - 1;

		for (int i = 0; i < numStr.length(); i++) {
			if (numStr.charAt(i) != numStr.charAt(count)) {
				isPalindrome = false;
				break;
			}
			count--;
		}

		return isPalindrome;
	}

}