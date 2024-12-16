//try -2
#include<iostream>
#include<algorithm> // for sort()
#include<vector> // for vector
using namespace std;

int main(){
    long long t;
    cin>>t;

    while(t-->0){
        long long n;
        cin>>n;

        vector<long long> v(n);
        for (int i = 0; i < n; i++)
        {
        cin >> v[i];
        }
 
    sort(v.begin(), v.end());
 
    cout << (v[n - 1] - v[0]) * (n - 1) << endl;
    }
}


// #include<iostream>
// #include<algorithm> // for sort()
// using namespace std;

// int main(){
//     long long t;
//     cin>>t;

//     while(t-->0){
//         long long n;
//         cin>>n;
//         long long a[n];

//         for(long long i=0; i<n; i++){
//             cin>>a[i];
//         }

//         //now simply find b and c;
//         long long b[n];
//         long long c[n];
        
//         // The key to maximizing the score lies in sorting the array a in descending order before you calculate b and c.
               
//         sort(a, a+n, greater<int>());

//         b[0] = a[0];
//         c[0] = a[0];

//         for(long long i=1; i<n; i++){
//             b[i] = min(b[i-1], a[i]);
//             c[i] = max(c[i-1], a[i]);
//         }

//         long long score = 0;
//         for(long long i=0; i<n; i++){
//             score += (c[i] - b[i]);
//         }
//         cout << score << endl;
//     }
// }