#include <iostream>

using namespace std;

int main()
{
  int a ;
  int *a_ptr {&a};
  int &a_ref {a};
  const int b = 5;

  a = 5;
  (*a_ptr)++;
  cout << a << endl;
  (a_ref)++;
  cout << a << endl;

}