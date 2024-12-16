
//basically we know if the absolute value if -ve , it is player -1 and if it is positive it is Player -2 
//the only thing needed here was to find the pattern in it
 
#include<iostream>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t-->0){
        int n;
        cin>>n;
        if(n%2!=0){
            cout<<"Kosuke"<<endl;
        }
        else{
            cout<<"Sakurako"<<endl;
        }
    }
}