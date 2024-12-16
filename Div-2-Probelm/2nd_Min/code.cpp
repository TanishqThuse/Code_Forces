#include <bits/stdc++.h>
using namespace std;
 
int main()
{
  int n;
  cin >> n;
 
  set<int> st;
  for (int i = 0; i < n; i++)
  {
    int x;
    cin >> x;
    st.insert(x);
  }
 
  if (st.size() < 2)
  {
    cout << "NO" << endl;
  }
  else
  {
    auto it = st.begin();
    advance(it, 1);
    cout << *it << endl;
  }
 
  return 0;
}

//Wrong answer
// #include<iostream>
// #include<algorithm>
// #include<vector> // Include vector header
// using namespace std;

// int main(){
//     int n;
//     cin>>n;

//     vector<int> a(n); // Use vector instead of array
//     for(int i=0; i <n ; i++){
//         cin>>a[i];
//     }
//     sort(a.begin(), a.end()); // Use vector's begin and end
//     int i=1;
//     while(a[i]==a[i-1]){
//         i++;
//     }
//     cout<<a[i]<<endl;
// }