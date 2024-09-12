#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main() {
    std::string a, b;
    std::cin >> a >> b;

    std::string b2 = b;  // Create a backup of string b
    std::reverse(b.begin(), b.end());  // Reverse string b

    int n = a.length();
    int c = 0;  // Counter to see if all characters of a string are correct

    // Compare reversed string b with string a
    for (int i = 0; i < n; i++) {
        if (b[i] == a[i]) {
            c++;
        }

        // Additional conditions
        if (b[i] == 's' && a[i] == 't') {
            c++;
        }

        if (b[i] == 't' && a[i] == 's') {
            c++;
        }
    }

    if (c == n) {
        std::cout << "YES" << std::endl;
    } else {
        std::cout << "NO" << std::endl;
    }

    return 0;
}
