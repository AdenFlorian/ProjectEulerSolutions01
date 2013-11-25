// Problem 12.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
//#include <math.h>

using namespace std;


int _tmain(int argc, _TCHAR* argv[])
{

	int triNum = 1;
	int triNumIndex = 1;
	int numDivisors = 0;

	cout << triNum << endl;

	while (numDivisors < 500)
	{
		numDivisors = 0;
		triNumIndex++;
		triNum = triNum + triNumIndex;
		
		if (triNum > 10000000)
		{
			for (int i = 1; i <= sqrt(triNum); i++)
			{
				if (triNum % i == 0)
				{
					numDivisors++;
				}
			}
		}

		numDivisors *= 2;


		//cout << triNum << "    " << numDivisors <<endl;

		if (numDivisors > 100)
		{
			cout << triNum << "    " << numDivisors <<endl;
		}

	}

	cout << "Result: " << triNum << endl;


	return 0;
}

