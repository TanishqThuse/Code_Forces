#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;

    int a = 1;
    int b = 1;
    //231%2 == 0 ==> true
    //1 2 233-3
    if((n-2) % 3 == 0){
        a = 2;
        b = 1;
    }
    int c = n - a - b; //233-2-1 = 230
    cout<<a<<" "<<b<<" "<<c<<endl;

}