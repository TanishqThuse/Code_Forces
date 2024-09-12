#include<iostream>
using namespace std;

int main(){

    string s;
    cin >> s;
    
    int sum = 0;
    
    for(int i = 0; i < s.size(); i++){
        if(s[i] == 'a'){
            sum++;
        }
    }
    
    int maxLength = min((int)s.size(), 2 * sum - 1);
    
    cout << maxLength << endl;
    return 0;
}