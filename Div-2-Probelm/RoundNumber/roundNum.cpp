#include <iostream>
#include <vector>
using namespace std;
 
int main() {
   int t;
   cin>>t;
   
        // int max[2];
   while(t--){
       int n;
       cin>>n;
       
       int cnt = 0;
        //  for(int i = 1; i <= 9; i++){
        //       int num = i;
        //       while(num <= n){
        //         cnt++;
        //         num = num*10 + i;
        //       }
        //  }

      for(int i = 1; i <= 9; i++){
          int num = i;
          while(num <= n){
            cnt++;
            // ohh i get it the idea used used over here is that for every increase in 10 number we get 1 more round number right
            num *= 10;
          }
      }
      cout<<cnt<<endl;
   }
 
    return 0;
}