#include <iostream>
#include <string.h>

using namespace std;

int main()
{
  char words[200];
  cout << "Enter a hyphen separated group of words" << endl;
  cin.get(words,200);

  char delimeter[10] = "-";
  char *token;

  token = strtok(words,delimeter);

  while(words)
  {
    cout << token << endl;
    token = strtok(NULL, delimeter);
  }

}