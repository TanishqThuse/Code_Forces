import java.util.*;

public class Shower3_using_arr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int m = sc.nextInt();
            
            boolean[] busy = new boolean[m + 1];
            
            for (int j = 0; j < n; j++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                for (int k = l; k < r; k++) {
                    busy[k] = true;
                }
            }
            
            int maxFreeInterval = 0;
            int count = 0;
            
            for (int j = 0; j < m; j++) {
                if (!busy[j]) {
                    count++;
                } else {
                    maxFreeInterval = Math.max(maxFreeInterval, count);
                    count = 0;
                }
            }
            maxFreeInterval = Math.max(maxFreeInterval, count);
            
            if (maxFreeInterval >= s) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
