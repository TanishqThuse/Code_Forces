#include<iostream>
using namespace std;

int main(){
     long long t;
  cin>>t;
  
  while(t--){
    long long n;
    cin>>n;

    long long cnt = 0;

    if(n <= 9){
      cout<<n<<endl;
    }
    else{
        // for(long i=1; i<=9; i++){
            for(long long i=1; i<=9; i++){
                long long num = i;
                while(num <= n){
                    cnt++;
                    num = (num * 10) + i;
                }
                }
            cout<<cnt<<endl;
        }
    }


  }


//TLE !! obviously not eficeint
// #include <iostream>
// #include <string>
// using namespace std;

// // Function to check if a number is "ordinary"
// bool isOrdinary(int num) {
//     string s = to_string(num);
//     char firstDigit = s[0];
    
//     for (char c : s) {
//         if (c != firstDigit) {
//             return false; // If any digit is different, it's not ordinary
//         }
//     }
//     return true; // All digits are the same
// }

// int main() {
//     int t;
//     cin >> t; // Number of test cases
    
//     while (t--) {
//         int n;
//         cin >> n; // Input number for this test case
        
//         int count = 0; // Counter for ordinary numbers
        
//         // Check every number from 1 to n
//         for (int i = 1; i <= n; i++) {
//             if (isOrdinary(i)) {
//                 count++; // Increment count if the number is ordinary
//             }
//         }
        
//         cout << count << endl; // Output the count for this test case
//     }
    
//     return 0;
// }
