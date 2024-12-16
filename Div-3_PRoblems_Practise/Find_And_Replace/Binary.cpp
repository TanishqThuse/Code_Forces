#include <bits/stdc++.h>
using namespace std;
 
int main()
{
  int t;
  cin >> t;
 
  while (t--)
  {
    int n;
    cin >> n;
 
    string s;
    cin >> s;
 
    int mpp[26];
    for (int i = 0; i < 26; i++)
    {
      mpp[i] = -1;
    }
 
    bool isValid = true;
 
    for (int i = 0; i < n; i++)
    {
      int curr = (s[i] - 'a');
      if (mpp[curr] == -1)
      {
        mpp[curr] = (i % 2);
      }
      else
      {
        if (mpp[curr] != (i % 2))
        {
          isValid = false;
          break;
        }
      }
    }
 
    if (isValid)
    {
      cout << "YES" << endl;
    }
    else
    {
      cout << "NO" << endl;
    }
  }
 
  return 0;
}