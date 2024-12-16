import java.util.*;

public class MaxPlusSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Length of the array
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // Input the array elements
            }

            // DP array to track scores
            int[] dp = new int[n];
            Arrays.fill(dp, 0);

            // Base case for the first element
            dp[0] = arr[0] + 1; // Coloring the first element red

            // Base case for the second element
            if (n > 1) {
                dp[1] = Math.max(dp[0], arr[1] + 1); // Choose between first and second elements
            }

            // Fill the DP array
            for (int i = 2; i < n; i++) {
                dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i] + 1); // Update the DP value
            }

            // Calculate the maximum value among red elements
            int maxRedValue = 0;
            for (int i = 0; i < n; i++) {
                if (dp[i] > 0) {
                    maxRedValue = Math.max(maxRedValue, arr[i]);
                }
            }

            // The score is max value of red elements + count of red elements
            int redCount = (dp[n - 1] - maxRedValue); // Subtract the max value to get the count
            int score = maxRedValue + redCount;

            // Output the result for the current test case
            System.out.println(score);
        }
        sc.close();
    }
}
