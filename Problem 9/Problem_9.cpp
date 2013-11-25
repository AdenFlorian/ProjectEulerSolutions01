// Problem_9

#include <iostream>

using namespace std;

int main() {

    int a = 0, b = 0, c = 0;

    for (int aa = 0; aa < 1000; aa ++) {

        //cout << "a: " << a << endl;

        for (int bb = 0; bb < 1000; bb++) {

            //cout << "b: " << b << endl;

            for (int cc = 0; cc < 1000; cc++) {

                //cout << "c: " << c << endl;

                if ((aa + bb + cc) == 1000) {

                        //cout << "a: " << aa << " + b: " << bb << " + c: " << cc << " = 1000" << endl;

                    if ((aa * aa) + (bb * bb) == (cc * cc)) {

                        cout << aa << " " << bb << " " << cc << endl;
                    }
                }
            }
        }
    }

    return 0;
}
