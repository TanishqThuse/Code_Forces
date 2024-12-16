import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        // Loop through each test case
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt();  // Lower bound
            int r = sc.nextInt();  // Upper bound

            // Check if we can find x and y such that l <= x < y <= r and LCM(x, y) <= r
            if (2 * l <= r) {
                // We can use l and 2 * l as valid x and y
                System.out.println(l + " " + (2 * l));
            } else {
                // It's impossible to find such x and y in the given range
                System.out.println("-1 -1");
            }
        }
    }
}
