using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
using System.Numerics;

namespace PE_Problem13{

	class Program{

		static void Main(string[] args){

			// Will hold final sum
			BigInteger sum = 0;

			using (StreamReader sr = new StreamReader("numbers.txt")) {

				string line;

				while ((line = sr.ReadLine()) != null) {

					// Parses string into an int AND ADDS TO SUM
					sum += BigInteger.Parse(line);

				}

			}

			Console.WriteLine((sum.ToString()).Substring(0, 10));

		}
	}
}
