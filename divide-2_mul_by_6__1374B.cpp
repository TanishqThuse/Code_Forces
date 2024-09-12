#include<iostream>
#include<algorithm>
using namespace std;

int main(){
    int n;
    cin>>n;
    for(int i=0; i<n; i++){
        int b;
        cin>>b;
        // int b1 = b;
        int count = 0;
        while(b!=1){
            if(b%6==0){
                b = b/6;
                count++;
            }
            else if(b%3 == 0){
                b *= 2;
                count++;
            }
            else{
                break;
            }
        }
        if(b==1){
            cout<<count<<endl;
        }
        else{
            cout<<-1<<endl;
        }
    }
}