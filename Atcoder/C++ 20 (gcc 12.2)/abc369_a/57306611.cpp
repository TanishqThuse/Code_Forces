#include<iostream>
using namespace std;

int main() {
    
    //Observations
    /**
     * 1)x=2A−B ==> x is first term
     * 2)x=(A+B) / 2 ==> x is second term && A and B are even
     * 3)x=2B-A ==> x is third term
     */
    
    int A, B;
    cin>>A>>B;

    int diff = abs(A - B);
    int lowerDiff = min(A,B)-diff;
    int uppDiff = max(A,B)+diff;
    int c=0; //since both of them will anyways be counted ==> Edit : Invalid cases

    for(int i=lowerDiff; i<=uppDiff; i++){
        if(i==(2*A-B) || (i==(A+B)/2 && ((A+B) % 2 == 0)) || i==(2*B-A)){
            c++;
        }
    }
    cout<<c<<endl;
    return 0;
}