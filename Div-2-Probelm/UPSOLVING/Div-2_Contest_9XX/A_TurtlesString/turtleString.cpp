#include<iostream>
using namespace std;

int main(){
    int cases;
    cin>>cases;
    while(cases-->0){
        int n;
        cin>>n;
        string s;
        cin>>s;

        //just check if first char is not equal to the last char
        //lmao i didnt just belive it was so simplle question
        //i thought it was some kind of pattern
        //but it was just a simple question

        if(s[0] != s[n-1]){
            cout<<"YES"<<endl;
        }
        else{
            cout<<"NO"<<endl;
        }
    }
}