#include <iostream>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        
        // Calculate the maximum number of cows
        int num_cows = n / 4;
        int remaining_legs = n - (num_cows * 4);
        
        // Calculate the number of chickens from the remaining legs
        int num_chickens = remaining_legs / 2;
        
        // Total number of animals
        int total_animals = num_cows + num_chickens;
        
        cout << total_animals << endl;
    }
    return 0;
}
