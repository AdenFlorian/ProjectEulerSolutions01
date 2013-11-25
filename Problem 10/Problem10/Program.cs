using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/**
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

 * Find the sum of all the primes below two million.
 * 
 * **/

namespace Problem10 {
	class Program {
		static void Main(string[] args) {

			DateTime start = DateTime.Now;

			long answer = 2;

			int numberOfPrimes = 1;

			for (int i = 3; i < 2000000; i += 2) {
				if (isPrime(i)) {
					answer += i;
					numberOfPrimes++;
					//Console.WriteLine("Found Prime: \n" + i);
					//Console.WriteLine("answer: " + answer);
					
					
				}
				//if (i % 3333 == 0) {
				//	Console.WriteLine("Found Prime: " + i);
				//}
			}

			//// 500000 = 9932739704
			//5000 = 1548136
			//

			

			Console.WriteLine("The answer is: " + answer);

			TimeSpan finish = DateTime.Now - start;

			Console.WriteLine("The amount of time this took: " + finish);

			Console.WriteLine("Number of primes: " + numberOfPrimes);

		}

		private static bool isPrime(int num) {

			bool isPrime = true;

			for (int i = 2; i <= Math.Sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}

			return isPrime;
		}
	}
}
