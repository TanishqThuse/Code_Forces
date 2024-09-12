#include <bits/stdc++.h>
using namespace std;
 
int main() 
{
  int t;
  cin>>t;
  
  while(t--){
    int n;
    cin>>n;
    
    vector<int> v(n+1);
    for(int i=1; i<=n; i++){
      cin>>v[i];
    }
  
    bool flag = false;
    
    for(int i=1; i<=n; i++){
      if(v[i] <= i){
        flag = true;
      }
    }
    
    if(flag){
      cout<<"YES"<<endl;
    }
    else {
      cout<<"NO"<<endl;
    }
  }
    return 0;
}
