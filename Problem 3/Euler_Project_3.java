



/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/


public class Euler_Project_3 {

	public static void main(String[] args) {

		long big = 600851475143L;

		double bigDouble = big;

		//System.out.println(big);

		//System.out.println(bigDouble);

		double bigSqrtDouble = Math.sqrt(bigDouble);

		long bigSqrt = Math.round(bigSqrtDouble) + 1;

		long x = bigSqrt;

		long i = 1;



		//System.out.println("A"+x);

		while (i < bigSqrt) {

			if (big % i == 0) {

				long factor = (big / i);

				System.out.println("factor"+factor);

				if (isPrime(factor) == true) {
					System.out.println("PRIME" + factor);
				}

			}

			//System.out.println(x);

			i++;

		}



		while (x > 0) {

			if (big % x == 0) {

				long factor = x;

				System.out.println("factor"+factor);

				if (isPrime(factor) == true) {
					System.out.println("PRIME" + factor);
				}

			}

			//System.out.println(x);

			x--;

		}



	}

	private static boolean isPrime (long factor) {

		//System.out.println(factor);

		double factorDouble = factor;

		//System.out.println(big);

		//System.out.println(bigDouble);

		double factorSqrtDouble = Math.sqrt(factorDouble);

		long factorSqrt = Math.round(factorSqrtDouble);

		long x = factorSqrt;

		//long i = 1;

		int y = 0;


		if (factor % 2 == 0) {
			y=1;
		} else {
			for (int i = 3;i < factorSqrt;i+=2) {

				//System.out.println("for"+i);

				if (factor % i == 0) {

					y += i;

				}

			}

		}

		if (y == 0) {

			return true;

		} else {

			return false;

		}

	}

}



