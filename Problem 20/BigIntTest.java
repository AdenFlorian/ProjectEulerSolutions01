/**
n! means n  (n  1)  ...  3  2  1

For example, 10! = 10  9  ...  3  2  1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
*/

import java.math.*;

public class BigIntTest {

	public static void main(String[] args) {


		String str = "" + 9.332622E157;
		System.out.println("str " + str);
		double bigInt = 9.332622 * Math.pow(10, 157);//E157//new BigDecimal(str);
		System.out.printf("bigInt %200f", bigInt);
	}

	//returns 100! as int
	/*private static long get100Factorial() {

		long factorial = 100L;

		for ( int i = 100 - 1; i > 0; i-- ) {
			System.out.println("factorial " + factorial);
			factorial *= i;
		}

		return factorial;
	}*/

}