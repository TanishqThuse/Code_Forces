#include<iostream>
using namespace std;

int main(){
    
    int t;
    cin>>t;
    int x = 0;
    while(t-->0){
        // char s[3];
        // cin>>s;
        string s;
        cin>>s;
        for(int i=0; i<3; i++){
            if(s[i]=='+'){
                x++;
                break;
            }
            else if(s[i]=='-'){
                x--; break;
            }
        }
    }
        cout<<x<<endl;

    return 0;

}