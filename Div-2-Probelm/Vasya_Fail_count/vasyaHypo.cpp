#include <iostream>
using namespace std;
 
int main() {
    int a, b, c, n;
    cin >> a >> b >> c >> n;
 
    int n1 = a - c;
    int n2 = b - c;
    int ans = n - a - b + c;
 
    if (n1 >= 0 && n2 >= 0 && c >= 0 && ans > 0 && a + b - c < n) {
        cout << ans << endl;
    } else {
        cout << -1 << endl;
    }
 
    return 0;
}

// #include<iostream>
// using namespace std;

// int main()
// {
//     int a,b,c,n;
//     cin>>a>>b>>c>>n;

//     a = a-c;
//     b = b-c;

//     int f = n - a - b - c;

//     if(f>=1){
//         cout<<f<<endl;
//     }
//     else{
//         cout<<-1<<endl;
//     }

// }