#include<iostream>
using namespace std;

int main(){
    long long t;
    cin>>t;
    while(t-->0){
        long long coins , minDep;
        cin>>coins>>minDep;
        while(coins < minDep && coins>0){
            coins--;
            minDep -= 2;
        }
        cout<<coins<<endl;
    }
}