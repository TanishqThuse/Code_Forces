#include<iostream>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int a[n];
        for(int i=0 ; i<n ; i++){
            cin>>a[i];
        }
        //if sum%2==0 && n(for even)%2 == 0 then it is possible
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            sum += a[i];
        }
        int c= 0;
        for(int i=0 ; i<n ; i++){
            if(a[i]%2==0){
                c++;
            }
        }
        if(sum%2==0 && c%2==0){
            cout<<"YES"<<endl;
        }  
        else{
            cout<<"NO"<<endl;
        }



    }
}