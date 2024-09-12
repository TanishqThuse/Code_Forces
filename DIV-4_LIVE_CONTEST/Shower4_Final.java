import java.util.*;

public class Shower4_Final {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int m = sc.nextInt();
            
            // Initial maximum free interval is from the start of the day to the first task
            int maxFreeInterval = 0;
            int previousEnd = 0;

            // Read each task interval
            for (int i = 0; i < n; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                
                // Calculate the free time interval before this task
                if (l > previousEnd) {
                    maxFreeInterval = Math.max(maxFreeInterval, l - previousEnd);
                }
                
                // Update the end time of the last task
                previousEnd = r;
            }

            // Check the free time interval after the last task
            if (m > previousEnd) {
                maxFreeInterval = Math.max(maxFreeInterval, m - previousEnd);
            }

            // Determine if there's enough time for the shower
            if (maxFreeInterval >= s) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
