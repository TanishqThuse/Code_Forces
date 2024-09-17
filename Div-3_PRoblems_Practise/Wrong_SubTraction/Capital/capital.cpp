#include <stdio.h>
#include<iostream>
#include <vector>
using namespace std;

int main(){
    // vector<char> v;
    char str[100];
    cin>>str;

    if(str[0]>='a' && str[0]<='z'){
        str[0] = str[0] - 32;
    }
    cout<<str;

}