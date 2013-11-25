#include <iostream>
#include <Windows.h>
using namespace std;

void printResult(unsigned char* arr, int length);

void regcheck () {
	HKEY key;
	if (RegOpenKeyEx(HKEY_LOCAL_MACHINE, TEXT("SOFTWARE\\Wow6432Node\\Bohemia Interactive\\Arma 3\\"), NULL, KEY_READ, &key) != ERROR_SUCCESS){
		cout << "Unable to open registry key\n";
	} else {
		cout << "Able to open registry key!\n";
		unsigned char value[128] = {'\0'};
		DWORD value_length;
		DWORD Type = REG_SZ;
		RegQueryValueEx(key, TEXT("MAIN"), NULL, &Type, value,&value_length);
		cout << "the value read from the registry is: ";
		printResult(value, value_length);
		RegCloseKey(key);
	};

}; 

void printResult(unsigned char* arr, int length) {
	for (int i = 0; i < length; i++) {
		if (i % 2 == 0) { cout << arr[i]; }
	}
}


int main() {
	regcheck();
	return 0;
};