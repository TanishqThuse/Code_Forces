#include <bits/stdc++.h>
using namespace std;
 
int main() 
{
  vector<int> v(6);
  for(int i=0; i<6; i++){
    cin>>v[i];
  }
  
  int sum = 0;
  for(int i=0; i<6; i++){
    sum += v[i];
  }
  
  bool flag = false;
  
  for(int i=0; i<6; i++){
    for(int j=i+1; j<6; j++){
      for(int k=j+1; k<6; k++){
        if(v[i] + v[j] + v[k] == (sum) /2){
          flag = true;
          break;
        }
      }
    }
  }
  
  if(flag){
    cout<<"YES"<<endl;
  }
  else {
    cout<<"NO"<<endl;
  }
    return 0;
}
