import java.util.Scanner;

public class maxSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Length of the array
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt(); // Input array elements
            }

            // Initialize dp array
            int[] dp = new int[n];
            
            // Base cases
            dp[0] = a[0] + 1; // If we color the first element
            
            if (n > 1) {
                dp[1] = Math.max(a[0], a[1]) + 1; // Max of first or second element
            }

            // Fill the dp array
            for (int i = 2; i < n; i++) {
                dp[i] = Math.max(dp[i - 1], a[i] + 1 + dp[i - 2]);
            }

            // The result for this test case is in dp[n-1]
            System.out.println(dp[n - 1]);
        }

        scanner.close();
    }
}