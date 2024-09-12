import java.util.Arrays;
import java.util.Scanner;

public class vasya_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        // Sort the complexities
        Arrays.sort(h);

        // Determine the valid range for x
        int lowerBound = h[a - 1];
        int upperBound = h[a];

        // Calculate the number of valid x values
        int validXCount = Math.max(0, upperBound - lowerBound);

        // Print the result
        System.out.println(validXCount);

        sc.close();
    }
}
