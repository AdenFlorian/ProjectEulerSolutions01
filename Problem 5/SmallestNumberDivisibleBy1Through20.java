/**
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class SmallestNumberDivisibleBy1Through20 {

	public static void main(String[] args) {

		int num = 10;

		while (true) {

			if (isDivisible(num)) break;

			num++;
		}

		System.out.println(num);

	}

	//Is divisible by 1 - 20
	private static boolean isDivisible(int num) {

		boolean isDivisible = true;

		for (int i = 1; i <= 20; i++) {
			if (num % i != 0) {
				isDivisible = false;
				break;
			}
		}

		return isDivisible;

	}

}