/**
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/

public class Find10001stPrime {

	public static void main(String[] args) {

		int num = 3, primeCount = 1;

		while (true) {
			if (isPrime(num)) {
				primeCount++;
			}

			if (primeCount == 10001) break;

			num += 2;
		}

		System.out.println("The 10001st prime is " + num);

	}

	private static boolean isPrime(int num) {

		boolean isPrime = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

}