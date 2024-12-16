import java.util.*;

public class max_size{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            int[] dp = new int[n];
            Arrays.fill(dp, 0);

            dp[0] = arr[0] + 1;

            if(n>1){
                dp[1] = Math.max(dp[0],arr[1] + 1);
            }

            for(int i=2; i<n; i++){
                dp[i] = Math.max(dp[i-1], dp[i-2] + arr[i] + 1);
            }
            
            System.out.println(dp[n-1]);

        }
        sc.close();
    }
}