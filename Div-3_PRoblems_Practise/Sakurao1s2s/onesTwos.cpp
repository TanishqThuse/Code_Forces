#include<iostream>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int a,b;
        cin>>a>>b;
        
        //1) check if a+2*b is even
        if((a + 2*b) % 2 != 0 || a==0 /**(a%2==0 && b%2!=0) */){
            cout<<"NO"<<endl;
        }
        else{
            //fail for a=1; b=1;
            //1,1,1,2,2,2 pe fail as abs(1-2) = 1

            //1,
             if (a % 2 == 0 || b > 0) {
                cout << "YES" << endl;
            } else {
                cout << "NO" << endl;
            }
        }


        // int b1 = b/2;
        // if((b1+a)%2!=0 || a%2!=0 ){
        //     cout<<"NO"<<endl;
        // }
        // else{
        //     cout<<"YES"<<endl;
        // }
        
        // // int flag = 1;
        // if(a==0){
        //     cout<<"NO"<<endl;
        // }   //1-->2 and 2-->1
        // else if(a%2!=0 && b%2!=0){
        //     cout<<"NO"<<endl;
        // }
        // else{
        //     cout<<"YEs"<<endl;
        // }
        
    }

    return 0;    
}