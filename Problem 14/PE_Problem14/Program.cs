using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PE_Problem14 {

	class Program {

		static void Main(string[] args) {

			UInt64 curNum;
			UInt64 count;
			UInt64 highestCount = 0;
			UInt64 bestStartNumber = 0;

			for (UInt64 i = 2; i < 1000000; i++) {

				//Console.WriteLine(i);

				curNum = i;

				count = 0;

				do {

					count++;

					// If even
					if (curNum % 2 == 0) {
						curNum = curNum / 2;
					} else {
						curNum = (curNum * 3) + 1;
					}

				} while (curNum != 1);

				if (count > highestCount) {
					highestCount = count;
					bestStartNumber = i;
					Console.WriteLine("   " + highestCount);
				}

			}

			Console.WriteLine("Highest number of terms: " + highestCount + " at number " + bestStartNumber);


		}
	}
}
