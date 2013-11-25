/**
n! means n  (n  1)  ...  3  2  1

For example, 10! = 10  9  ...  3  2  1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
*/

import java.math.*;

public class SumOfDigitsIn100Factorial {

	public static void main(String[] args) {

		int sum = 0;
		String aChar;

		//BigInteger fact = factorial(100);

		//Truns 100! into String factStr
		String factStr = factorial().toString();
		//System.out.println("get100Factorial " + get100Factorial());
		System.out.println("factStr " + factStr);
		System.out.println("factStr.length " + factStr.length());


		for ( int i = 0; i < factStr.length(); i++ ) {
			System.out.println("i " + i);
			aChar = factStr.substring( i, i + 1 );
			//System.out.println("aChar " + aChar);
			sum += Integer.parseInt(aChar);
			//System.out.println("sum " + sum);
		}

		System.out.println("The sum is " + sum);

	}

	//returns 100! as int
	private static BigInteger factorial() {

		BigInteger fact = BigInteger.ONE;

		for ( int i = 2; i <= 100; i++) {

			fact = fact.multiply(BigInteger.valueOf(i));

		}



		return fact;
	}

}