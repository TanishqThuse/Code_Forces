import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initial task is to take input from Simon and Anti-Simon values
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        // To find gcd of a and n && b and n
        int gcd_a_n = gcd(a, n);
        int gcd_b_n = gcd(b, n);

        // Create a counter with even-odd condition to identify a and b values
        int c = 0; // Assume first is Simon

        // Simulate the game
        while (n > 0) {
            if (c % 2 == 0) {
                int stonesToTake = gcd(a, n);
                n -= stonesToTake;

                if (n < 0) {
                    System.out.println(1); // Antisimon wins
                    break;
                }
            } else {
                int stonesToTake = gcd(b, n);
                n -= stonesToTake;

                if (n < 0) {
                    System.out.println(0); // Simon wins
                    break;
                }
            }

            c++;
        }

        sc.close(); // Close the scanner
    }
}
