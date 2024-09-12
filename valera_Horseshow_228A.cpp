#include<iostream>
#include<algorithm>
using namespace std;

int main(){
    int arr[4];
    for(int i=0; i<4; i++){
        cin>>arr[i];
    }
    int n = sizeof(arr) / sizeof(arr[0]);

    // Sorting the array
    sort(arr, arr + n);
    int c=0;
    for(int i=0; i<n-1; i++){
        if(arr[i]==arr[i+1]){
            c++;
        }
    }
    cout<<c<<endl;
}