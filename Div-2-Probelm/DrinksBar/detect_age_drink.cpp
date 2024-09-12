#include<iostream>
#include <string>
#include <cctype>
using namespace std;
 
bool isInteger(const string &s)
{
  for (char c : s)
  {
    // if (!isdigit(c))
    //   return false;
    if(!(c>='0' && c<='9'))
      return false;
  }
  return true;
}

int main()
{
  int n;
  cin >> n;
 
  int cnt = 0;
 
  while (n--)
  {
    string s;
    cin >> s;
 
    if (s == "ABSINTH" || s == "BEER" || s == "BRANDY" || s == "CHAMPAGNE" ||
        s == "GIN" || s == "RUM" || s == "SAKE" || s == "TEQUILA" ||
        s == "VODKA" || s == "WHISKEY" || s == "WINE")
    {
      cnt++;
    }
    else if (isInteger(s))
    {
      int age = stoi(s);
      if (age < 18)
        cnt++;
    }
  }
 
  cout << cnt << endl;
  return 0;
}