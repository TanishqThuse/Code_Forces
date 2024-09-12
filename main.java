import java.util.Scanner;

public class Main { // Corrected the class name to match the filename
    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static int gcd(int x, int n) {
        int gcd = 1;
        if (x == 0) {
            return gcd;
        } else {
            for (int i = 1; i <= max(x, n); i++) { // Start i from 1 to avoid division by zero
                if (i > gcd && x % i == 0 && n % i == 0) {
                    gcd = i;
                }
            }
        }
        return gcd;
    }

    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        // Initial task is to take input from Simon and Anti-Simon values
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        // Now this variable will store the greatest gcd
        int gcd = 1; // Initialized to 1

        // To find gcd of n and a && n and b
        // Create a counter with even-odd condition to identify a and b values
        int c = 0; // Assume first is Simon
        // Even ---> Simon, Odd (0 wins)
        // Odd ---> Anti-Simon is even (1 wins)
        int temp; // Temp variable to save the value first
        do {
            if (c % 2 == 0) {
                temp = gcd(a, n);
                n = n - temp;
                if (n < 0) {
                    System.out.print(0);
                    break;
                }
            } else {
                temp = gcd(b, n);
                n = n - temp;
                if (n < 0) {
                    System.out.print(1);
                    break;
                }
            }
            c++;
        } while (n >= 0);

        sc.close(); // Close the scanner
    }
}
