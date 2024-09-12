#include <bits/stdc++.h>
using namespace std;
 
int main() 
{
  int n;
  cin>>n;
  
  string s;
  
  int maxi = INT_MIN;
  
  while(cin>>s){
    int cnt = 0;
    for(int i=0; i<s.size(); i++){
      if(s[i] >= 'A' && s[i] <= 'Z'){
        cnt++;
      }
    }
    maxi = max(maxi , cnt);
  }
  
  cout<<maxi<<endl;
    return 0;
}
