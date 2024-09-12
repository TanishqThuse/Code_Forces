#include <iostream>
#include <vector>
#include <cmath>
 
using namespace std;
 
int main()
{
  int t;
  cin >> t;
 
  while (t--)
  {
    int n;
    cin >> n;
 
    vector<int> arr(n);
    for (int i = 0; i < n; i++)
    {
      cin >> arr[i];
    }
 
    long long pos = 0;
    long long rem_neg = 0;
    //ig we ust keep on doing it until we get a total bill and subyracy free trails from it
 
    for (int i = 0; i < n; i++)
    {
      if (arr[i] >= 0)
      {
        pos += arr[i];
      }
      else
      {
        long long abs_neg = abs(arr[i]);
        if (pos >= abs_neg)
        {
          pos -= abs_neg;
        }
        else
        {
          rem_neg += (abs_neg - pos);
          pos = 0;
        }
      }
    }
 
    cout << rem_neg << endl;
  }
 
  return 0;
}

// #include <iostream>
// #include <vector>
// #include <cmath>
 
// using namespace std;
 
// int main()
// {
//   int t;
//   cin >> t;
 
//   while (t--)
//   {
//     int n;
//     cin >> n;

//     vector<int> arr(n);
//     for (int i = 0; i < n; i++)
//     {
//       cin >> arr[i];
//     }


//   }



// }