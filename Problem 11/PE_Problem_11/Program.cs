using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/**
 * What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20 by 20 grid?
 * **/

namespace PE_Problem_11 {
	class Program {

		

		static void Main(string[] args) {

			int[,] intArr = new int[20,20];

			string currentString = "";

			int greatestProduct = 0;

			int temp;

			StreamReader NumberGrid = new StreamReader("NumberGrid.txt");

			

				


			for (int r = 0; r < 20; r++) {
				for (int c = 0; c < 20; c++) {

					if ((char)NumberGrid.Peek() != ' ') {
						currentString = "";

						currentString += (char)NumberGrid.Read();
						currentString += (char)NumberGrid.Read();
						//Console.Write (currentString + ' ');
						intArr[r, c] = Int32.Parse(currentString);
					} else {
						NumberGrid.Read();

						currentString = "";

						currentString += (char)NumberGrid.Read();
						currentString += (char)NumberGrid.Read();
						//Console.Write(currentString + ' ');
						intArr[r, c] = Int32.Parse(currentString);
					}
				}
				NumberGrid.Read();
				NumberGrid.Read();
				//Console.WriteLine();
			}

			// Prints intArr
			//for (int r = 0; r < 20; r++) {
			//	for (int c = 0; c < 20; c++) {
			//		Console.Write(intArr[r,c] + "\t");
			//	}
			//	Console.WriteLine();
				
			//}


			for (int r = 0; r < 17; r++) {
				for (int c = 0; c < 20; c++) {
					temp = intArr[r, c] * intArr[r + 1, c] * intArr[r + 2, c] * intArr[r + 3, c];
					if (temp > greatestProduct) {
						greatestProduct = temp;
					}
				}
			}

			for (int r = 0; r < 20; r++) {
				for (int c = 0; c < 17; c++) {
					temp = intArr[r, c] * intArr[r, c + 1] * intArr[r, c + 2] * intArr[r, c + 3];
					if (temp > greatestProduct) {
						greatestProduct = temp;
					}
				}
			}

			for (int r = 0; r < 17; r++) {
				for (int c = 0; c < 17; c++) {
					temp = intArr[r, c] * intArr[r + 1, c + 1] * intArr[r + 2, c + 2] * intArr[r + 3, c + 3];
					if (temp > greatestProduct) {
						greatestProduct = temp;
					}
				}
			}

			for (int r = 0; r < 17; r++) {
				for (int c = 3; c < 20; c++) {
					temp = intArr[r, c] * intArr[r + 1, c - 1] * intArr[r + 2, c - 2] * intArr[r + 3, c - 3];
					if (temp > greatestProduct) {
						greatestProduct = temp;
					}
				}
			}

			Console.WriteLine("Greatest Product is " + greatestProduct);
				


			

			

		}
	}
}
