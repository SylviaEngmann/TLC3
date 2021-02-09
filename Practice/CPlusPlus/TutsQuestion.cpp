#include <iostream>

using namespace std;
int main () { 

  int varA = 10, *varB, **varC, ***varD;

  // store the address of varA in pointer varB
  varB = &varA;

  //address of varA
  cout << "Value of address A: " << &varA << endl;

  cout << "Value of address A From Pointer B: " << varB << endl;

  // store the address of varB in pointer varC
  varC = (&varB);
    // cout << "Value of address B From Pointer C: " << &varC << endl;
    cout << "Value of address A From Pointer C: " << *varC << endl;

  // change the value of varA, using varD point to varC which points to varB which references varA
  varD = &varC;

  cout << "Value of address A from D: " << varD << endl;

  cout << "Increasing value of A from D: " << ***(varD) + 1 << endl;

  varA = ***(varD) + 1;
  cout << "A is now: " << varA << endl;
    return 0;
}