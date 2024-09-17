#include<iostream>
using namespace std;

int main(){
    int t;
    cin>>t;
    int flag = 0;
    while(t-->0){
        int n;
        cin>>n;
        if(n==1){
            flag= 1;
        }
    }
    if(flag==0)
    cout<<"Easy";
    else
    cout<<"HARD";
}