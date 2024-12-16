    #include <iostream>
    using namespace std;

    int main() {
        int T;
        cin >> T;
        while (T--) {
            int a, b, n;
            cin >> a >> b >> n;
            int operations = 0;
            
            // Continue until either a or b exceeds n
            while (a <= n && b <= n) {
                if (a < b) {
                    a += b;  // Add smaller a to larger b
                } else {
                    b += a;  // Add smaller b to larger a
                }
                operations++;
            }
            
            // Output the number of operations
            cout << operations << endl;
        }
        return 0;
    }
